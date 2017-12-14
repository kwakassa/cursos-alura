package br.edu.alura.dp.aula4.decorator;

public class ImpostoMuitoAlto extends Imposto {
	
	public ImpostoMuitoAlto() {
	}
	
	public ImpostoMuitoAlto(Imposto outroImposto) {
		super(outroImposto);
	}
	
	@Override
	public double calcula(Orcamento orcamento) {
		return orcamento.getValor() * 0.2 + calculoDoOutroImposto(orcamento);
	}

}
