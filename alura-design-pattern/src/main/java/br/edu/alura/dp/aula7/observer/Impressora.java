package br.edu.alura.dp.aula7.observer;

public class Impressora implements AcaoAposGerarNota {

	public void executa(NotaFiscal notaFiscal) {
		System.out.println("enviando por sms");
	}

}
