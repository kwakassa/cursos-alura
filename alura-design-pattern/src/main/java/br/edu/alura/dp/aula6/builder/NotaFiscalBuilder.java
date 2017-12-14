package br.edu.alura.dp.aula6.builder;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class NotaFiscalBuilder {
	private String razaoSocial;
	private String cnpj;
	private List<ItemDaNota> todosItens = new ArrayList<ItemDaNota>();
	private double valorBruto;
	private double impostos;
	private String observacoes;
	private Calendar data;
	
	public NotaFiscalBuilder() {
		this.data = Calendar.getInstance();
	}
	
	public NotaFiscalBuilder paraEmpresa(String razaoSocial) {
		this.razaoSocial = razaoSocial;
		return this;
	}

	public NotaFiscalBuilder comCnpj(String cnpj) {
		this.cnpj = cnpj;
		return this;
	}

	public NotaFiscalBuilder com(ItemDaNota item) {
		todosItens.add(item);
		valorBruto += item.getValor();
		impostos += item.getValor() * 0.05;

		return this;
	}

	public NotaFiscalBuilder comObservacoes(String observacoes) {
		this.observacoes = observacoes;

		return this;
	}

	public NotaFiscalBuilder naData(Calendar data) {
		this.data = data;;
		return this;
	}
	
	
	public NotaFiscal constroi() {
		return new NotaFiscal(razaoSocial, cnpj, data, valorBruto, impostos, todosItens, observacoes);
	}
	
	public static void main(String[] args) {
		Calendar c1 = Calendar.getInstance();
		Calendar c2 = c1;
		System.out.println(c1);
		System.out.println(c2);
		
		c1.set(2017, 01, 22);
		
		System.out.println(c1);
		System.out.println(c2);
		
		//Classe Calendar não é que nem a String, ou seja, uma atribuição não devolve uma copia com a classe String. 
	}
}
