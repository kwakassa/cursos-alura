package br.edu.alura.java2.aula6;

public class ValorInvalidoException extends RuntimeException {

	private static final long serialVersionUID = 1L;
	public ValorInvalidoException(String msg) {
		super(msg);
	}
	
	public ValorInvalidoException(double valor) {
        super("Valor invalido: " + valor);
    }
}
