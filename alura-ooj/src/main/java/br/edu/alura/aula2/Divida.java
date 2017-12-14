package br.edu.alura.aula2;

import java.util.Calendar;

public class Divida {
	private double total;
	private double valorPago;
	private Cnpj credor;
	private String cnpjCredor;
	private Pagamentos pagamentos = new Pagamentos();

	
	
	public String getCnpjCredor() {
		return this.cnpjCredor;
	}

	public Cnpj getCredor() {
		return this.credor;
	}

	public double getTotal() {
		return this.total;
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

	public Pagamentos pagamentosAntesDe(Calendar data) {
		Pagamentos pagamentosFiltrados = new Pagamentos();
		for (Pagamento pagamento : this.pagamentos) {
			if (pagamento.getData().before(data)) {
				pagamentosFiltrados.add(pagamento);
			}
		}
		return pagamentosFiltrados;
	}

	public Pagamentos pagamentosComValorMaiorQue(double valorMinimo) {
		Pagamentos pagamentosFiltrados = new Pagamentos();
		for (Pagamento pagamento : this.pagamentos) {
			if (pagamento.getValor() > valorMinimo) {
				pagamentosFiltrados.add(pagamento);
			}
		}
		return pagamentosFiltrados;
	}

	public Pagamentos pagamentosDo(String cnpjPagador) {
		Pagamentos pagamentosFiltrados = new Pagamentos();
		for (Pagamento pagamento : this.pagamentos) {
			if (pagamento.getCnpjPagador().equals(cnpjPagador)) {
				pagamentosFiltrados.add(pagamento);
			}
		}
		return pagamentosFiltrados;
	}

	public void registra(Pagamento pagamento) {
		this.pagamentos.add(pagamento);
		paga(pagamento.getValor());
	}

	public void setCnpjCredor(String cnpjCredor) {
		this.cnpjCredor = cnpjCredor;
	}

	public void setCredor(Cnpj credor) {
		this.credor = credor;
	}

	public void setTotal(double total) {
		this.total = total;
	}

	public double valorAPagar() {
		return this.total - this.valorPago;
	}
}
