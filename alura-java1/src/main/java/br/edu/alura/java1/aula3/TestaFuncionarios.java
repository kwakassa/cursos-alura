package br.edu.alura.java1.aula3;

public class TestaFuncionarios {
	
	static void aula3Ex4(){
		Funcionario f1 = new Funcionario();
		f1.setNome("Danilo");
		f1.setSalario(100);

		Funcionario f2 = new Funcionario();
		f2.setNome("Danilo");
		f2.setSalario(100);

		if (f1 == f2) {
			/**
			 * Aqui esta comparando referencias dos objetos apontados pelas
			 * variaveis f1 e f2, e nao se os nomes sao iguais Resposta: Se sao
			 * Diferentes, as referencias sao diferentes, ou seja, apontam para
			 * enderecos de objetos diferentes. Se sao iguais, apontam para o
			 * mesmo objeto em memoria.
			 */
			System.out.println("iguais");
		} else {
			System.out.println("diferentes");
		}
	}
	
	static void aula3Ex5(){
		Funcionario f1 = new Funcionario();
		f1.setNome("Danilo");
		f1.setSalario(100);

		Funcionario f2 = f1;
		f2.setNome("Danilo");
		f2.setSalario(100);

		if (f1 == f2) {
			/** Neste caso f2 recebeu a mesma referencia de f1, logo, o if sera igual * 
			 */
			System.out.println("iguais");
		} else {
			System.out.println("diferentes");
		}
	}
	
	public static void main(String[] args) {
		aula3Ex5();
	}

}