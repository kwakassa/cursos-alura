package br.edu.alura.java2.aula5;

public class Conta {

	protected double saldo;

	public double getSaldo() {
		return saldo;
	}

	public void deposita(double valor) {
		this.saldo += valor;
	}

	public void saca(double valor) {
		if (this.saldo >= valor) {
			this.saldo -= valor;
		} else {
			System.out.println("Saldo Indisponivel");
		}
	}

	public void atualiza(double taxa) {// espera-se taxa entre 0 e 1
		if (taxa >= 0 && taxa <= 1) {
			this.saldo += taxa * this.saldo;
		} else {
			System.out.println("Taxa deve estar entre 0 e 1");
		}
	}

}