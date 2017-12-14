package br.gov.caixa.ptdes;

import java.util.Scanner;

public class PotenciaMain {

	public static void main(String[] args) {
		System.out.println(" --- Calculo de Potenciacao --- ");
		System.out.printf("Digite a Base: " );
		
		Scanner teclado = new Scanner(System.in);
		double base = teclado.nextDouble();
		
		System.out.printf("\nDigite o expoente: " );
		double expoente = teclado.nextDouble();
		
		double resultado = Math.pow(base, expoente);
		
		System.out.printf("\nResultado: %.2f", resultado);
		
		teclado.close();

	}

}
