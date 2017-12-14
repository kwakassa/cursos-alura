package br.gov.caixa.ptdes;

import java.util.Random;

class Aluno{
	String nomeCompleto;
	int idade;
	void imprime(){
		System.out.println("Nome Aluno: " + nomeCompleto);
		System.out.println("Idade Aluno: " + idade);
	}
}

class GeraAlunoTest{
	Random aleatorio = new Random();
	String[] nomes = {"Joao","Mario","Jose","Roberta","Solange","Olivia"};
	String[] sobrenomes = {"Bittencourt","Silva","Soares","Carvalho","Oliveira","Pereira"};
	
	Aluno geraAluno(){
		String nome = nomes[aleatorio.nextInt(6)];
		String sobrenome = sobrenomes[aleatorio.nextInt(6)];
		
		String nomeCompletoAleatorio = nome + " " + sobrenome;
		int idadeAleatoria = 20 + aleatorio.nextInt(60);
		
		Aluno aluno = new Aluno();
		aluno.nomeCompleto = nomeCompletoAleatorio;
		aluno.idade = idadeAleatoria;
		
		return aluno;
	}
}

public class TestaAlunoRandom {

	public static void main(String[] args) {
		GeraAlunoTest gerador = new GeraAlunoTest();
		Aluno a = gerador.geraAluno();
		a.imprime();
	}

}
