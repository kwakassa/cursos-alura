package br.edu.alura.aula2;

public class Cnpj {
	private String valor;

    public Cnpj(String valor) {
        this.valor = valor;
    }
	public boolean cnpjValido() {
		return primeiroDigitoVerificadorDoCnpj() == primeiroDigitoCorretoParaCnpj()
				&& segundoDigitoVerificadorDoCnpj() == segundoDigitoCorretoParaCnpj();
	}
	public boolean ehValido() {
		return true;
	}
	private int primeiroDigitoCorretoParaCnpj() {
		// Extrai o primeiro dígito verificador do CNPJ armazenado
		// no atributo cnpj
		return 0;
	}

	private int primeiroDigitoVerificadorDoCnpj() {
		// Extrai o segundo dígito verificador do CNPJ armazenado
		// no atributo cnpj
		return 0;
	}

	private int segundoDigitoCorretoParaCnpj() {
		// Calcula o primeiro dígito verificador correto para
		// o CNPJ armazenado no atributo cnpj
		return 0;
	}

	private int segundoDigitoVerificadorDoCnpj() {
		// Calcula o primeiro dígito verificador correto para
		// o CNPJ armazenado no atributo cnpj
		return 0;
	}
	
	public String getValor() {
		return this.valor;
	}

}
