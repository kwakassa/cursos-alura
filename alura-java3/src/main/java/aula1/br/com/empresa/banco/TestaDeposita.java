package aula1.br.com.empresa.banco;

import aula1.br.com.empresa.banco.conta.Conta;
import aula1.br.com.empresa.banco.conta.ContaCorrente;
import aula1.br.com.empresa.banco.conta.ValorInvalidoException;

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
