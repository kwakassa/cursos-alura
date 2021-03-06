package br.com.alura.aula3;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ServidorTarefas {

	public static void main(String[] args) throws IOException, InterruptedException {
		ServerSocket servidor = new ServerSocket(12345);
		System.out.println("--- Iniciando Servidor ---");
		
		ExecutorService threadPool = Executors.newCachedThreadPool();
		
		while(true){
			Socket socket = servidor.accept();
			System.out.println("Aceitando novo cliente na porta " + socket.getPort());
			
			DistribuirTarefas distribuirTarefas = new DistribuirTarefas(socket);
			
			threadPool.execute(distribuirTarefas);
			
		}
		//System.out.println("--- Servidor Finalizado---");
	}

}
