package aula1.br.com.empresa.banco;

import aula1.br.com.empresa.banco.conta.ContaCorrente;
import aula1.br.com.empresa.banco.conta.Tributavel;

public class TestaTributavel {

    public static void main(String[] args) {
        ContaCorrente cc = new ContaCorrente();
        cc.deposita(100);
        System.out.println(cc.calculaTributos());

        // testando polimorfismo:
        Tributavel t = cc;
        System.out.println(t.calculaTributos());
    }
}