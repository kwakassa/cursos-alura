package br.edu.alura.dp.aula4.decorator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import br.edu.alura.dp.aula2.chainR.Item;

public class IHIT extends TemplateDeImpostoCondicional {

	@Override
	public boolean deveUsarMaximaTaxacao(Orcamento orcamento) {
		// return verificaSeTemItensComMesmoNome(orcamento);
		List<String> noOrcamento = new ArrayList<String>();
		//Cria uma lista que acrescenta elementos que não estão repetidos para serem comparados com o proximo do loop FOR
		for (Item item : orcamento.getItens()) {
			if (noOrcamento.contains(item.getNome()))
				return true;
			else
				noOrcamento.add(item.getNome());
		}

		return false;
	}
	//Cria uma outra lista para remover um elemento e comparar com o restante
	private boolean verificaSeTemItensComMesmoNome(Orcamento orcamento) {
		List<Item> lista = new ArrayList<Item>(orcamento.getItens());
		int tamanhoLista = lista.size();
		for (int i = 0; i < tamanhoLista; i++) {
			Item item = lista.remove(0);// Remove elemento e compara com o
										// restante
			for (Item itemRestante : lista) {
				if (itemRestante.getNome().equals(item.getNome())) {
					System.out.println("Item igual: " + item.getNome());
					return true;
				}
			}
		}
		return false;
	}

	@Override
	public double maximaTaxacao(Orcamento orcamento) {
		return orcamento.getValor() * 0.13 + 100;
	}

	@Override
	public double minimaTaxacao(Orcamento orcamento) {
		return orcamento.getValor() * (0.01 * orcamento.getItens().size());
	}

	// Testa remove() de List{
	private static void testeRemoveElement() {
		List<Item> lista = new ArrayList<Item>();
		for (int i = 1; i <= 5; i++) {
			lista.add(new Item("Item " + i, i * 100));
		}
		int tamanho = lista.size();
		for (int i = 0; i < tamanho; i++) {
			Item item = lista.remove(0);
			System.out.println(item.getNome());
		}
	}

	//
	private static void testaContemMesmoNomeNaLista() {
		Orcamento orcamento = new Orcamento();
		for (int i = 1; i <= 4; i++) {
			orcamento.adicionaItem(new Item("Item " + i, 100));
		}
		orcamento.adicionaItem(new Item("Item 3", 100));
		IHIT ihit = new IHIT();
		System.out.println(ihit.verificaSeTemItensComMesmoNome(orcamento));
	}

	public static void main(String[] args) {
		testaContemMesmoNomeNaLista();
	}

}
