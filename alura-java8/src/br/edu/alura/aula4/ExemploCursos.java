package br.edu.alura.aula4;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class Curso{
	private String nome;
	private int alunos;	
	public Curso(String nome, int alunos) {
		this.nome = nome;
		this.alunos = alunos;
	}
	public String getNome() {return nome;}
	public int getAlunos() {return alunos;}	
}

public class ExemploCursos {
	public static void main(String[] args) {
		List<Curso> cursos = new ArrayList<>();
		cursos.add(new Curso("Python", 45));
		cursos.add(new Curso("JavaScript", 150));
		cursos.add(new Curso("Java 8", 113));
		cursos.add(new Curso("C", 55));
		
		cursos.sort(Comparator.comparingInt(Curso::getAlunos));
		
		System.out.println("--- Ordenando por Qtd de Alunos ---");
		cursos.forEach(c -> System.out.println(c.getNome() + ": " + c.getAlunos() + " alunos"));
		
		System.out.println("--- Filtrando Qdt > 50 ---");
		cursos.stream().filter(c -> c.getAlunos() >= 50).forEach(c -> System.out.println(c.getNome() + ": " + c.getAlunos() + " alunos"));
		
		System.out.println("--- Imprimindo so os nomes dos cursos ---");
		Stream<String> nomes = cursos.stream().map(Curso::getNome);
		nomes.forEach(n -> System.out.println(n));
		
		System.out.println("--- Filtrando qtd > 50 e Imprimindo so as qts ---");
		cursos.stream().filter(c -> c.getAlunos() > 50).map(c -> c.getAlunos()).forEach(System.out::println);
		
		System.out.println("--- Filtrando Qtd > 50 e Imprimindo a soma ---");
		int sum = cursos.stream().filter(c -> c.getAlunos() > 50).mapToInt(Curso::getAlunos).sum();		
		System.out.println(sum);
		
		System.out.println("--- Filtrando Qtd > 50 e Imprimindo a Qualquer um ---");
		Optional<Curso> findAny = cursos.stream().filter(c -> c.getAlunos() > 50).findAny();
		System.out.println(findAny.get().getNome());
		
	}
}
