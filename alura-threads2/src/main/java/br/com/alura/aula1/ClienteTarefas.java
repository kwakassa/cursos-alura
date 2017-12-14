package br.com.alura.aula1;

import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class ClienteTarefas {

	public static void main(String[] args) throws UnknownHostException, IOException {
		Socket socket = new Socket("127.0.0.1", 12345);
		System.out.println("Conexao estabelecida.");
		Scanner teclado = new Scanner(System.in);
		
		teclado.nextLine();
		
		socket.close();
	}

}
