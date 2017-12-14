package br.com.alura.aula7;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

class Tarefa implements Callable<String>{

	@Override
	public String call() throws Exception {
		Thread.sleep(10000);
		return "SUCESSO";
	}
	
}

public class TestaFutureTask {

	public static void main(String[] args) {
		try {
			System.out.println("--- Inicio FutureTask ---");
			Callable<String> tarefa = new Tarefa(); //Tarefa implementa Callable
			FutureTask<String> futureTask = new FutureTask<String>(tarefa);
			new Thread(futureTask).start(); //usando Thread puro!!            
			String resultado = futureTask.get();
			System.out.println("Status: " + resultado);
			System.out.println("--- Fim FutureTask ---");
		} catch (InterruptedException | ExecutionException e) {
			System.out.println("Timeout");
		}

	}

}
