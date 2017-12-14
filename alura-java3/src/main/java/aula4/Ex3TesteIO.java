package aula4;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Ex3TesteIO {
	public static void main(String[] args) {
		try {
			//InputStream is = System.in;
			InputStream is = new FileInputStream("entrada.txt");//Arquivo deve esta na pasta do projeto
			InputStreamReader isr = new InputStreamReader(is); 
			BufferedReader br = new BufferedReader(isr);
			String linha;
			do{
				linha = br.readLine();
				System.out.println(linha);
			}while(linha!=null);
			br.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
