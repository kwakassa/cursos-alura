package br.com.alura.jdbc.aula3;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class TestaConexao {
	/* Subir o Servidor com o Comando que consta no arquivo comandos-hsqldb.txt */
	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		//Class.forName("org.hsqldb.jdbc.JDBCDriver");
		//DriverManager.registerDriver(new org.hsqldb.jdbc.JDBCDriver());
		/* Caso a URL esteja errada mostrara o erro "No suitable driver found", porem nao significa que nao estaja encontrando o Driver 
		 * Verificar se a dependencia esta OK ou se a URL estaja correta */
		Connection connection = DriverManager.getConnection("jdbc:hsqldb:hsql://localhost/loja-virtual","SA","");//
		System.out.println("Abrindo uma conexao com sucesso");
		connection.close();
	}

}
