package extra;

/**
 * Essa classe é referente ao curso de Java 2
 * 
 * @author c096489
 * @version 1.0.0
 * @since 1.0
 *
 */
public class Conta {
	
	private double saldo;

	public double getSaldo() {
		return saldo;
	}
	
	public void deposita(double valor){
		this.saldo += valor;
	}
	
	public void saca(double valor){
		if(this.saldo >= valor){
			this.saldo -= valor;
		}else{
			System.out.println("Saldo Indisponivel");
		}
	}
	
}
