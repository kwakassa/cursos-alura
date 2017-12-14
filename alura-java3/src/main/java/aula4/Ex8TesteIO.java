package aula4;

import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.io.PrintStream;
import java.util.Scanner;

public class Ex8TesteIO {

		public static void IOComBufferedWriter() {
			try {
				Scanner sc = new Scanner(new FileInputStream("entrada.txt"));
				BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(
						new FileOutputStream("saida.txt")));
				while (sc.hasNextLine()) {
					String nextLine = sc.nextLine();
					bw.append(nextLine);
					bw.newLine();
				}
				sc.close();
				bw.close();
			} catch (Exception e) {// Nao e boa pratica, mas apenas para simplificar o exercicio
				e.printStackTrace();
			}
		}

		public static void IOComPrintStream() {
			try {
				//InputStream in = new FileInputStream("entrada.txt");
				InputStream in = System.in;
				Scanner entrada = new Scanner(in);
				PrintStream saida = new PrintStream(new FileOutputStream("saida.txt"));
				String input = "";
				do {
					System.out.println("Digite texto para gravar na saida.txt ou tecle enter para finalizar: ");
					input = entrada.nextLine();
					saida.println(input);
				}while (!input.isEmpty());
				saida.close();
				entrada.close();
			} catch (Exception e) {// Nao e boa pratica, mas apenas para simplificar o exercicio
				e.printStackTrace();
			}
		}

		public static void main(String[] args) {
			System.out.println("---INICIO---");
			IOComPrintStream();
			System.out.println("---FIM---");
		}
}
