package br.edu.alura.dp.aula2.chainR.ex6;

public class Conta {
    private double saldo;
    private String nome;
    
    public Conta(double deposito, String titular) {
		deposita(deposito);
		setTitular(titular);
	}

	public void deposita(double valor) {
      this.saldo += valor;
    }

    public double getSaldo() {return this.saldo;}

	public String getTitular() {return nome;}
	private void setTitular(String nome) {this.nome = nome;}
    
	
  }
