package br.edu.alura.dp.aula5.state;

import java.util.Calendar;

public class Conta {
    protected double saldo;
    private String nome;
    private Calendar dataAbertura = Calendar.getInstance();
    protected EstadoDaConta estadoDaConta; 
    
    public Conta(double deposito, String titular) {
		deposita(deposito);
		setTitular(titular);
		estadoDaConta = new Positivo();
	}

	public void deposita(double valor) {
      estadoDaConta.deposita(this, valor);
    }
	public void saca(double valor) {
        estadoDaConta.saca(this, valor);
    }
    public double getSaldo() {return this.saldo;}

	public String getTitular() {return nome;}
	private void setTitular(String nome) {this.nome = nome;}

	public Calendar getDataAbertura() {return dataAbertura;}
	public void setDataAbertura(Calendar dataAbertura) {this.dataAbertura = dataAbertura;}
    
	
	
  }
