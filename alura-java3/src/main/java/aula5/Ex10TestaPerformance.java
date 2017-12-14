package aula5;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;

public class Ex10TestaPerformance {
	public static void performanceTeste(Collection<Integer> lista, String tipoLista) {
		System.out.println("Iniciando...Teste com " + tipoLista);
		Collection<Integer> teste = lista;
		int total = 30000;

		long inicio = System.currentTimeMillis();
		long inicioTotal = inicio;
		for (int i = 0; i < total; i++) {
			teste.add(i);
		}
		long fim = System.currentTimeMillis();
		long tempo = fim - inicio;
		System.out.println("Tempo de Insercao na Lista: " + tempo);

		inicio = System.currentTimeMillis();
		for (int i = 0; i < total; i++) {
			teste.contains(i);
		}
		fim = System.currentTimeMillis();
		tempo = fim - inicio;
		System.out.println("Tempo gasto nas buscas: " + tempo);
		long fimTotal = fim;
		long tempoTotal = fimTotal - inicioTotal;
		System.out.println("Tempo Total gasto(" + tipoLista + "): " + tempoTotal);
	}

	public static void main(String[] args) {
		performanceTeste(new ArrayList<Integer>(), "ArrayList");
		System.out.println();
		performanceTeste(new HashSet<Integer>(), "HashSet");
	}
}
