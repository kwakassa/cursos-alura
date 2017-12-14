package br.edu.alura.dp.aula2.chainR;

public class DescontoPorVendaCasada implements Desconto {

	private Desconto proximo;
	
	public DescontoPorVendaCasada(Desconto proximo) {
		setProximo(proximo);
	}

	public double desconta(Orcamento orcamento) {
		if (existe("LAPIS", orcamento) && existe("CANETA", orcamento)) {
			System.out.println("Ocorreu Venda Casada.");
			return orcamento.getValor() * 0.05;
		} else {
			return proximo.desconta(orcamento);
		}
	}

	public void setProximo(Desconto proximo) {
		this.proximo = proximo;
	}
	
	private boolean existe(String nomeDoItem, Orcamento orcamento) {
        for (Item item : orcamento.getItens()) {
            if(item.getNome().equals(nomeDoItem)) return true;
        }
        return false;
    }
}
