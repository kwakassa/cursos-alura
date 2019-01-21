package br.com.caelum.leilao.helper;

import java.util.Calendar;

import br.com.caelum.leilao.interfaces.Relogio;

public class RelogioDoSistema implements Relogio {
	public Calendar hoje() {
		return Calendar.getInstance();
	}
}
