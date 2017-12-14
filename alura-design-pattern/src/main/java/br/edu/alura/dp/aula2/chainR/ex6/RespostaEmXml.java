package br.edu.alura.dp.aula2.chainR.ex6;

public class RespostaEmXml implements Resposta{
	private Resposta outraResposta;
	
	public RespostaEmXml(Resposta outraResposta) {
		this.outraResposta = outraResposta;
	}

	public void responde(Requisicao req, Conta conta) {
		if (req.getFormato() == Formato.XML) {
			System.out.println("<conta><titular>" + conta.getTitular()
					+ "</titular><saldo>" + conta.getSaldo()
					+ "</saldo></conta>");
		} else {
			outraResposta.responde(req, conta);
		}
	}
	
}
