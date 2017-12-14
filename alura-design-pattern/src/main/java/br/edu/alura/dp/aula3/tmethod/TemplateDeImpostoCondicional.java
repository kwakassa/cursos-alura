package br.edu.alura.dp.aula3.tmethod;

public abstract class TemplateDeImpostoCondicional implements Imposto{

	public final double calcula(Orcamento orcamento) {//final evita que os filhos alterem a implementação desse metodo
		if(deveUsarMaximaTaxacao(orcamento)){
			System.out.println("Taxacao Maxima");
			return maximaTaxacao(orcamento);
		}else{
			System.out.println("Taxacao Minima");
			return minimaTaxacao(orcamento);
		}
	}
	
	public abstract boolean deveUsarMaximaTaxacao(Orcamento orcamento);
	public abstract double maximaTaxacao(Orcamento orcamento);
	public abstract double minimaTaxacao(Orcamento orcamento);
}
