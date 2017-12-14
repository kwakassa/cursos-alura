package aula5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Ex06TestaCollections {
	public static void imprime(List<Conta> listaContas){
		for (Conta contaPoupanca : listaContas) {
			System.out.println(contaPoupanca.getNumero());
		}
	}

	public static void main(String[] args) {
		ContaPoupanca c1 = new ContaPoupanca();
		c1.setNumero(1111);
		ContaPoupanca c2 = new ContaPoupanca();
		c2.setNumero(2222);
		ContaPoupanca c3 = new ContaPoupanca();
		c3.setNumero(3333);
		List<Conta> listaContas = new ArrayList<Conta>();
		listaContas.add(c3);
		listaContas.add(c1);
		listaContas.add(c2);
		System.out.println("Ordenado:");
		Collections.sort(listaContas);//Ordena
		imprime(listaContas);
		System.out.println("Invertido:");
		Collections.reverse(listaContas);//Inverte
		imprime(listaContas);	
		System.out.println("\nRotacionado:");
		Collections.rotate(listaContas, 1);//Rotaciona em qtd de 1
		imprime(listaContas);
		System.out.println("\nEmbaralhado");
		Collections.shuffle(listaContas);//embaralha
		imprime(listaContas);
	}
}
