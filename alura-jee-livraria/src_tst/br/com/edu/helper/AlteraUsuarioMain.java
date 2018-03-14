package br.com.edu.helper;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.persistence.EntityManager;

import br.com.caelum.livraria.modelo.Usuario;

public class AlteraUsuarioMain {
	public static void main(String[] args) throws SQLException {
		System.out.println("---- INICIO ----");

		Usuario usuario = new Usuario();
		usuario.setLogin("admin");
		usuario.setSenha("pass");

		Connection con = DriverManager.getConnection("jdbc:h2:tcp://localhost/livraria", "admin", "");
		String sql_update = "UPDATE USUARIO SET SENHA = ? WHERE LOGIN = ?";

		try (PreparedStatement stmt = con.prepareStatement(sql_update)) {
			stmt.setString(1, usuario.getSenha());
			stmt.setString(2, usuario.getLogin());
			stmt.execute();
			System.out.println("UPDATE executado");

		}

		con.close();
		System.out.println("---- FIM ----");
	}
}
