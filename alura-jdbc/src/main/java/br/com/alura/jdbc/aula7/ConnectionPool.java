package br.com.alura.jdbc.aula7;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import javax.sql.DataSource;

import org.hsqldb.jdbc.JDBCPool;

public class ConnectionPool {
	
	private DataSource dataSource;

	public ConnectionPool() throws SQLException {
		JDBCPool pool = new JDBCPool();
		pool.setUrl("jdbc:hsqldb:hsql://localhost/loja-virtual");
		pool.setUser("SA");
		pool.setPassword("");
		pool.setLoginTimeout(2);//Nao Funciona
		this.dataSource = pool;
	}
	
	public Connection getConnectionDemorado() throws SQLException {
		Connection connection = DriverManager.getConnection("jdbc:hsqldb:hsql://localhost/loja-virtual", "SA", "");
		//Connection connection = dataSource.getConnection();
		return connection;
	}
	
	public Connection getConnectionPool() throws SQLException {
		//Connection connection = DriverManager.getConnection("jdbc:hsqldb:hsql://localhost/loja-virtual", "SA", "");
		Connection connection = dataSource.getConnection();
		return connection;
	}
}
