package br.com.alura.jdbc.aula5;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class TestaInsercao {
	private static int auxError = 0;
	public static void main(String[] args) throws SQLException {

		try(Connection connection = new ConnectionPool().getConnectionPool()){
			connection.setAutoCommit(false);		
			String sql = "INSERT INTO Produto (nome,descricao) VALUES (?,?)";
			try(PreparedStatement statement = connection.prepareStatement(sql,Statement.RETURN_GENERATED_KEYS)){
				adiciona("TV LCD", "32 Pologadas", statement);
				adiciona("Blueray", "Full HDMI", statement);
				connection.commit();
				statement.close();
			}catch (Exception e) {
				e.printStackTrace();
				connection.rollback();
				System.out.println("Rollback efetuado");
			}
		}
		
		
	}

	private static void adiciona(String nome, String descricao, PreparedStatement statement) throws SQLException {
		if(auxError>=1){
			throw new RuntimeException("Problema Ocorrido");
		}
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
		auxError++;
	}
}
