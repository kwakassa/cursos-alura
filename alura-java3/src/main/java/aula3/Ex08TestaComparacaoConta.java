package aula3;

public class Ex08TestaComparacaoConta {

	public static void main(String[] args) {
		Conta c1 = new ContaCorrente();
		c1.setNumero(1234);
		Conta c2 = new ContaCorrente();
		c2.setNumero(1234);
		System.out.println("c1.equals(c2): " + c1.equals(c2));

	}
}
