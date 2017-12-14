package br.edu.alura.dp.aula4.decorator;

import java.util.Calendar;

public class Conta {
    private double saldo;
    private String nome;
    private Calendar dataAbertura = Calendar.getInstance();
    
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

	public Calendar getDataAbertura() {return dataAbertura;}
	public void setDataAbertura(Calendar dataAbertura) {this.dataAbertura = dataAbertura;}
    
	
	
  }
