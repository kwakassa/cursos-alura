package br.com.alura.h2.extra;

import java.util.ArrayList;
import java.util.List;

public class Categoria {
	
	private final Integer id;
	private final String nome;
	private final List<Produto> produtos = new ArrayList<Produto>();
	
	public Categoria(int id, String nome) {
		this.id = id;
		this.nome = nome;
	}
	
	public Integer getId() {
		return this.id;
	}
	
	@Override
	public String toString() {
		return String.format("Categoria [id=%d, nome=%s]",id,nome);
	}

	public String getNome() {
		return this.nome;
	}

	public void adiciona(Produto produto) {
		this.getProdutos().add(produto);
	}

	public List<Produto> getProdutos() {
		return this.produtos;
	}

}
