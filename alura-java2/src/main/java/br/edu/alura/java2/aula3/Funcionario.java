package br.edu.alura.java2.aula3;

public class Funcionario {
	protected String nome;
    protected String cpf;
    protected double salario;
    
    //Getters e Setters
    public String getNome() {return nome;}
	public void setNome(String nome) {this.nome = nome;}
	public String getCpf() {return cpf;}
	public void setCpf(String cpf) {this.cpf = cpf;}
	public double getSalario() {return salario;}
	public void setSalario(double salario) {this.salario = salario;	}
	//Regras de Negocio
    public double getBonificacao() {
        return this.salario * 1.2;
    }
    // outros métodos aqui	

}
