package br.edu.alura.dp.aula3.tmethod;

public class Conta {
    private double saldo;
    private String nome;
    private long numero;
    private int agencia;
    
    public Conta(double deposito, String titular, long numero, int agencia) {
		deposita(deposito);
		setTitular(titular);
		setNumero(numero);
		setAgencia(agencia);
	}

	public void deposita(double valor) {
      this.saldo += valor;
    }

    public double getSaldo() {return this.saldo;}
	public String getTitular() {return nome;}
	private void setTitular(String nome) {this.nome = nome;}
	public long getNumero() {return this.numero;}
	private void setNumero(long numero) {this.numero = numero;}
	public int getAgencia() {return this.agencia;}
	private void setAgencia(int agencia) {this.agencia = agencia;}
	
  }
