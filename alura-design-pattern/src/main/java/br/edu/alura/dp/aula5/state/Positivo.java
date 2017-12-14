package br.edu.alura.dp.aula5.state;

public class Positivo implements EstadoDaConta {

	public void saca(Conta conta, double valor) {
		conta.saldo -= valor;
        if(conta.saldo < 0) conta.estadoDaConta = new Negativo();
	}

	public void deposita(Conta conta, double valor) {
		conta.saldo += valor * 0.98;
	}

}
