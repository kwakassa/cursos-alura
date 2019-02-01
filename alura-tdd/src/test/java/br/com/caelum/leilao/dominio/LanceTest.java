package br.com.caelum.leilao.dominio;

import static org.junit.Assert.*;

import org.junit.Test;

public class LanceTest {

	@Test
	public void testaSeMetodoEqualsFunciona() {
		Usuario usuario = new Usuario("Jose");
		Usuario usuarioMesmo = new Usuario("Jose");
		Lance lance1 = new Lance(usuario, 100.0);
		Lance lance2 = new Lance(usuarioMesmo, 100.0);
		assertTrue(lance1.equals(lance2));
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void deveRecusarLancesComValorNegativo(){
		new Lance(new Usuario("Jose"), -1);
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void deveRecusarLancesComValorDeZero(){
		new Lance(new Usuario("Jose"), 0);
	}
}
