package br.gov.caixa.ptdes;

import java.util.Scanner;

public class FatorialRecursivo {
	
	public static int fatorialRecursivo (int numero) {
		if(numero >= 0){
			return numero == 0 ? 1 : numero * fatorialRecursivo(numero - 1);
		}else{
			return 0;
		}
	}
	
	public static void main(String[] args) {
		int num = 0;
		if(args.length>0){
			num = Integer.parseInt(args[0]);			
		}else{
			Scanner teclado = new Scanner(System.in);
			System.out.printf("Digite um numero para fatorial: ");
			num = teclado.nextInt();
			teclado.close();
		}
		System.out.println("Fatorial de "+ num + " (int): " + fatorialRecursivo(num));

	}

}
