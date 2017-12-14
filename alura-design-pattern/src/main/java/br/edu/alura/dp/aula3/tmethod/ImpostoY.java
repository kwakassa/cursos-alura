package br.edu.alura.dp.aula3.tmethod;

import br.edu.alura.dp.aula2.chainR.Item;

public class ImpostoY extends TemplateDeImpostoCondicional {
	
	@Override
	public boolean deveUsarMaximaTaxacao(Orcamento orcamento) {
		return orcamento.getValor() > 500 && temItemMaiorQue100Reais(orcamento);
	}
	
	@Override
	public double maximaTaxacao(Orcamento orcamento) {
		return orcamento.getValor() * 0.10;
	}
	
	@Override
	public double minimaTaxacao(Orcamento orcamento) {
		return orcamento.getValor() * 0.06;
	}

	private boolean temItemMaiorQue100Reais(Orcamento orcamento) {
		for (Item item : orcamento.getItens()) {
			if(item.getValor() > 100.00) return true;
		}
		return false;
	}
}
