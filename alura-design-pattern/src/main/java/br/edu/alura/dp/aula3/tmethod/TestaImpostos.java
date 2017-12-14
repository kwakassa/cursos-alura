package br.edu.alura.dp.aula3.tmethod;

import br.edu.alura.dp.aula2.chainR.Item;

public class TestaImpostos {
	
	public static void main(String[] args) {
		Imposto i1 = new ICPP();
		Imposto i2 = new IKCV();
		
		Orcamento orcamento = new Orcamento();
		/** Objetivo é ter a Tacaxao macima no ICPP e Minima no IKCV */
		for (int i=1;i<15;i++) {
			Item item = new Item("Item " + i, 40 + Math.round(10 + Math.random() * 20));//Variacao de 50 a 70
			orcamento.adicionaItem(item);
		}
		
		System.out.println("Imposto ICPP: " + i1.calcula(orcamento));
		System.out.println("Imposto IKCV: " + i2.calcula(orcamento));
		
	}
	
}
