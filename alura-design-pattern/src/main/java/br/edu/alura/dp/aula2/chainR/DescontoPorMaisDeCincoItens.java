package br.edu.alura.dp.aula2.chainR;

public class DescontoPorMaisDeCincoItens implements Desconto {

	private Desconto proximo;
	
	public DescontoPorMaisDeCincoItens(Desconto proximo) {
		setProximo(proximo);
	}

	public void setProximo(Desconto proximo) {
		this.proximo = proximo;
	}

	public double desconta(Orcamento orcamento) {
		if (orcamento.getItens().size() > 5) {
			return orcamento.getValor() * 0.1;
		} else {
			return proximo.desconta(orcamento);
		}
	}

}
