package br.com.alura.aula7;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketException;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicBoolean;

public class ServidorTarefas {
	
	private ServerSocket servidor;
	private ExecutorService threadPool;
	//private volatile boolean isRunning;//Desabilita os caches de cada thread
	private AtomicBoolean isRunning;
	private BlockingQueue<String> filaComandos;

	public ServidorTarefas() throws IOException {
		System.out.println("--- Iniciando Servidor ---");
		this.servidor = new ServerSocket(12345);
		this.threadPool = Executors.newCachedThreadPool(new FabricaDeThreads());//newCachedThreadPool();
		this.isRunning = new AtomicBoolean(true);
		this.filaComandos = new ArrayBlockingQueue<>(2);
		iniciarConsumidores();
	}
	
	private void iniciarConsumidores() {
		for (int i = 0; i < 2; i++) {
			TarefaConsumir tarefa = new TarefaConsumir(filaComandos);
			this.threadPool.execute(tarefa);
		}
		
	}

	public void rodar() throws IOException{
		while(isRunning.get()){
			try {
				Socket socket = servidor.accept();
				System.out.println("Aceitando novo cliente na porta " + socket.getPort());			
				DistribuirTarefas distribuirTarefas = new DistribuirTarefas(threadPool, filaComandos, socket,this);			
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
