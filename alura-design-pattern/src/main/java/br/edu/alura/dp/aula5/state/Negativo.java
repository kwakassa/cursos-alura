package br.edu.alura.dp.aula5.state;

public class Negativo implements EstadoDaConta {

	public void saca(Conta conta, double valor) {
		throw new RuntimeException("Sua conta esta no vermelho. Nao e possível sacar!");
	}

	public void deposita(Conta conta, double valor) {
		conta.saldo += valor * 0.95;
		if (conta.saldo > 0)
			conta.estadoDaConta = new Positivo();
	}

}
