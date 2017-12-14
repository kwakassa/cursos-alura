package aula3;

public class TesteContaToString {
	public static void main(String[] args) {
		Conta c = new ContaCorrente();
		c.deposita(100);
		System.out.println(c); // O toString é chamado pela classe PrintStream
	}
}
