package br.edu.alura.aula1;

import java.util.ArrayList;

public class Divida {
	private double total;
	private double valorPago;
	private String credor;
	private String cnpjCredor;
	private ArrayList<Pagamento> pagamentos = new ArrayList<Pagamento>();

	public double getTotal() {
		return this.total;
	}

	public void setTotal(double total) {
		this.total = total;
	}

	public double getValorPago() {
		return this.valorPago;
	}

	public String getCredor() {
		return this.credor;
	}

	public void setCredor(String credor) {
		this.credor = credor;
	}

	public String getCnpjCredor() {
		return this.cnpjCredor;
	}

	public void setCnpjCredor(String cnpjCredor) {
		this.cnpjCredor = cnpjCredor;
	}

	public ArrayList<Pagamento> getPagamentos() {
		return this.pagamentos;
	}

	public void setPagamentos(ArrayList<Pagamento> pagamentos) {
		this.pagamentos = pagamentos;
	}

	private void paga(double valor) {
		if (valor < 0) {
			throw new IllegalArgumentException("Valor invalido para pagamento");
		}
		if (valor > 100) {
			valor = valor - 8;
		}
		this.valorPago += valor;
	}
	
	public void registra(Pagamento pagamento) {
		this.pagamentos.add(pagamento);
		this.paga(pagamento.getValor() );
		
		
	}
}
