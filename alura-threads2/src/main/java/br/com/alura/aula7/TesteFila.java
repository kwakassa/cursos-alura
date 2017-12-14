package br.com.alura.aula7;

import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class TesteFila {

	public static void exemploQueue() {
		Queue<String> fila = new LinkedList<>();

		fila.offer("c1");
		fila.offer("c2");
		fila.offer("c3");

		System.out.println("Size: " + fila.size());
		System.out.println("Pool: " + fila.poll());
		System.out.println("Pool: " + fila.poll());
		System.out.println("Pool: " + fila.poll());
		System.out.println("Size: " + fila.size());
	}
	
	
	public static void exemploBlockingQueue() throws InterruptedException{
		BlockingQueue<String> fila = new ArrayBlockingQueue<>(3);
		
		fila.put("c1");
		fila.put("c2");
		fila.put("c3");
		fila.put("c4");

		System.out.println("Size: " + fila.size());
		System.out.println("Pool: " + fila.take());
		System.out.println("Pool: " + fila.take());
		System.out.println("Pool: " + fila.take());
		System.out.println("Pool: " + fila.take());
		System.out.println("Size: " + fila.size());
	}
	
	public static void main(String[] args) throws InterruptedException {
		exemploBlockingQueue();
	}

}
