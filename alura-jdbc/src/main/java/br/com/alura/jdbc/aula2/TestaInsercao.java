package br.com.alura.jdbc.aula2;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class TestaInsercao {
	public static void main(String[] args) throws SQLException {
		Connection connection = Database.getConnection();
		
		Statement statement = connection.createStatement();
		
		boolean resultado = statement.execute("INSERT INTO Produto (nome,descricao) VALUES ('Notebook','Notebook i5')",Statement.RETURN_GENERATED_KEYS);
		System.out.println(resultado?"Resultado: "+ resultado +" - Statment Devolveu Resultado":"Resultado: "+ resultado +" - Statement Nao Devolveu Resultado, ou seja, so executou o comando.");
		
		ResultSet resultSet = statement.getGeneratedKeys();
		while(resultSet.next()){
			String id = resultSet.getString("id");
			System.out.println("ID Gerado: " + id);
		}
		statement.close();
		connection.close();
	}
}
