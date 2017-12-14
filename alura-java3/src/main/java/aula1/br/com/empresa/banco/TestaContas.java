package aula1.br.com.empresa.banco;

import aula1.br.com.empresa.banco.conta.Conta;
import aula1.br.com.empresa.banco.conta.ContaCorrente;
import aula1.br.com.empresa.banco.conta.ContaPoupanca;

public class TestaContas {

	public static void main(String[] args) {
		Conta c = new ContaCorrente();
        Conta cc = new ContaCorrente();
        Conta cp = new ContaPoupanca();

        c.deposita(1000); 
        cc.deposita(1000); 
        cp.deposita(1000);

        c.atualiza(0.01);
        cc.atualiza(0.01);
        cp.atualiza(0.01);

        System.out.println(c.getSaldo());
        System.out.println(cc.getSaldo());
        System.out.println(cp.getSaldo());

	}

}
