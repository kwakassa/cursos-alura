package br.com.caelum.leilao.infra.dao;

import static org.junit.Assert.*;

import org.junit.Test;
import org.mockito.exceptions.misusing.MissingMethodInvocationException;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class LeilaoDaoTest {
	
	/** Nao ew possivel testar metodos estaticos, por isso o mockito 
	 * lanca a excecao MissingMethodInvocationException **/
	@Test(expected = MissingMethodInvocationException.class)
	public void testTeste() {
		LeilaoDao daoFalso = mock(LeilaoDao.class);
		when(daoFalso.teste()).thenReturn("retorno");
		assertTrue(daoFalso.teste().equals("retorno"));
	}

}
