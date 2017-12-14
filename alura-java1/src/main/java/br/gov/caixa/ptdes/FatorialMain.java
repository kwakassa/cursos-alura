package br.gov.caixa.ptdes;

import java.math.BigInteger;
import java.util.Scanner;

class FatorialStatic{
	
	public static BigInteger calculaFatorial(BigInteger numero){
		/* Verifica se o numero ew menor ou igual a 0 */
		if (numero.compareTo(BigInteger.ZERO) < 0) {
			return null;
		}else{
			if(numero.compareTo(BigInteger.ZERO)==0){
				return BigInteger.ONE;
			}
			BigInteger resultado = BigInteger.ONE;
			/* o metodo i.compareTo(numero) retorna negativo se o a esquerda for menor q o da direita, 
			 * retorna 0 se forem iguais e retorno numero positivo o numero da esquerda for maior */
			for(BigInteger i = BigInteger.ONE ; i.compareTo(numero) <= 0 ; i = i.add(BigInteger.ONE)){
				resultado = resultado.multiply(i);
			}
			return resultado;
		}
	}
	
}

public class FatorialMain {
	
	public static void main(String[] args) {
		//Inicializando Variaveis
		BigInteger resultado = BigInteger.ZERO;
		BigInteger numero = BigInteger.ZERO;
		
		//Estrutura de controle para obtencao do numero do fatorial
		switch (args.length) {
			case 0:
				Scanner teclado = new Scanner(System.in);
				System.out.printf("Digite um numero para calculo de fatorial: ");
				String numTxt = teclado.nextLine();
				numero = new BigInteger(numTxt);
				teclado.close();
				break;
			case 1:
				numero = new BigInteger(args[0]);				
				break;
			default:
				System.out.println("Mais de um argumento fornecido. Utilizando apenas o primeiro.");
				numero = new BigInteger(args[0]);				
				break;		
		}
		
		resultado = FatorialStatic.calculaFatorial(numero);
		
		if (resultado == null) {
			System.out.println("Nao existe fatorial de numero negativo.");
		}else{
			System.out.println("Fatorial de " + numero + ": " + resultado);
		}
		
	}
	
	
}
