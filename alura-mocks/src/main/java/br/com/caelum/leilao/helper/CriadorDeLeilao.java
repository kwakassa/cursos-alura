package br.com.caelum.leilao.helper;

import java.util.Calendar;

import org.apache.log4j.Logger;

import br.com.caelum.leilao.dominio.Lance;
import br.com.caelum.leilao.dominio.Leilao;
import br.com.caelum.leilao.dominio.Usuario;

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

	public CriadorDeLeilao lance(Usuario usuario, double d) {
		Lance lance = new Lance(usuario,d);
		leilao.propoe(lance);
		return this;
	}
	
	

}
