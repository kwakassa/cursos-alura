package br.edu.alura.java2.aula1;

public class ContaCorrente extends Conta{
	
	public void atualiza(double taxa) {
		super.atualiza(taxa * 2);
    }
	
}
