package br.com.alura.aula2.extra;

import java.util.Set;

class TarefaSleep implements Runnable{
	public void run() {
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {		
			e.printStackTrace();
		}		
	}	
}

public class MostraThreadsDaJVM {

	public static void main(String[] args) {
		/* --- Inicia 3 Threads --- */
		new Thread(new TarefaSleep(),"Thread do Joao").start();
		new Thread(new TarefaSleep(),"Thread do Mario").start();
		new Thread(new TarefaSleep(),"Thread do Jose").start();
		
		/* --- Mostra Todas as Threads --- */ 
		Set<Thread> todasAsThreads = Thread.getAllStackTraces().keySet();
		for (Thread thread : todasAsThreads) {
			System.out.println(thread.getName());
		}
		
		/* Mostra a Qtd de Processadores*/
		Runtime runtime = Runtime.getRuntime();
		int qtdProcessadores = runtime.availableProcessors();
		System.out.println("Qtd de Processadores: " + qtdProcessadores);
	}

}
