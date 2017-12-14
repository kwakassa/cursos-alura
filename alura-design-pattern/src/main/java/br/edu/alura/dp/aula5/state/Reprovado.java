package br.edu.alura.dp.aula5.state;

public class Reprovado implements EstadoDeUmOrcamento {

	public void aplicaDescontoExtra(Orcamento orcamento) {
		throw new RuntimeException("Orcamentos reprovados nao recebem desconto extra!");
	}

	public void aprova(Orcamento orcamento) {
		throw new RuntimeException("Orcamentos reprovados nao podem ser aprovados!");
	}

	public void reprova(Orcamento orcamento) {
		throw new RuntimeException("Orcamentos ja reprovado!");
	}

	public void finaliza(Orcamento orcamento) {
		throw new RuntimeException("Orcamentos reprovados nao ser finalizados!");
	}

}
