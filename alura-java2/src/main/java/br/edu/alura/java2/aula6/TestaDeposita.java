package br.edu.alura.java2.aula6;

public class TestaDeposita {

	public static void main(String[] args) {
        Conta cp = new ContaCorrente();
        double valor = -100;
        try {
			cp.deposita(valor);
		} catch (ValorInvalidoException e) {
			System.out.println(e.getMessage());
		}
    }

}
