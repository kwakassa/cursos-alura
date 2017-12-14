package aula3;

import aula1.br.com.empresa.banco.conta.ValorInvalidoException;

public abstract class Conta {
	protected long numero;
	protected String nome;
	protected double saldo;

	// Exercicio da aula 3
	public Conta(double saldo) {
		this.saldo = saldo;
	}

	public Conta() {
	}

	public long getNumero() {
		return numero;
	}

	public void setNumero(long numero) {
		this.numero = numero;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getSaldo() {
		return saldo;
	}

	public void deposita(double valor) {
		if (valor < 0) {
			throw new ValorInvalidoException("Valor de Deposito Invalido");
		} else {
			this.saldo += valor;
		}
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

	@Override
	public String toString() {
		return "Uma conta com valor: " + this.saldo;
	}

	@Override
	public boolean equals(Object conta) {
		boolean valida = true;
		if (conta instanceof Conta) {
			Conta c1 = (Conta) conta;
			valida &= (this.numero == c1.numero);// Operador usado para sequencias de validacoe, basta um "false" que
													// nao ficara mais "true"
			if(nome!=null)
				valida &= (this.nome.equals(c1.nome));
		} else {
			valida &= false;
		}
		return valida;
	}
}
