package br.edu.alura.java1.aula4;

import br.edu.alura.java1.aula3.Funcionario;

public class TestaEmpresa {

	public static void main(String[] args) {
		
		Empresa empresa = new Empresa(10);
		
		for (int i = 0; i < 5; i++) {
	        Funcionario f = new Funcionario();
	        f.setSalario(1000 + i * 100);
	        empresa.adiciona(f);
	    }
	    
	    System.out.println("Qtd Funcinarios: " + empresa.getQtdFuncionarios());
	    empresa.mostraTodasAsInformacoes();
	}

}
