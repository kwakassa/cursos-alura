package br.edu.alura.java2.aula1;

public class ContaPoupanca extends Conta {
	
	public void atualiza(double taxa) {
		super.atualiza(taxa * 3);
    }

    public void deposita(double valor) {
        this.saldo += valor - 0.10;
    }

}
