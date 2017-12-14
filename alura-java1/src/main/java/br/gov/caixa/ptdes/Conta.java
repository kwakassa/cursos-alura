package br.gov.caixa.ptdes;
/* --- Exemplo Modelo para Estruturar a codificação de uma Classe --- */
public class Conta {
	/* --- Definicao dos atributos --- */
	private int numero;
	private String titular;
	private double saldo;
	private int agencia;
	
	/* --- Metodo(s) Construtor(es) --- */
	public Conta() {
		
	}	
	public Conta(int agencia, int numero, String titular) {
		this.numero = numero;
		this.titular = titular;
		this.agencia = agencia;
	}

	/* Getters and Setters */
	public int getNumero() {
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
}
