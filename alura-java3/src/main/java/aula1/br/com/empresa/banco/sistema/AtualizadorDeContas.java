package aula1.br.com.empresa.banco.sistema;

import aula1.br.com.empresa.banco.conta.Conta;

public class AtualizadorDeContas {
	
	private double saldoTotal = 0;
	private double selic;

	public AtualizadorDeContas(double selic) {
		this.selic = selic;
	}

	public void roda(Conta c) {
		System.out.println("===============================");
		// aqui você imprime o saldo anterior
		System.out.println("Saldo Anterior: " + c.getSaldo());
		// atualiza a conta com a taxa selic,
		c.atualiza(selic);
		// e depois imprime o saldo final
		System.out.println("Saldo Atual: " + c.getSaldo());
		// lembrando de somar o saldo final ao atributo saldoTotal
		saldoTotal += c.getSaldo();
	}
	
	// outros métodos, colocar o getter para saldoTotal!
	public double getSaldoTotal() {
		return saldoTotal;
	}

}
