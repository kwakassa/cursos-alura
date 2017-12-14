package aula3;

public class Ex15StringToInt {
	
	public static int getInteger(String s){
		int num = 0;
		for(int i=0;i<s.length();i++){
			int aux = Character.getNumericValue(s.charAt(i));
			System.out.println("Aux: " + aux);
			int tmp = (int) (aux * Math.pow(10,(s.length()-1)-i));
			System.out.println("Temp: " + tmp);
			num += tmp;
			System.out.println("numTmp: " + num);
		}
		return num;
	}
	
	public static void main(String[] args) {
		String numtxt = "321";
		int resultado = getInteger(numtxt);
		System.out.println("Resultado: " + resultado);

	}

}
