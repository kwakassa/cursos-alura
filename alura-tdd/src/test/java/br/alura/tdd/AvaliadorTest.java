package br.alura.tdd;

import static org.junit.Assert.*;
import static org.hamcrest.MatcherAssert.*;
import static org.hamcrest.Matchers.*;
import java.util.List;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import br.alura.builder.CriadorDeLeilao;
import br.com.caelum.leilao.dominio.Lance;
import br.com.caelum.leilao.dominio.Leilao;
import br.com.caelum.leilao.dominio.Usuario;

public class AvaliadorTest {

	private Avaliador leiloeiro;
	private Usuario joao;
	private Usuario jose;
	private Usuario maria;

	@Before
	public void criaAvaliador() {
		this.leiloeiro = new Avaliador();
		this.joao = new Usuario("João");
		this.jose = new Usuario("José");
		this.maria = new Usuario("Maria");
	}

	@Test
	public void deveCalcularAMedia() {
		// cenario: 3 lances em ordem crescente
		Leilao leilao = new CriadorDeLeilao().para("Playstation 3 Novo").lance(maria, 300.0).lance(joao, 400.0)
				.lance(jose, 500.0).constroi();

		leiloeiro.avalia(leilao);

		// comparando a saida com o esperado
		assertEquals(400, leiloeiro.getMedia(), 0.0001);
	}

	@Test(expected = RuntimeException.class)
	public void testaMediaDeZeroLance() {

		// acao
		Leilao leilao = new CriadorDeLeilao().para("Iphone 7").constroi();

		leiloeiro.avalia(leilao);
	}

	@Test
	public void deveEntenderLancesEmOrdemCrescente() {

		Leilao leilao = new CriadorDeLeilao().para("Playstation 3 Novo").lance(joao, 250).lance(jose, 300)
				.lance(maria, 400).constroi();

		leiloeiro.avalia(leilao);

		assertThat(leiloeiro.getMenorLance(), equalTo(250.0));
		assertThat(leiloeiro.getMaiorLance(), equalTo(400.0));
	}

	@Test
	public void deveEntenderLancesEmOrdemCrescenteComOutrosValores() {

		Leilao leilao = new CriadorDeLeilao().para("Playstation 3 Novo").lance(maria, 1000.0).lance(joao, 2000.0)
				.lance(jose, 3000.0).constroi();

		Avaliador leiloeiro = new Avaliador();
		leiloeiro.avalia(leilao);

		Assert.assertEquals(3000, leiloeiro.getMaiorLance(), 0.0001);
		Assert.assertEquals(1000, leiloeiro.getMenorLance(), 0.0001);
	}

	@Test
	public void deveEntenderLeilaoComApenasUmLance() {
		Leilao leilao = new CriadorDeLeilao().para("Playstation 3 Novo").lance(joao, 1000).constroi();

		leiloeiro.avalia(leilao);

		assertThat(leiloeiro.getMenorLance(), equalTo(leiloeiro.getMaiorLance()));
	}

	@Test
	public void deveEncontrarOsTresMaioresLances() {

		Leilao leilao = new CriadorDeLeilao().para("Playstation 3 Novo").lance(joao, 100.0).lance(maria, 200.0)
				.lance(joao, 300.0).lance(maria, 400.0).constroi();

		leiloeiro.avalia(leilao);

		List<Lance> maiores = leiloeiro.getTresMaiores();
		System.out.println(maiores);
		assertEquals(3, maiores.size());

		assertThat(maiores, hasItems(new Lance(maria, 400.0), new Lance(joao, 300.0), new Lance(maria, 200.0)));
	}

	@Test
	public void deveEntenderLeilaoComLancesEmOrdemRandomica() {
		Leilao leilao = new CriadorDeLeilao().para("Playstation 3 Novo").lance(joao, 200.).lance(maria, 450.0)
				.lance(joao, 120.0).lance(maria, 700.0).lance(joao, 630.0).lance(maria, 230.0).constroi();

		leiloeiro.avalia(leilao);

		assertEquals(700.0, leiloeiro.getMaiorLance(), 0.0001);
		assertEquals(120.0, leiloeiro.getMenorLance(), 0.0001);
	}

	@Test(expected = RuntimeException.class)
	public void naoDeveAvaliarLeiloesSemNenhumLanceDado() {
		Leilao leilao = new CriadorDeLeilao().para("Playstation 3 Novo").constroi();

		leiloeiro.avalia(leilao);
	}
}
