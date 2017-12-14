package aula5;

import java.util.HashSet;

public class Ex17TestaContaHashSet {
	public static void main(String[] args) {
		HashSet<Conta> contas = new HashSet<Conta>();
		Conta c1 = new ContaCorrente(1111, "Joao", 1000);
		Conta c2 = new ContaCorrente(1111, "Carlos", 1100);
		Conta c3 = new ContaCorrente(2222, "Maria", 1200);
		Conta c4 = new ContaCorrente(2222, "Tiago", 1300);
		Conta c5 = new ContaCorrente(3333, "Jose", 1400);
		
		contas.add(c1);
		contas.add(c2);
		contas.add(c3);
		contas.add(c4);
		contas.add(c5);
		
		for (Conta conta : contas) {
			System.out.println(conta);
		}
	}
}
