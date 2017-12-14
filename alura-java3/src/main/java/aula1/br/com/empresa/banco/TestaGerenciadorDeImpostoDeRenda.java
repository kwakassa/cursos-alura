package aula1.br.com.empresa.banco;

import aula1.br.com.empresa.banco.conta.ContaCorrente;
import aula1.br.com.empresa.banco.produto.SeguroDeVida;
import aula1.br.com.empresa.banco.sistema.GerenciadorDeImpostoDeRenda;

public class TestaGerenciadorDeImpostoDeRenda {
	public static void main(String[] args) {

        GerenciadorDeImpostoDeRenda gerenciador = 
                    new GerenciadorDeImpostoDeRenda();

        SeguroDeVida sv = new SeguroDeVida();
        gerenciador.adiciona(sv);

        ContaCorrente cc = new ContaCorrente();
        cc.deposita(1000);
        gerenciador.adiciona(cc);

        System.out.println(gerenciador.getTotal());
        System.out.printf("O saldo é: %.2f", cc.getSaldo());
    }
}
