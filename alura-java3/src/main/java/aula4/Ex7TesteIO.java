package aula4;

import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class Ex7TesteIO {
	public static void main(String[] args) {
		try {
			Scanner sc = new Scanner(new FileInputStream("entrada.txt"));
			BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("saida.txt")));	
			while(sc.hasNextLine()){
				String nextLine = sc.nextLine();
				bw.append(nextLine);
				bw.newLine();
			}
			sc.close();
			bw.close();
		} catch (Exception e) {//Nao e boa pratica, mas apenas para simplificar o exercicio
			e.printStackTrace();
		}
	}
}
