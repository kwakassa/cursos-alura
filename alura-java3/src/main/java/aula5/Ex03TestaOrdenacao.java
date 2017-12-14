package aula5;

import java.util.ArrayList;
import java.util.Collections;

public class Ex03TestaOrdenacao {
	public static void main(String[] args) {
		ContaPoupanca c1 = new ContaPoupanca();
		c1.setNumero(1111);
		ContaPoupanca c2 = new ContaPoupanca();
		c2.setNumero(2222);
		ContaPoupanca c3 = new ContaPoupanca();
		c3.setNumero(3333);
		ArrayList<ContaPoupanca> listaContas = new ArrayList<ContaPoupanca>();
		listaContas.add(c3);
		listaContas.add(c1);
		listaContas.add(c2);

		Collections.sort(listaContas);

		for (ContaPoupanca contaPoupanca : listaContas) {
			System.out.println(contaPoupanca.getNumero());
		}
	}
}
