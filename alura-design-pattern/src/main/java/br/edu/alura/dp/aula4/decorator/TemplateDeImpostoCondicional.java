package br.edu.alura.dp.aula4.decorator;

public abstract class TemplateDeImpostoCondicional extends Imposto{
	
	private TemplateDeImpostoCondicional impostoFilho;
	
	public final double calcula(Orcamento orcamento) {//final evita que os filhos alterem a implementação desse metodo
		if(deveUsarMaximaTaxacao(orcamento)){
			System.out.println("Taxacao Maxima");
			return maximaTaxacao(orcamento) + calculoDoOutroImposto(orcamento);
		}else{
			System.out.println("Taxacao Minima");
			return minimaTaxacao(orcamento);
		}
	}
	
	public abstract boolean deveUsarMaximaTaxacao(Orcamento orcamento);
	public abstract double maximaTaxacao(Orcamento orcamento);
	public abstract double minimaTaxacao(Orcamento orcamento);
}
