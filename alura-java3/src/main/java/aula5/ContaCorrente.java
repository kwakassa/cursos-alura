package aula5;

import aula1.br.com.empresa.banco.conta.Tributavel;

public class ContaCorrente extends Conta implements Tributavel{
	public ContaCorrente() {}
	public ContaCorrente(int num, String titular, double saldo) {
		super.numero = num;
		super.nome = titular;
		super.saldo = saldo;
	}

	public void atualiza(double taxa) {
        this.saldo += this.saldo * taxa * 2;
    }

	public double calculaTributos() {
		return this.getSaldo() * 0.01;
	}
	@Override
	public String toString() {
		return "ContaCorrente [numero=" + numero + ", nome=" + nome + ", saldo=" + saldo + "]";
	}
	
	
}