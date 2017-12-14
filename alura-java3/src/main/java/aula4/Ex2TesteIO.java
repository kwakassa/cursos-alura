package aula4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Ex2TesteIO {
	public static void main(String[] args) throws IOException {
		System.out.println("--- INICIO ---");
        InputStream is = System.in;
        InputStreamReader isr = new InputStreamReader(is);
        BufferedReader br = new BufferedReader(isr);

        System.out.printf("Digite sua mensagem ou Enter para finalizar: ");
        String linha = br.readLine(); // primeira linha

        while (linha != null && !linha.isEmpty()) {
            System.out.println("Digitou:" + linha);
            System.out.printf("Digite sua mensagem ou Enter para finalizar: ");
            linha = br.readLine();
        }
        br.close();
        System.out.println("--- FIM ---");
    }
}
