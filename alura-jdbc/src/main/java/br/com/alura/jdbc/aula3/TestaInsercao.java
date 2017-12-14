package br.com.alura.jdbc.aula3;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class TestaInsercao {
	public static void main(String[] args) throws SQLException {
		String nome = "Notebook'i5";
		String descricao = "Notebook i5";
		
		Connection connection = Database.getConnection();
		
		String sql = "INSERT INTO Produto (nome,descricao) VALUES (?,?)";
		PreparedStatement statement = connection.prepareStatement(sql,Statement.RETURN_GENERATED_KEYS);
		statement.setString(1, nome);
		statement.setString(2, descricao);
		boolean resultado = statement.execute();
		System.out.println(resultado?"Resultado: "+ resultado +" - Statment Devolveu Resultado":"Resultado: "+ resultado +" - Statement Nao Devolveu Resultado, ou seja, so executou o comando.");
		
		ResultSet resultSet = statement.getGeneratedKeys();
		while(resultSet.next()){
			String id = resultSet.getString("id");
			System.out.println("ID Gerado: " + id);
		}
		
		resultSet.close();
		statement.close();
		connection.close();
	}
}
