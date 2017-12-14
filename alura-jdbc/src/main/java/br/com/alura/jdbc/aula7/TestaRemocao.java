package br.com.alura.jdbc.aula7;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class TestaRemocao {

	public static void main(String[] args) throws SQLException {
		Connection connection = new ConnectionPool().getConnectionPool();
		Statement statement = connection.createStatement();
		boolean resultado = statement.execute("DELETE FROM Produto WHERE Id > 3");
		System.out.println(resultado?"Resultado: "+ resultado +" - Statment Devolveu Resultado":"Resultado: "+ resultado +" - Statement Nao Devolveu Resultado, ou seja, so executou o comando.");
		int updateCount = statement.getUpdateCount();
		System.out.println("Qtd de Linhas removidas: " + updateCount);
		
		statement.close();
		connection.close();
	}

}
