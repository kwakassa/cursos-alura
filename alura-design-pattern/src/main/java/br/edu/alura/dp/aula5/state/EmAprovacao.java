package br.edu.alura.dp.aula5.state;

public class EmAprovacao implements EstadoDeUmOrcamento {
	
	private boolean isDescontoAplicado = false;
	
	public void aplicaDescontoExtra(Orcamento orcamento) {
		if(!isDescontoAplicado){
			orcamento.valor -= orcamento.valor * 0.05;
			isDescontoAplicado = true;
		}else{
			throw new RuntimeException("Orcamento ja aplicou desconto para orcamento aprovado");
		}
	}

	public void aprova(Orcamento orcamento) {
		// desse estado posso ir para o estado de aprovado
		orcamento.estadoAtual = new Aprovado();
	}

	public void reprova(Orcamento orcamento) {
		// desse estado posso ir para o estado de reprovado tambem
		orcamento.estadoAtual = new Reprovado();
	}

	public void finaliza(Orcamento orcamento) {
		// daqui não posso ir direto para finalizado
		throw new RuntimeException("Orcamento em aprovacao nao podem ir para finalizado diretamente");
	}
}
