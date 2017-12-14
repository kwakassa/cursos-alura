package aula4;

import java.util.Scanner;

public class Ex6EntradaDeUmArquivo {
	public static void main(String[] args) {
		try {
			//Scanner sc = new Scanner(new FileInputStream("entrada.txt"));
			Scanner sc = new Scanner(System.in);
			/** Necessario realizar o stop no Eclipse ou Kill da jvm para terminar a aplicacao,
			 * senao continuara lendo infinitamente a entrada do teclado
			 */
			System.out.println("Digite sua mensagem:");
			while(sc.hasNextLine()){
				String nextLine = sc.nextLine();
				System.out.println(nextLine);
			}
			sc.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}
