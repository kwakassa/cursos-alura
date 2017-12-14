package br.edu.alura.dp.aula2.chainR;

public class SemDesconto implements Desconto {
	
	public SemDesconto() {
		// TODO Auto-generated constructor stub
	}
	
	public double desconta(Orcamento orcamento) {
		return 0;
	}

	public void setProximo(Desconto desconto) {
		// nao tem!
	}

}
