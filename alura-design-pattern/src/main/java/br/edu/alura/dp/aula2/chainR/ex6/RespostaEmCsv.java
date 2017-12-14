package br.edu.alura.dp.aula2.chainR.ex6;

public class RespostaEmCsv implements Resposta {

	private Resposta outraReposta;
	
	public RespostaEmCsv(Resposta outraReposta) {
		this.outraReposta = outraReposta;
	}

	public void responde(Requisicao req, Conta conta) {
		if (req.getFormato() == Formato.CSV) {
			System.out.println(conta.getTitular() + ";" + conta.getSaldo());
		} else {
			outraReposta.responde(req, conta);
		}
	}

}
