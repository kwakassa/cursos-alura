package br.edu.alura.dp.aula4.decorator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import br.edu.alura.dp.aula2.chainR.Item;

public class Orcamento {
	private double valor;
    private List<Item> itens;

    public Orcamento() {
        this.itens = new ArrayList<Item>();
    }

    public double getValor() {
        return valor;
    }

    public List<Item> getItens() {
        return Collections.unmodifiableList(itens);
    }

    public void adicionaItem(Item item) {
        itens.add(item);
        this.valor += item.getValor();
    }

}
