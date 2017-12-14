package br.com.alura.aula5;

import java.io.IOException;
import java.io.PrintStream;
import java.net.Socket;
import java.util.Scanner;

public class ClienteTarefas {

	public static void main(String[] args) throws Exception {
		final Socket socket = new Socket("127.0.0.1", 12345);
		System.out.println("Conexao estabelecida.");
		
		Thread threadEnviaComando = new Thread(new Runnable() {			
			public void run() {
				try {
					System.out.println("Teclado pronto para enviar comandos");
					PrintStream saida = new PrintStream(socket.getOutputStream());
					Scanner teclado = new Scanner(System.in);
					while(teclado.hasNextLine()){
						String linha = teclado.nextLine();
						if(linha.trim().equals("")){
							break;
						}
						saida.println(linha);
					}
					saida.close();
					teclado.close();
				} catch (IOException e) {
					throw new RuntimeException(e);
				}
			}
		});
		
		Thread threadRecebeResposta = new Thread(new Runnable() {			
			@Override
			public void run() {
				try {
					System.out.println("Recebendo dados do Servidor!");
					Scanner respostaServidor = new Scanner(socket.getInputStream());
					while(respostaServidor.hasNextLine()){
						String linha = respostaServidor.nextLine();
						System.out.println(linha);
					}
					respostaServidor.close();
				} catch (IOException e) {
					throw new RuntimeException(e);
				}
				
			}
		});
		
		threadEnviaComando.start();
		threadRecebeResposta.start();
		
		threadEnviaComando.join();
		System.out.println("Fechando Socket do cliente");
		socket.close();
	}

}
