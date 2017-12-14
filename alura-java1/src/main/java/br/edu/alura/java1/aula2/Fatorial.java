package br.edu.alura.java1.aula2;

public class Fatorial {
	public static void main(String[] args) {
		long n = 1L;
		long fatorial = 1L;
		while(n<=30){
			fatorial *= n;
			n++;
			System.out.println("N="+n+" - Fatorial="+fatorial);
		}
		System.out.println();
		System.out.println("Fatorial de 40: " + fatorial);
	}
}
