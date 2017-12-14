package aula3;

public class Ex12StringImprimeLetrasPorLinhaInverso {
	
	public static void imprimeInverso(String string){
		
		System.out.println("String: "+ string);
		System.out.println("Saida:");
		for(int i=string.length()-1 ; i >=0 ; i--){
			System.out.println(string.charAt(i));
		}
	}
	
	public static void main(String[] args) {
		String string = "Socorram-me, subi no ônibus em Marrocos";
		imprimeInverso(string);
		string = "anotaram a data da maratona";
		imprimeInverso(string);
	}
}
