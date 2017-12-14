package br.com.alura.h2.extra;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/* Subir o Servidor com o Comando que consta no arquivo comandos-hsqldb.txt */
public class TestaListagem {
	public static void main(String[] args) throws SQLException {
		Connection connection = new ConnectionPool().getConnectionPool();

		Statement statement = connection.createStatement();
		boolean resultado = statement.execute("select * from Produto");
		ResultSet resultSet = statement.getResultSet();

		while (resultSet.next()) {
			/* Por padrao o ponteiro da lista de resultados nao aponta para o
			 * primeiro, ew necessario realizar o next para que o ponteiro seja posicionado
			 * para o 1o elemento */
			String id = resultSet.getString("id");
			System.out.println(id);
			String nome = resultSet.getString("nome");
			System.out.println(nome);
			String descricao = resultSet.getString("descricao");
			System.out.println(descricao);
		}
		resultSet.close();
		statement.close();
		connection.close();
	}

}
