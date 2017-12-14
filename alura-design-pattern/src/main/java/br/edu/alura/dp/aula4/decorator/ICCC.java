package br.edu.alura.dp.aula4.decorator;

public class ICCC extends Imposto {
	
	public ICCC() {
	}
	
	public ICCC(Imposto outroImposto) {
		super(outroImposto);
	}
	
	public double calcula(Orcamento orcamento) {
		if(orcamento.getValor() < 1000){
			return orcamento.getValor() * 0.05 + calculoDoOutroImposto(orcamento);
		}else if (orcamento.getValor() <= 3000){
			return orcamento.getValor() * 0.07 + calculoDoOutroImposto(orcamento);
		}else{
			return orcamento.getValor() * 0.08 + 30 + calculoDoOutroImposto(orcamento);
		}
	}

}
