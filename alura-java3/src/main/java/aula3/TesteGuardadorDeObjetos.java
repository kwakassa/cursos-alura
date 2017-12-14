package aula3;

public class TesteGuardadorDeObjetos {

	public static void main(String[] args) {
		GuardadorDeObjetos guardador = new GuardadorDeObjetos();
	    Conta conta = new ContaCorrente();
	    guardador.adicionaObjeto(conta);

	    // ...

	    // pega a conta referenciado como objeto
	    Object object = guardador.pegaObjeto(0);

	    // será que posso invocar getSaldo em Object? : 
	    //object.getSaldo(); Nao pode.
	    Conta contaResgatada = (Conta) object;
	    contaResgatada.deposita(100.00);
	    System.out.println("Saldo: " + contaResgatada.getSaldo());
	}

}
