package br.edu.alura.java2.aula3;
public class ContaCorrente extends Conta{
	
	public void atualiza(double taxa) {
        this.saldo += this.saldo * taxa * 2;
    }
	
}