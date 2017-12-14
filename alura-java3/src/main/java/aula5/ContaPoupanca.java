package aula5;

public class ContaPoupanca extends Conta {

	public ContaPoupanca() {}
	
	public ContaPoupanca(int num, String titular) {
		this.numero = num;
		this.nome = titular;
	}

	public void atualiza(double taxa) {
		super.atualiza(taxa * 3);
	}

	public void deposita(double valor) {
		this.saldo += valor - 0.10;
	}

	@Override
	public String toString() {
		return "ContaPoupanca [num=" + numero + ", titular=" + nome + "]";
	}
	
	public int compareTo(Conta c) {
		return (this.getNome().compareTo(c.getNome()));
	}
}
