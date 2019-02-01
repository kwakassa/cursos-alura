package br.alura.matcher;

import org.hamcrest.Description;
import org.hamcrest.Matcher;
import org.hamcrest.TypeSafeMatcher;

import br.com.caelum.leilao.dominio.Lance;
import br.com.caelum.leilao.dominio.Leilao;

public class LeilaoMatcher extends TypeSafeMatcher<Leilao> {
	
	private final Lance lance;
	
	public LeilaoMatcher(Lance lance) {
		this.lance = lance;		
	}
	
	public static Matcher<Leilao> temUmLance(Lance lance) {
        return new LeilaoMatcher(lance);
    }
	
	@Override
	public void describeTo(Description descricao) {
		descricao.appendText("leilao com lance " + lance.getValor());
	}

	@Override
	protected boolean matchesSafely(Leilao leilao) {
		return leilao.getLances().contains(lance);
	}

}
