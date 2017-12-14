package br.edu.teste.collection;

import java.util.HashSet;
import java.util.Set;

class Aluno{
	private Integer id;
	private String nome;
	private Integer idade;
	public Aluno(Integer id, String nome, Integer idade) {
		this.id = id;
		this.nome = nome;
		this.idade = idade;
	}
	@Override
	public String toString() {
		return "Aluno [id=" + id + ", nome=" + nome + ", idade=" + idade + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((idade == null) ? 0 : idade.hashCode());
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Aluno) {
			Aluno outro = (Aluno) obj;
			if(this.id==outro.id) {
				return true;
			}else {
				return false;
			}
		}else {
			return false;
		}
	}
	
}

public class TestaSet {
	public static void main(String[] args) {
		Set<Aluno> alunos = new HashSet<Aluno>();
		alunos.add(new Aluno(3, "Joao", 20));
		alunos.add(new Aluno(2, "Jose", 22));
		alunos.add(new Aluno(3, "Joao", 20));
		for (Aluno aluno : alunos) {
			System.out.println(aluno);
		}
	}
}
