package br.com.alura.jdbc.extra;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class TestaExecute_DDL_DML {
	
	private static String queryDropTableProduto = "DROP TABLE PRODUTO";
	private static String queryDropTableCategoria = "DROP TABLE CATEGORIA";
	private static String queryCreateTableProduto = "CREATE TABLE Produto (id INTEGER GENERATED BY DEFAULT AS IDENTITY PRIMARY KEY, nome VARCHAR(255), descricao VARCHAR(255))";
	private static String queryInsertProduto1 = "INSERT INTO Produto VALUES (1,'Geladeira','Geladeira 2 portas')";
	private static String queryInsertProduto2 = "INSERT INTO Produto VALUES (2,'Ferro de passar','Ferro de passar roupa com vaporizador')";
	private static String queryInsertProduto3 = "INSERT INTO Produto (nome,descricao) VALUES ('Notebook','NoteBook i5')";
	private static String queryInsertProduto4 = "INSERT INTO Produto (nome,descricao) VALUES ('Mesa Azul','Mesa com 4 pés')";
	private static String queryInsertProduto5 = "INSERT INTO Produto (nome,descricao) VALUES ('Mesa Vermelha','Mesa com 4 pés')";
	private static String queryCreateTableCategoria = "CREATE TABLE Categoria (id INTEGER GENERATED BY DEFAULT AS IDENTITY PRIMARY KEY, nome VARCHAR(255))";
	private static String queryAlterTableProdutoAddCategoria = "alter TABLE Produto ADD COLUMN categoria_id INTEGER";
	private static String queryInsertCategoria1 = "INSERT INTO Categoria (nome) VALUES ('Eletrodoméstico')";
	private static String queryInsertCategoria2 = "INSERT INTO Categoria (nome) VALUES ('Eletrônico')";
	private static String queryInsertCategoria3 = "INSERT INTO Categoria (nome) VALUES ('Móvel')";
	private static String queryUpdateProduto1_Categoria = "UPDATE Produto set categoria_id = 0 where id in (1,2)";
	private static String queryUpdateProduto2_Categoria = "UPDATE Produto set categoria_id = 1 where id in (3)";
	private static String queryUpdateProduto3_Categoria = "UPDATE Produto set categoria_id = 2 where id in (4,5)";
	
	private static Connection getConnection() throws SQLException {
		Connection connection = DriverManager.getConnection("jdbc:hsqldb:hsql://localhost/loja-virtual", "SA", "");
		return connection;
	}
	
	public static void bdParaAulas1a6() throws SQLException{
		Connection connection = getConnection();
		System.out.println("--- Inicio Drop Table Produto ---");
		Statement statement = connection.createStatement();
		
		statement.execute(queryDropTableProduto);
		System.out.println("Tabela Produto Deletada com sucesso");
		
		statement.execute(queryDropTableCategoria);
		System.out.println("Tabela Categoria Deletada com sucesso");
		
		statement.execute(queryCreateTableProduto);
		System.out.println("Tabela Produto criada com sucesso");
		
		statement.execute(queryInsertProduto1);
		System.out.println("Produto 1 inserido com sucesso");
		
		statement.execute(queryInsertProduto2);
		System.out.println("Produto 2 inserido com sucesso");
		
	}
	
	public static void bdParaAula7() throws SQLException{
		Connection connection = getConnection();
		System.out.println("--- Inicio Drop Table Produto ---");
		Statement statement = connection.createStatement();
		
		statement.execute(queryDropTableProduto);
		System.out.println("Tabela Produto Deletada com sucesso");
		
		statement.execute(queryDropTableCategoria);
		System.out.println("Tabela Categoria Deletada com sucesso");
		
		statement.execute(queryCreateTableProduto);
		System.out.println("Tabela Produto criada com sucesso");
		
		statement.execute(queryInsertProduto1);
		System.out.println("Produto 1 inserido com sucesso");
		
		statement.execute(queryInsertProduto2);
		System.out.println("Produto 2 inserido com sucesso");
		
		statement.execute(queryInsertProduto3);
		System.out.println("Produto 3 inserido com sucesso");
		
		statement.execute(queryInsertProduto4);
		System.out.println("Produto 4 inserido com sucesso");
		
		statement.execute(queryInsertProduto5);
		System.out.println("Produto 5 inserido com sucesso");
		
		statement.execute(queryCreateTableCategoria);
		System.out.println("Tabela Categoria criada com sucesso");
		
		statement.execute(queryAlterTableProdutoAddCategoria);
		System.out.println("Coluna Categoria acrescentada na tabela Produto");
		
		statement.execute(queryInsertCategoria1);
		System.out.println("Categoria 1 inserida com sucesso");
		
		statement.execute(queryInsertCategoria2);
		System.out.println("Categoria 2 inserida com sucesso");
		
		statement.execute(queryInsertCategoria3);
		System.out.println("Categoria 3 inserida com sucesso");
		
		statement.execute(queryUpdateProduto1_Categoria);
		System.out.println("Produtos 1 e 2 alterados com sucesso");
		
		statement.execute(queryUpdateProduto2_Categoria);
		System.out.println("Produtos 3 alterados com sucesso");
		
		statement.execute(queryUpdateProduto3_Categoria);
		System.out.println("Produtos 4 e 5 alterados com sucesso");
	}
	
	public static void main(String[] args) throws SQLException {
		//bdParaAulas1a6();
		bdParaAula7();		
	}
}
