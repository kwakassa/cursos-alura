package aula5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Ex08TestaListToString {
	public static void main(String[] args) {
		//Alterado o Construtor e toString da Classe ContaPoupanca 
		ContaPoupanca c1 = new ContaPoupanca(1111,"Joao");
		ContaPoupanca c2 = new ContaPoupanca(2222,"Maria");
		ContaPoupanca c3 = new ContaPoupanca(3333,"Marcos");
		List<Conta> listaContas = new ArrayList<Conta>();
		listaContas.add(c3);
		listaContas.add(c1);
		listaContas.add(c2);
		Collections.sort(listaContas);
		System.out.println(listaContas);
	}
}
