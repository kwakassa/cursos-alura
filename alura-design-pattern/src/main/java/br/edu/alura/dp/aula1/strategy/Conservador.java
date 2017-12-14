package br.edu.alura.dp.aula1.strategy;

public class Conservador implements Investimento {
	public double calcula(Conta conta) {
		return conta.getSaldo() * 0.008;
	}
}
