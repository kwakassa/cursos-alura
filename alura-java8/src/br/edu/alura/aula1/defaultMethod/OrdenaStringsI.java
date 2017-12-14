package br.edu.alura.aula1.defaultMethod;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;

public class OrdenaStringsI {

	public static void main(String[] args) {
		//Inicializando Lista
		List<String> palavras = geraLista();		
		//Metodologia ate Java 7 - Sort - Uso de Classes Utilitarias
		System.out.println("--- Java 7 - Sort ---");
		Comparator<String> comparador = new ComparadorPorTamanhoI();		
		Collections.sort(palavras,comparador);		
		System.out.println(palavras);
		//Inicializando Lista
		palavras = geraLista();
		//Metodologia Java 8 - Sort - sort(Comparator c) Foi incorporado em List
		System.out.println("--- Java 8 - Sort ---");
		palavras.sort(comparador);
		System.out.println(palavras);
		/** A partir do Java 8, as Interfaces podem declarar metodos com implementacao
		 * Isso se chama Default Methods
		 */
		
		//Foreach ate java 7
		System.out.println("--- Java 7 - Foreach ---");
		for (String p : palavras) {
			System.out.println(p);
		}
		
		//Java 8
		System.out.println("--- Java 8 - Sort ---");
		Consumer<String> consumidor = new ConsumidorDeStringI();
		palavras.forEach(consumidor);
	}

	private static List<String> geraLista() {
		List<String> palavras = new ArrayList<String>();
		palavras.add("alura online");
		palavras.add("editora casa do codigo");
		palavras.add("caelum");
		return palavras;
	}

}

class ConsumidorDeStringI implements Consumer<String>{

	@Override
	public void accept(String s) {
		System.out.println(s);
	}
	
}
/** --- Classe implementando ordenação por tamanho --- */
class ComparadorPorTamanhoI implements Comparator<String>{

	@Override
	public int compare(String s1, String s2) {
		if(s1.length()<s2.length())
			return -1;
		if(s1.length()>s2.length())
			return 1;
		return 0;
	}
	
}