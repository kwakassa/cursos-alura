package br.edu.alura.teste;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

import br.edu.alura.vo.Aula;

public class TestandoListas {
	public static void main(String[] args) {
		String curso1 = "Java 8: Tire proveito dos novos recursos da linguagem";
        String curso2 = "Apache Camel";
        String curso3 = "Certificacao Java SE 8 Programmer I";

        ArrayList<String> cursos = new ArrayList<>();
        cursos.add(curso1);
        cursos.add(curso2);
        cursos.add(curso3);        

        System.out.println(cursos);
        
        cursos.remove(1);
        
        Collections.sort(cursos);

        System.out.println(cursos);
        
        Aula a1 = new Aula("Revistando as ArrayLists", 21);
        Aula a2 = new Aula("Listas de objetos", 20);
        Aula a3 = new Aula("Relacionamento de listas e objetos", 15);

        // codigo para criar a lista de aulas
        ArrayList<Aula> aulas = new ArrayList<>();
        aulas.add(a1);
        aulas.add(a2);
        aulas.add(a3);
        System.out.println(aulas);
        //Outro Jeito
        aulas.sort(Comparator.comparing(Aula::getTempo));
        
        System.out.println(aulas);
	}
}
