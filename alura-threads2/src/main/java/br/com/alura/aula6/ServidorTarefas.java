package br.com.alura.aula6;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicBoolean;

public class ServidorTarefas {
	
	private ServerSocket servidor;
	private ExecutorService threadPool;
	//private volatile boolean isRunning;//Desabilita os caches de cada thread
	private AtomicBoolean isRunning;

	public ServidorTarefas() throws IOException {
		System.out.println("--- Iniciando Servidor ---");
		this.servidor = new ServerSocket(12345);
		this.threadPool = Executors.newFixedThreadPool(4, new FabricaDeThreads());//newCachedThreadPool();
		this.isRunning = new AtomicBoolean(true);
	}
	
	public void rodar() throws IOException{
		while(isRunning.get()){
			try {
				Socket socket = servidor.accept();
				System.out.println("Aceitando novo cliente na porta " + socket.getPort());			
				DistribuirTarefas distribuirTarefas = new DistribuirTarefas(threadPool,socket,this);			
				threadPool.execute(distribuirTarefas);
			} catch (SocketException e) {
				System.out.println("SocketException, Esta Rodando? " + this.isRunning);
			}			
		}
	}
	
	public void parar() throws IOException{
		System.out.println("--- Finalizando Servidor ---");
		this.isRunning.set(false);
		this.servidor.close();
		this.threadPool.shutdown();
	}
	
	public static void main(String[] args) throws IOException, InterruptedException {
		ServidorTarefas servidor = new ServidorTarefas();
		servidor.rodar();
		servidor.parar();
	}

}
