package br.com.alura.jdbc.aula7;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

public class TestaCategorias {
	
	//Executar
	public static void main(String[] args) throws SQLException {
		try(Connection con = new ConnectionPool().getConnectionPool()){
			List<Categoria> categorias = new CategoriasDAO(con).listaComProdutos();
			for (Categoria categoria : categorias) {
				System.out.println();
				System.out.println(categoria);
				for (Produto produto : categoria.getProdutos()) {
					System.out.println(categoria.getNome() + " - " + produto.getNome());
				}
			}
		}
	}

}
