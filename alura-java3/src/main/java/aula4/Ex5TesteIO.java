package aula4;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex5TesteIO {
	/** Exemplo de Outros InputStream: BufferedInputStream, 
	 * CheckedInputStream, CipherInputStream, DataInputStream, 
	 * DeflaterInputStream, DigestInputStream, InflaterInputStream, 
	 * LineNumberInputStream, ProgressMonitorInputStream, PushbackInputStream */
	public static void main(String[] args) {
		try {
			//InputStream is = System.in;
			BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream("entrada.txt")));//Arquivo deve esta na pasta do projeto
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