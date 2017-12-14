package br.edu.alura.dp.aula2.chainR;

public interface Desconto {
	public double desconta(Orcamento orcamento);
    public void setProximo(Desconto proximo);
}
