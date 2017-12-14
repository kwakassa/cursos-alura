package br.edu.alura.dp.aula5.state;

public class Finalizado implements EstadoDeUmOrcamento {

	public void aplicaDescontoExtra(Orcamento orcamento) {
		throw new RuntimeException("Orçamentos finalizados nao recebem desconto extra!");
	}

	public void aprova(Orcamento orcamento) {
		throw new RuntimeException("Orçamentos finalizados nao pode ser aprovados novamente!");
	}

	public void reprova(Orcamento orcamento) {
		throw new RuntimeException("Orçamentos finalizados nao pode ser reprovados!");
	}

	public void finaliza(Orcamento orcamento) {
		throw new RuntimeException("Orçamentos ja esta em estado finalizado!");
	}

}
