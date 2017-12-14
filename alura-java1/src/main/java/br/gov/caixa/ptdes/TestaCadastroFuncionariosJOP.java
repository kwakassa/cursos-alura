package br.gov.caixa.ptdes;

import java.text.ParseException;

import javax.swing.JOptionPane;

class Funcionario{
	private String nome;
	public Funcionario(String nome) {
		this.nome = nome;
	}
	public String getNome(){
		return this.nome;
	}
}

class Empresa{
	private int numFuncionarios = 0;
	private int maxFuncionarios = 10;
	private Funcionario[] listaFuncionarios;
	public Empresa(int maxFuncionarios) {
		this.maxFuncionarios = maxFuncionarios;
		listaFuncionarios = new Funcionario[this.maxFuncionarios];
	}
	public void adiciona(Funcionario funcionario){
		if(numFuncionarios<maxFuncionarios){
			listaFuncionarios[numFuncionarios] = funcionario;
			numFuncionarios++;
		}else{
			JOptionPane.showMessageDialog(null, "Numero maximo de funcionarios da empresa atingido.");
		}
	}
	public String getListaFuncionarios(){
		String listaTxt = "";
		for (int i=0;i<numFuncionarios;i++) {
			listaTxt += listaFuncionarios[i].getNome() + "\n";
		}
		return listaTxt;
	}
}

public class TestaCadastroFuncionariosJOP {
	public static void main(String[] args) throws ParseException {
		String maxFuncionariosTxt = JOptionPane.showInputDialog(null, "Insira a quantidade de Funcionarios da Empresa:");
		int maxFuncionarios = Integer.parseInt(maxFuncionariosTxt);
		Empresa empresa = new Empresa(maxFuncionarios);
		int numeroFuncionariosCadastrados = 0;
		while(numeroFuncionariosCadastrados < maxFuncionarios){
			String nomeFuncionario = JOptionPane.showInputDialog(null, "Insira nome do novo funcionario:");
			if(nomeFuncionario.trim().equals("")){
				break;
			}else{
				Funcionario f = new Funcionario(nomeFuncionario);
				empresa.adiciona(f);
				numeroFuncionariosCadastrados++;
			}
		}
		JOptionPane.showMessageDialog(null, "Quadro de Funcionarios:\n"+empresa.getListaFuncionarios());
		
	}
}
