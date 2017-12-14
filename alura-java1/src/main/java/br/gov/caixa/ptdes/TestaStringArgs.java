package br.gov.caixa.ptdes;

public class TestaStringArgs {

	public static void main(String[] args) {
		
		System.out.println("args: " + args);
		System.out.println("tamanho: " + args.length);
		
		System.out.println("--- Usando FOR ---");
		for(int i=0 ; i < args.length ; i++){
			System.out.println("Parametro "+ (i+1) +": " + args[i]);
		}
		
		System.out.println("--- Usando FOREACH ---");
		int j=0;
		for (String arg : args) {
			System.out.println("Parametro " + (++j) + ": " + arg);
		}
	}

}
