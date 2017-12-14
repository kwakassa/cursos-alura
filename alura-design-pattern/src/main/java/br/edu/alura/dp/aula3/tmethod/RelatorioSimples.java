package br.edu.alura.dp.aula3.tmethod;

import java.util.List;

public class RelatorioSimples extends Relatorio {

	@Override
	protected void cabecalho() {
		System.out.println("Banco XYZ");
	}

	@Override
	protected void rodape() {
		System.out.println("(11) 1234-5678");
	}

	@Override
	protected void corpo(List<Conta> contas) {
		for(Conta conta : contas) {
	          System.out.println( conta.getTitular() + " - " + conta.getSaldo() );
	        }
	}

}
