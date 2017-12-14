package br.edu.alura.java1.aula3;

public class Funcionario {
	private String nome;
	private String departamento;
	private double salario;
	private Data dataEntrada;
	private String RG;
	private int identificador;
	private static int proxId = 1;
	//Construtores
	public Funcionario(String nome) {
		this.setNome(nome);
		this.identificador = proxId;
		proxId++;
	}
	public Funcionario() {}
	//Getter e Setters
	public String getNome() {return nome;}
	public void setNome(String nome) {this.nome = nome;}
	public String getDepartamento() {return departamento;}
	public void setDepartamento(String departamento) {this.departamento = departamento;}
	public double getSalario() {return salario;}
	public void setSalario(double salario) {this.salario = salario;}
	public Data getDataEntrada() {return dataEntrada;}
	public void setDataEntrada(Data dataEntrada) {this.dataEntrada = dataEntrada;}
	public String getRG() {return RG;}
	public void setRG(String rG) {RG = rG;}	
	public int getIdentificador() {return identificador;}
	//Metodos e Regras de Negocio
	public void recebeAumento(double valorAumento){
		this.salario += valorAumento;
	}
	
	public double getGanhoAnual(){
		return salario * 12;
	}
	public void mostra(){
		System.out.println("Nome:" + this.nome);
		System.out.println("Departamento:" + this.departamento);
		System.out.println("Salario atual:" + this.salario);
		System.out.println("Data de Entrada:" + this.dataEntrada);
		System.out.println("RG:" + this.RG);
        System.out.println("Ganho anual:" + this.getGanhoAnual());
	}
	//Main para teste
	public static void main(String[] args) {		
		Funcionario f1 = new Funcionario();

        f1.nome = "Hugo";
        f1.salario = 100;
        f1.recebeAumento(50);

        f1.mostra();
	}

}
