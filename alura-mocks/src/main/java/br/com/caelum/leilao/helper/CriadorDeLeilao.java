package br.com.caelum.leilao.helper;

import java.util.Calendar;

import org.apache.log4j.Logger;

import br.com.caelum.leilao.dominio.Leilao;

public class CriadorDeLeilao {
	
	private static final Logger logger = Logger.getLogger(CriadorDeLeilao.class);
	
	private Leilao leilao;		
		
	public CriadorDeLeilao para(String descricao) {
		leilao = new Leilao(descricao);
		return this;
	}

	public CriadorDeLeilao naData(Calendar dataAntiga) {
		leilao = new Leilao(leilao.getDescricao(), dataAntiga);
		return this;
	}

	public Leilao constroi() {		
		return leilao;
	}
	
	

}
