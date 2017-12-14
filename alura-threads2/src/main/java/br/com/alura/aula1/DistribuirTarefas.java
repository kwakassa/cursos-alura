package br.com.alura.aula1;

import java.net.Socket;

public class DistribuirTarefas implements Runnable {
	
	private Socket socket;

	public DistribuirTarefas(Socket socket) {
		this.socket = socket;
		// TODO Auto-generated constructor stub
	}

	public void run() {
		try {
			System.out.println("Distribuindo tarefas para " + socket);
			Thread.sleep(20000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
	}

}
