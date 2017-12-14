package aula1.br.com.empresa.banco.conta;

public class ValorInvalidoException extends RuntimeException {

	private static final long serialVersionUID = 1L;
	public ValorInvalidoException(String msg) {
		super(msg);
	}
	
	public ValorInvalidoException(double valor) {
        super("Valor invalido: " + valor);
    }
}
