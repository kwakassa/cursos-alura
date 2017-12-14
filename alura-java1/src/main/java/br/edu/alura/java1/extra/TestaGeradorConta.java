package br.edu.alura.java1.extra;

public class TestaGeradorConta {

	public static void main(String[] args) {
		Conta conta = Conta.geraConta();
		conta.imprime();
		
		Conta.geraConta().imprime();
		Conta.geraConta().imprime();
		Conta.geraConta().imprime();
		Conta.geraConta().imprime();
		
	}

}
