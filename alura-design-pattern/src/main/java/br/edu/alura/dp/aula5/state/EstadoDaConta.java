package br.edu.alura.dp.aula5.state;

public interface EstadoDaConta {
	void saca(Conta conta, double valor);
	void deposita(Conta conta, double valor);
}
