package br.edu.alura.aula3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;

/** Lambdas funciona sempre q se tem uma interface com apenas 1 metodo abstrato e void - Chama-se Interface Funcional*/
public class OrdenaStringsIII {
	
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
		
		//palavras.sort((s1, s2) -> Integer.compare(s1.length(), s2.length()));//
		
		palavras.sort(Comparator.comparing(s -> s.length()));
		
		//A Expressao acima ew equivalente a
		//Function<String, Integer> funcao = s -> s.length();//Equivalente codificacao abaixo
		//Function<String, Integer> funcao = String::length;//Equivalente codificacao abaixo
		Function<String, Integer> funcao = new Function<String, Integer>() {			
			@Override
			public Integer apply(String s) {
				return s.length();
			}
		};
		Comparator<String> comparator = Comparator.comparing(funcao);
		palavras.sort(comparator);
		
		System.out.println(palavras);
		
//		Consumer<String> impressor = s -> System.out.println(s);
//		palavras.forEach(impressor);//palavras.forEach(s -> System.out.println(s));
		palavras.forEach(System.out::println);
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