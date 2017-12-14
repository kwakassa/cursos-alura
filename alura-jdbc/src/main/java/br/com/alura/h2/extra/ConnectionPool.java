package br.com.alura.h2.extra;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import javax.sql.DataSource;

import org.h2.jdbcx.JdbcConnectionPool;

public class ConnectionPool {
	
	private DataSource dataSource;

	public ConnectionPool() throws SQLException {
		JdbcConnectionPool pool = JdbcConnectionPool.create("jdbc:h2:tcp://localhost/loja-virtual", "admin", "");
		this.dataSource = pool;
	}
	
	public Connection getConnectionDemorado() throws SQLException {
		Connection connection = DriverManager.getConnection("jdbc:h2:tcp://localhost/loja-virtual", "admin", "");
		//Connection connection = dataSource.getConnection();
		return connection;
	}
	
	public Connection getConnectionPool() throws SQLException {
		//Connection connection = DriverManager.getConnection("jdbc:hsqldb:hsql://localhost/loja-virtual", "SA", "");
		Connection connection = dataSource.getConnection();
		return connection;
	}
}
