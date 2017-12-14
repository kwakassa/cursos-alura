package br.edu.alura.java1.aula2;

public class Java1Ex8 {
	
	
	/** Curiosamente, essa é a famosa conjectura de Collatz. Ninguém nunca conseguiu 
	 * demonstrar que para qualquer x o número em algum instante não será 1.
	 */
	public static void main(String[] args) {
		int x = 13;
		System.out.println("Valor Inicial: " + x);
		while(x!=1){
			if(x % 2==0){
				x /= 2;
			}else{
				x = 3*x + 1;
			}
			System.out.println(x);			
		}
	}
}
