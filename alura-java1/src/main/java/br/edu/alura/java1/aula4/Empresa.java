package br.edu.alura.java1.aula4;

import br.edu.alura.java1.aula3.Funcionario;

public class Empresa {
	
	private String nome;
	private String cnpj;
	private int qtdFuncionarios = 0;
	private int maxFuncionarios = 10;
	private Funcionario[] funcionarios;
	
	public Empresa(int qdtMaxFuncionarios) {
		this.maxFuncionarios = qdtMaxFuncionarios;
		funcionarios = new Funcionario[maxFuncionarios];
	}
	
	public String getNome() {return nome;}
	public void setNome(String nome) {this.nome = nome;}
	public String getCnpj() {return cnpj;}
	public void setCnpj(String cnpj) {this.cnpj = cnpj;}
	public int getQtdFuncionarios() {return qtdFuncionarios;}
	public void setQtdFuncionarios(int qtdFuncionarios) {this.qtdFuncionarios = qtdFuncionarios;}
	public Funcionario[] getFuncionarios() {return funcionarios;}
	public void setFuncionarios(Funcionario[] funcionarios) {this.funcionarios = funcionarios;}

	public void adiciona(Funcionario f){
		if(qtdFuncionarios < maxFuncionarios){
			funcionarios[qtdFuncionarios] = f;
			qtdFuncionarios++;
		}
	}
	
	public boolean contem(Funcionario f){
		//qtdFuncionarios ew incrementado no metodo "adiciona()"
		for (int i=0;i<qtdFuncionarios;i++) {
			if(funcionarios[i] == f){
				return true;
			}
		}
		return false;
	}
	
	public void mostraTodasAsInformacoes(){
		for (int i=0;i<qtdFuncionarios;i++) {
			funcionarios[i].mostra();
		}
	}
	
	public void mostraEmpregados(){
		for (int i=0;i<qtdFuncionarios;i++) {
			System.out.println("Funcionário na posição: " + i);
            System.out.println("R$" + funcionarios[i].getSalario());
		}
	}
}
