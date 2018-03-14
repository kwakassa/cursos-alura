package br.com.edu.helper;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.persistence.EntityManager;

import br.com.caelum.livraria.modelo.Usuario;

public class InsereUsuarioMain {
	public static void main(String[] args) throws SQLException {
		System.out.println("---- INICIO ----");

		Usuario usuario = new Usuario();
		usuario.setLogin("admin");
		usuario.setSenha("");

		Connection con = DriverManager.getConnection("jdbc:h2:tcp://localhost/livraria", "admin", "pass");
		boolean temUsuario = false;
		String sql_pesquisa = "SELECT * FROM USUARIO WHERE LOGIN = ?";
		try (PreparedStatement stmt = con.prepareStatement(sql_pesquisa)) {
			stmt.setString(1, usuario.getLogin());
			stmt.execute();
			try (ResultSet rs = stmt.getResultSet()) {
				if (rs.next()) {
					temUsuario = true;
				}
				System.out.println(temUsuario);
			}
		}
		if (!temUsuario) {
			String sql_insert = "INSERT INTO USUARIO (login,senha) VALUES (?,?)";

			try (PreparedStatement stmt = con.prepareStatement(sql_insert, Statement.RETURN_GENERATED_KEYS)) {
				stmt.setString(1, usuario.getLogin());
				stmt.setString(2, usuario.getSenha());
				stmt.execute();
				try (ResultSet rs = stmt.getGeneratedKeys()) {
					if (rs.next()) {
						int id = rs.getInt("ID");
						usuario.setId(id);
						System.out.println("Inserido " + usuario.getLogin() + " com ID " + usuario.getId());
					}
				}
			}
		}
		con.close();
		System.out.println("---- FIM ----");
	}
}
