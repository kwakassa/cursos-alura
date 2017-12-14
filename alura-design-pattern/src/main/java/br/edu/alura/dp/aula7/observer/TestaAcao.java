package br.edu.alura.dp.aula7.observer;

import br.edu.alura.dp.aula6.builder.ItemDaNota;

public class TestaAcao {

	public static void main(String[] args) {
		NotaFiscalBuilder builder = new NotaFiscalBuilder();
        builder.adicionaAcao(new EnviadorDeEmail());
        builder.adicionaAcao(new NotaFiscalDao());
        builder.adicionaAcao(new EnviadorDeSms());
        builder.adicionaAcao(new Impressora());
        builder.adicionaAcao(new Multiplicador(1.01));

        NotaFiscal notaFiscal = builder.paraEmpresa("Caelum")
                          .comCnpj("123.456.789/0001-10")
                          .com(new ItemDaNota("item 1", 100.0))
                          .com(new ItemDaNota("item 2", 200.0))
                          .com(new ItemDaNota("item 3", 300.0))
                          .comObservacoes("entregar notaFiscal pessoalmente")
                          .constroi();
	}

}
