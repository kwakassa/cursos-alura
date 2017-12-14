package br.edu.alura.java1.aula3;

public class TestaFuncionario {
	
	public static void main(String[] args) {
		Funcionario f1 = new Funcionario();

        f1.setNome("Hugo");
        f1.setSalario(100);
        f1.recebeAumento(50);
        Data data = new Data(10,1,2001);
        f1.setDataEntrada(data);
        
        f1.mostra();
	}

}
