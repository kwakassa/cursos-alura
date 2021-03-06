package br.com.alura.aula1;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class ServidorTarefas {

	public static void main(String[] args) throws IOException, InterruptedException {
		ServerSocket servidor = new ServerSocket(12345);
		System.out.println("--- Iniciando Servidor ---");
		
		while(true){
			Socket socket = servidor.accept();
			System.out.println("Aceitando novo cliente na porta " + socket.getPort());
			
			DistribuirTarefas distribuirTarefas = new DistribuirTarefas(socket);
			Thread threadCliente = new Thread(distribuirTarefas);
			threadCliente.start();
		}
		//System.out.println("--- Servidor Finalizado---");
	}

}
