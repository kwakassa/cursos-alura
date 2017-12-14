package br.edu.alura.dp.aula4.decorator;

import java.util.ArrayList;
import java.util.List;

public class FiltroMaiorQue500MilReais extends Filtro{
	
	public FiltroMaiorQue500MilReais() {
		super();
	}

	public FiltroMaiorQue500MilReais(Filtro outroFiltro) {
		super(outroFiltro);
	}

	@Override
	public List<Conta> filtra(List<Conta> contas) {
		List<Conta> filtrada = new ArrayList<Conta>();
		for (Conta c : contas) {
			if(c.getSaldo() > 500000) filtrada.add(c);
		}
		filtrada.addAll(proximo(contas));
		return filtrada;
	}

}
