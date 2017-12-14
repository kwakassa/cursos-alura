package br.com.alura.jdbc.aula7;

public class Produto {
	private Integer id;
	private String nome;
	private String descricao;
	
	public Produto(String nome, String descricao) {
		this.nome = nome;
		this.descricao = descricao;
	}

	public String getNome() {return nome;}
	public String getDescricao() {return descricao;}
	
	public void setId(Integer id) {this.id = id;}

	@Override
	public String toString() {
		return String.format("Produto [id=%d, nome=%s, descricao=%s]",id,nome,descricao);
	}	
}
