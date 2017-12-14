package br.edu.alura.dp.aula2.chainR;

public class TestaCalculadorDeDescontos {

	public static void main(String[] args) {
		CalculadorDeDescontos c = new CalculadorDeDescontos();
		Item i1 = new Item("HD Portable", 330.00);
		Item i2 = new Item("Power Bank", 220.00);
		Item i3 = new Item("LAPIS", 2.00);
		Item i4 = new Item("CANETA", 5.00);
		
		Orcamento orcamento = new Orcamento(400.00);
		orcamento.adicionaItem(i1);
		orcamento.adicionaItem(i2);
		orcamento.adicionaItem(i3);
		orcamento.adicionaItem(i4);
		double desconto = c.calcula(orcamento);
		
		System.out.println("Desconto: " + desconto);
	}

}
