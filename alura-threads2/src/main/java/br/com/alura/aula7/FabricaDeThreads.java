package br.com.alura.aula7;

import java.util.concurrent.ThreadFactory;

public class FabricaDeThreads implements ThreadFactory {
	
	private static int numero = 1;
	
	@Override
	public Thread newThread(Runnable r) {
		Thread thread = new Thread(r,"Thread Servidor Tarefa " + numero++);
		thread.setUncaughtExceptionHandler(new TratadorDeExcecao());
		return thread;
	}

}
