package br.gov.caixa.ptdes;

public class ConfiguracaoSingleton {
	
	private static ConfiguracaoSingleton cfs = new ConfiguracaoSingleton();
	
	private ConfiguracaoSingleton() {}
	
	public static ConfiguracaoSingleton getInstance(){
		return cfs;
	}
	
	public void configurar(){
		System.out.println("Configuracao Efetuada");
		System.out.println("toString(): " + toString());
	}
	
}
