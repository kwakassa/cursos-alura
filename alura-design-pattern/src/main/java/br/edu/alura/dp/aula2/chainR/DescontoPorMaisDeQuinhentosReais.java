package br.edu.alura.dp.aula2.chainR;

public class DescontoPorMaisDeQuinhentosReais implements Desconto {

	private Desconto proximo;	
	
	public DescontoPorMaisDeQuinhentosReais(Desconto proximo) {
		setProximo(proximo);
	}

	public void setProximo(Desconto proximo) {
		this.proximo = proximo;
	}

	public double desconta(Orcamento orcamento) {
		if (orcamento.getValor() > 500) {
			return orcamento.getValor() * 0.07;
		} else {
			return proximo.desconta(orcamento);
		}
	}

}
