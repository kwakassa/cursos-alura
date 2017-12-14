package br.edu.alura.dp.aula1.strategy;

public class TesteDeImpostos {
	
	public static void testeIccc(){
		Orcamento reforma = new Orcamento(500.0);

        Imposto novoImposto = new ICCC();
        System.out.println(novoImposto.calcula(reforma));
	}
	
	public static void testeIssIcms(){
		Imposto iss = new ISS();
		Imposto icms = new ICMS();

		Orcamento orcamento = new Orcamento(500.0);

		CalculadorDeImpostos calculador = new CalculadorDeImpostos();

		// Calculando o ISS
		calculador.realizaCalculo(orcamento, iss);

		// Calculando o ICMS
		calculador.realizaCalculo(orcamento, icms);
	}
	
	public static void main(String[] args) {
		testeIccc();
	}
}
