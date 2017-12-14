package br.gov.caixa.ptdes;

public class TestaConfiguracaoSingleton {
	public static void main(String[] args) {
		
		System.out.println(" --- Singleton Config 1 ----");
		ConfiguracaoSingleton c1 = ConfiguracaoSingleton.getInstance();		
		c1.configurar();
		
		System.out.println();
		
		System.out.println(" --- Singleton Config 2 ---");
		ConfiguracaoSingleton c2 = ConfiguracaoSingleton.getInstance();		
		c2.configurar();
	}
}
