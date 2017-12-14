package br.com.alura.jdbc.aula7;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class ProdutosDAO {

	private Connection connection;

	public ProdutosDAO(Connection con) {
		this.connection = con;
	}
	
	public void salva(Produto produto) throws SQLException {
		String sql = "INSERT INTO Produto (nome,descricao) VALUES (?,?)";
		try(PreparedStatement stmt = connection.prepareStatement(sql,Statement.RETURN_GENERATED_KEYS)){
			stmt.setString(1, produto.getNome());
			stmt.setString(2, produto.getDescricao());
			stmt.execute();
			try(ResultSet rs = stmt.getGeneratedKeys()){
				if(rs.next()){
					int id = rs.getInt("id");
					produto.setId(id);
				}
			}
		}
	}

	public List<Produto> lista() throws SQLException {
		List<Produto> produtos = new ArrayList<>();
		String sql = "SELECT * FROM PRODUTO";
		try(PreparedStatement stmt = connection.prepareStatement(sql)){
			stmt.execute();
			transformaResultadoEmProdutos(produtos, stmt);
		}
		return produtos;
	}

	private void transformaResultadoEmProdutos(List<Produto> produtos, PreparedStatement stmt) throws SQLException {
		try(ResultSet rs = stmt.getResultSet()){
			while(rs.next()){
				int id = rs.getInt("id");
				String nome = rs.getString("nome");
				String descricao = rs.getString("descricao");
				Produto produto = new Produto(nome, descricao);
				produto.setId(id);
				produtos.add(produto);
			}
		}
	}

	public List<Produto> busca(Categoria categoria) throws SQLException {
		List<Produto> produtos = new ArrayList<>();
		String sql = "SELECT * FROM Produto WHERE categoria_id = ?";
		try(PreparedStatement stmt = connection.prepareStatement(sql)){
			stmt.setInt(1, categoria.getId());
			stmt.execute();
			transformaResultadoEmProdutos(produtos, stmt);
		}
		return produtos;
	}
}
