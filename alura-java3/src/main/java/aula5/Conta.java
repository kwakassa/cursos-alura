package aula5;

public abstract class Conta implements Comparable<Conta>{
	protected long numero;
	protected String nome;
	protected double saldo;
	
	public long getNumero() {return numero;}
	public void setNumero(long numero) {this.numero = numero;}	
	public String getNome() {return nome;}
	public void setNome(String nome) {this.nome = nome;}
	public double getSaldo() {return saldo;}
	public void deposita(double valor) {this.saldo += valor;}

	public void saca(double valor) {
		if (this.saldo >= valor) {
			this.saldo -= valor;
		} else {
			System.out.println("Saldo Indisponivel");
		}
	}

	public void atualiza(double taxa) {// espera-se taxa entre 0 e 1
		if (taxa >= 0 && taxa <= 1) {
			this.saldo += taxa * this.saldo;
		} else {
			System.out.println("Taxa deve estar entre 0 e 1");
		}
	}
	
	@Override
	public String toString() {
		return "Esse objeto é uma conta com saldo R$" + this.saldo;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		result = prime * result + (int) (numero ^ (numero >>> 32));
		long temp;
		temp = Double.doubleToLongBits(saldo);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Conta other = (Conta) obj;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		if (numero != other.numero)
			return false;
		if (Double.doubleToLongBits(saldo) != Double.doubleToLongBits(other.saldo))
			return false;
		return true;
	}
	public int compareTo(Conta c) {
		if (this.numero < c.numero) {
			return -1;
		}
		if (this.numero > c.numero) {
			return 1;
		}
		return 0;
	}
	public static void testeBooleanOperator() {
		boolean valida = true;
		System.out.println("valida: " + valida);
		System.out.println("valida &= true");
		valida &= true;		
		System.out.println("valida: " + valida);
		System.out.println("valida &= false");
		valida &= false;		
		System.out.println("valida: " + valida);
		System.out.println("valida &= true");
		valida &= true;		
		System.out.println("valida: " + valida);
	}
	
	public static void main(String[] args) {
		Conta c = new ContaCorrente();
		c.deposita(100);
		c.atualiza(0.01);
		System.out.println(c.getSaldo());
		testeBooleanOperator();
	}
}
