package br.edu.alura.aula2.lambda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;

/** Lambdas funciona sempre q se tem uma interface com apenas 1 metodo abstrato e void - Chama-se Interface Funcional*/
public class OrdenaStringsII {
	
	private static List<String> geraLista() {
		List<String> palavras = new ArrayList<String>();
		palavras.add("alura online");
		palavras.add("editora casa do codigo");
		palavras.add("caelum");
		return palavras;
	}
	
	public static void main(String[] args) {
		//Inicializando Lista
		List<String> palavras = geraLista();		
		//Metodologia ate Java 7 - Sort - Uso de Classes Utilitarias
		System.out.println("--- Java 7 - Sort ---");
		Comparator<String> comparador = new ComparadorPorTamanhoII();		
		Collections.sort(palavras,comparador);		
		System.out.println(palavras);
		//Inicializando Lista
		palavras = geraLista();
		//Metodologia Java 8 - Sort - sort(Comparator c) Foi incorporado em List
		System.out.println("--- Java 8 - Sort ---");
		palavras.sort((s1, s2) -> Integer.compare(s1.length(), s2.length()));//
		
		System.out.println(palavras);
		/** A partir do Java 8, as Interfaces podem declarar metodos com implementacao
		 * Isso se chama Default Methods
		 */
		
		//Foreach ate java 7
		System.out.println("--- Java 7 - Foreach ---");
		for (String p : palavras) {
			System.out.println(p);
		}
		
		
		/** Classes Anonimas */
		System.out.println("No Java 7 - Classes Anonimas");
		palavras.forEach(new Consumer<String>() {
			@Override
			public void accept(String t) {
				System.out.println(t);				
			}			
		});
		/** Lambdas - Java já infere o tipo. É Equivalante ao trecho anterior sobre Classe Anonima*/
		System.out.println("No Java 8 - Lambdas");
		palavras.forEach(t -> System.out.println(t));
		
		/** outro jeito para expressao Lambda retornando um Consumer */
		Consumer<String> impressor = s -> System.out.println(s);
		palavras.forEach(impressor);
		
		
	}
}

class ComparadorPorTamanhoII implements Comparator<String>{

	@Override
	public int compare(String s1, String s2) {
		if(s1.length()<s2.length())
			return -1;
		if(s1.length()>s2.length())
			return 1;
		return 0;
	}
	
}