package br.gov.caixa.ptdes;

public class CalculaMediaMain {

	public static void main(String[] args){
		
		double soma = 0;
		double media = 0;
		
		if(args.length==0){
			System.out.println("Notas nao informadas.");
		}else{
			/* Converte os valores para double e soma */
			for (String nota : args) {
				soma += Double.parseDouble(nota);
			}
			/* Calcula a media */
			media = soma / args.length;
		}
		
		System.out.println("Media das Notas: " + media);
	}

}