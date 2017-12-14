package aula3;

public class Ex10TestaComparacaoConta {

	public static void main(String[] args) {
		Conta c1 = new ContaCorrente();
		c1.setNumero(1234);
		c1.setNome("Fulano de Tal");
		Conta c2 = new ContaCorrente();
		c2.setNumero(1234);
		c2.setNome("Fulano de Tal");
		System.out.println("c1.equals(c2): " + c1.equals(c2));
		System.out.println("Alterando o nome da 2a conta");
		c2.setNome("Ciclano de Tal");
		System.out.println("c1.equals(c2): " + c1.equals(c2));
	}

}
