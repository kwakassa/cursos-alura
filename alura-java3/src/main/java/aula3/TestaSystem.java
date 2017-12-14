package aula3;

import java.io.IOException;
import java.io.InputStream;
import java.io.PrintStream;

public class TestaSystem {

	public static void main(String[] args) throws IOException {
		PrintStream saida = System.out;
		saida.println("Ola Mundo");
		
		InputStream entrada = System.in;
		System.out.printf("Digite algo: ");
		int read = entrada.read();
		//System.out.println();
		System.out.println("Foi digitado(byte): " + read);
		System.exit(0);
	}

}
