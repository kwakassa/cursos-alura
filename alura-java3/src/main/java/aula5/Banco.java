package aula5;

import java.util.HashMap;
import java.util.Map;

public class Banco {
	private Map<String, Conta> contas = new HashMap<String, Conta>();

	public void adiciona(Conta c) {
		contas.put(c.getNome(), c);
	}

	public Conta pega(String nome) {
		return contas.get(nome);
	}

	public int pegaQuantidadeDeContas() {
		return contas.size();
	}

	public void adicionaLista(Map<String, Conta> listaContas) {
		this.contas = listaContas;
	}
	
	public Conta buscaPorNome(String nome) {
		return contas.get(nome);
	}

}
