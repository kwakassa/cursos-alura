package br.edu.alura.dp.aula7.observer;

public class EnviadorDeSms implements AcaoAposGerarNota {

	public void executa(NotaFiscal notaFiscal) {
		System.out.println("enviando por sms");
	}

}
