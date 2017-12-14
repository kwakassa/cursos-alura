package br.com.alura.aula2;

import java.net.Socket;
import java.util.Scanner;

public class DistribuirTarefas implements Runnable {
	
	private Socket socket;

	public DistribuirTarefas(Socket socket) {
		this.socket = socket;
		// TODO Auto-generated constructor stub
	}

	public void run() {
		try {
			System.out.println("Distribuindo tarefas para " + socket);
			
			Scanner entradaCliente = new Scanner(socket.getInputStream());
			
			while(entradaCliente.hasNextLine()){
				String comando = entradaCliente.nextLine();
				System.out.println("Comando: " + comando);
			}
			entradaCliente.close();
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

}
