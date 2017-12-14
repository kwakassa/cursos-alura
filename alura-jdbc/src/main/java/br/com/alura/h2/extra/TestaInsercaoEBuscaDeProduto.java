package br.com.alura.h2.extra;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

public class TestaInsercaoEBuscaDeProduto {
	public static void main(String[] args) throws SQLException {
		Produto mesa = new Produto("Mesa Azul", "Mesa com 4 pés");
		try(Connection con = new ConnectionPool().getConnectionPool()){
			ProdutosDAO dao = new ProdutosDAO(con);
			dao.salva(mesa);
			
			System.out.println("A mesa foi inserida com sucesso: " + mesa);
			
			List<Produto> produtos = dao.lista();
			
			for (Produto produto : produtos) {
				System.out.println("Existe o produto: " + produto);
			}
		}
	}
}
