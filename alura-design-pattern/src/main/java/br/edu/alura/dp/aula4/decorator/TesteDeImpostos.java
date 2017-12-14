package br.edu.alura.dp.aula4.decorator;

import br.edu.alura.dp.aula2.chainR.Item;

public class TesteDeImpostos {
	public static void main(String[] args) {
		Imposto impostoComposto = new ISS(new ICMS(new ImpostoMuitoAlto(new ICPP())));

        Orcamento orcamento = new Orcamento();
        orcamento.adicionaItem(new Item("ITEM",500));

        double valor = impostoComposto.calcula(orcamento);

        System.out.println(valor);
	}
}
