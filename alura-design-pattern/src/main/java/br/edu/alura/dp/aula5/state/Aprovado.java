package br.edu.alura.dp.aula5.state;

public class Aprovado implements EstadoDeUmOrcamento {
	
	private boolean isDescontoAplicado = false;
	
	public void aplicaDescontoExtra(Orcamento orcamento) {
		if(!isDescontoAplicado){
			orcamento.valor -= orcamento.valor * 0.02;
			isDescontoAplicado = true;
		}else{
			throw new RuntimeException("Orcamento ja aplicou desconto para orcamento aprovado");
		}
	}

	public void aprova(Orcamento orcamento) {
		// jah estou em aprovacao
		throw new RuntimeException("Orçamento ja esta em estado de aprovacao");
	}

	public void reprova(Orcamento orcamento) {
		// nao pode ser reprovado agora!
		throw new RuntimeException(
				"Orçamento esta em estado de aprovacao e nao pode ser reprovado");
	}

	public void finaliza(Orcamento orcamento) {
		// daqui posso ir para o estado de finalizado
		orcamento.estadoAtual = new Finalizado();
	}

}
