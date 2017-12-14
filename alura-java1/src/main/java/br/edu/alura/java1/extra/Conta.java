package br.edu.alura.java1.extra;

import java.util.Random;

/* --- Exemplo Modelo para Estruturar a codificação de uma Classe --- */
public class Conta {
	/* --- Definicao dos atributos --- */
	private long numero;
	private String titular;
	private double saldo;
	private int agencia;
	private static long contador = 1;
	private static Random aleatorio = new Random(); 
	
	/* --- Metodo(s) Construtor(es) --- */
	public Conta() {
		setProximoNumero();
	}	
	public Conta(int agencia, String titular) {
		setProximoNumero();
		this.titular = titular;
		this.agencia = agencia;
	}
	
	private void setProximoNumero(){
		this.numero = contador++;
	}
	
	public static Conta geraConta(){
		int agencia = aleatorio.nextInt(9000) + 1000;
		String[] nomes = {"Joao", "Jose", "Maria", "Claudia", "Marcos", "Tania"};
		Conta conta = new Conta(agencia, nomes[aleatorio.nextInt(nomes.length)]);
		return conta;
	}
	
	public void imprime(){
		String saidaTxt = "Conta [numero=" + numero + ", titular=" + titular + ", saldo=" + saldo + ", agencia=" + agencia + "]";
		System.out.println(saidaTxt);
	}
	
	/* Getters and Setters */
	public long getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public String getTitular() {
		return titular;
	}
	public void setTitular(String titular) {
		this.titular = titular;
	}
	public double getSaldo() {
		return saldo;
	}	
	public int getAgencia() {
		return agencia;
	}
	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}
	
	/* --- Metodos Negociais */
	void deposita(double valor){
		this.saldo += valor;
	}
	boolean saca(double valor){
		if(this.saldo >= valor){
			this.saldo -= valor;
			System.out.println("Saque de " + valor + " efetuado com sucesso!");
			return true;
		}else{
			System.out.println("Saldo Insuficiente!");
			return false;
		}
	}
	
	//Metodo main, nao recomendado misturar metodo de teste com a Classe Negocial
	public static void main(String[] args) {
		Conta conta = Conta.geraConta();
		conta.imprime();
		
		Conta.geraConta().imprime();
		Conta.geraConta().imprime();
		Conta.geraConta().imprime();
		Conta.geraConta().imprime();
		
	}
}
