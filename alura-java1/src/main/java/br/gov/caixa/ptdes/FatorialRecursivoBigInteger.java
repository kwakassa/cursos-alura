	package br.gov.caixa.ptdes;

import java.math.BigInteger;
import java.util.Scanner;

public class FatorialRecursivoBigInteger {
	
	/* Metodo Recursivo Transcrito para fins de comparacao */
	public static int fatorialRecursivo (int numero) {
		if(numero >= 0){
			return numero == 0 ? 1 : numero * fatorialRecursivo(numero - 1);
		}else{
			return 0;
		}
	}
	
	public static BigInteger fatorialRecursivoBigInteger (BigInteger numero) {
		if(numero.compareTo(BigInteger.ZERO) >= 0){
			return (numero.compareTo(BigInteger.ZERO) == 0 ? BigInteger.ONE : numero.multiply(fatorialRecursivoBigInteger(numero.subtract(BigInteger.ONE))) );
		}else{
			return BigInteger.ZERO;
		}
	}
	
	public static void main(String[] args) {
		if(args.length>0){
			BigInteger num = new BigInteger(args[0]);
			System.out.println("Fatorial de " + num + "(BigInteger): " + fatorialRecursivoBigInteger(num));
		}else{
			Scanner teclado = new Scanner(System.in);
			System.out.printf("Digite um numero para fatorial: ");
			String numTxt = teclado.nextLine();
			BigInteger num = new BigInteger(numTxt);
			System.out.println("Fatorial de " + num + " (BigInteger): " + fatorialRecursivoBigInteger(num));
			teclado.close();
		}

	}

}
