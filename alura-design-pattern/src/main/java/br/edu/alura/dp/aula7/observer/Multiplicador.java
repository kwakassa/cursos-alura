package br.edu.alura.dp.aula7.observer;

public class Multiplicador implements AcaoAposGerarNota {
	
	private double fator;

	public Multiplicador(double fator) {
		this.fator = fator;
	  }
	
	public void executa(NotaFiscal notaFiscal) {
		System.out.println("Valor da nota com Multiplicador: " + notaFiscal.getValorBruto() * fator);
	}

}
