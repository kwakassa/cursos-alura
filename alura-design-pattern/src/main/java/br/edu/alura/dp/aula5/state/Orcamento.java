package br.edu.alura.dp.aula5.state;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import br.edu.alura.dp.aula2.chainR.Item;

public class Orcamento {
	protected double valor;
    private List<Item> itens;
    protected EstadoDeUmOrcamento estadoAtual;

    public Orcamento() {
    	init();
    }
    public Orcamento(double valor) {
        this.valor = valor;
		init();
    }
    private void init(){
    	this.itens = new ArrayList<Item>();
        this.estadoAtual = new EmAprovacao();
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
    
    public void aplicaDescontoExtra() {
        estadoAtual.aplicaDescontoExtra(this);
	}
	public void aprova() {
		estadoAtual.aprova(this);
	}
	public void finaliza() {
		estadoAtual.finaliza(this);		
	}
	
	public void reprova() {
		estadoAtual.reprova(this);		
	}

}
