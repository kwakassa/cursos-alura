package br.edu.alura.dp.aula2.chainR.ex6;

public class RespostaEmPorcento {
	private Resposta outraResposta;
	
    public RespostaEmPorcento(Resposta outraResposta) {
		this.outraResposta = outraResposta;
	}

	public void responde(Requisicao req, Conta conta) {
      if(req.getFormato() == Formato.PORCENTO) {
        System.out.println(conta.getTitular() + "%" + conta.getSaldo());
      }
      else {
        this.outraResposta.responde(req, conta);
      }
    }

}
