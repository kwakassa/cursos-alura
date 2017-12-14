package br.edu.alura.dp.aula2.chainR.ex6;

public class RespostaVazia implements Resposta {

	public void responde(Requisicao req, Conta conta) {
		System.out.println("Sem Resposta ou Formato Invalido");
	}

}
