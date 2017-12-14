package br.com.alura.aula2;

import java.io.IOException;
import java.io.PrintStream;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class ClienteTarefas {

	public static void main(String[] args) throws UnknownHostException, IOException {
		Socket socket = new Socket("127.0.0.1", 12345);
		System.out.println("Conexao estabelecida.");
		
		PrintStream saida = new PrintStream(socket.getOutputStream());
		saida.println("c1");
		
		Scanner teclado = new Scanner(System.in);		
		teclado.nextLine();
		
		saida.close();
		teclado.close();
		socket.close();
	}

}
