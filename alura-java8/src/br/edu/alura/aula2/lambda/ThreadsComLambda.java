package br.edu.alura.aula2.lambda;

public class ThreadsComLambda {

	public static void main(String[] args) {
		/** Usando Classes Anonimas */
		new Thread(new Runnable() {			
			@Override
			public void run() {
				System.out.println("Executando um Runnable");				
			}
		});
		/** Usando Expressao Lambda */		
		new Thread( () -> System.out.println("Executando um Runnable") ).start();
		
	}

}
