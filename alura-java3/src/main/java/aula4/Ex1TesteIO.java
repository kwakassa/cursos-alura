package aula4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Ex1TesteIO {
	public static void main(String[] args) {
		try {
			InputStream is = System.in;
			InputStreamReader isr = new InputStreamReader(is);
			BufferedReader br = new BufferedReader(isr);
			System.out.printf("Digite algo: ");
			String readLine = br.readLine();
			System.out.println("Foi Digitado: " + readLine);
			br.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
