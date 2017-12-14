package br.edu.alura.java2.aula5;

public class Circulo implements AreaCalculavel {
	
	double raio;
	
	public Circulo(double raio) {
		this.raio = raio;
	}

	public double calculaArea() {
		return Math.PI*raio*raio;
	}

}
