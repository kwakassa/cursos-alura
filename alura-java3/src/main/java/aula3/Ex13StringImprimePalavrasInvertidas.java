package aula3;

public class Ex13StringImprimePalavrasInvertidas {
	
	public static String invertePalavras(String frase){
		String[] palavras = frase.split(" ");
		String fraseInvertida = "";
		for(int i=palavras.length - 1 ; i >=0 ; i--){
			fraseInvertida += palavras[i] + "";
			if(i>0){
				fraseInvertida += " ";
			}
		}
		return fraseInvertida;
	}
	
	public static void main(String[] args) {
		String string = "Socorram-me, subi no ônibus em Marrocos";
		System.out.println("Original: " + string);
		System.out.println("Invertida: " + invertePalavras(string));
		string = "anotaram a data da maratona";
		System.out.println("Original: " + string);
		System.out.println("Invertida: " + invertePalavras(string));
	}
}