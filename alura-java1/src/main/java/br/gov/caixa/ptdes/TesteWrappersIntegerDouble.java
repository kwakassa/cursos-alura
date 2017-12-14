package br.gov.caixa.ptdes;

public class TesteWrappersIntegerDouble {

	public static void main(String[] args) {
		int num1 = 5;
		
		Integer num2 = 6;//Mesmo que Integer num2 = new Integer(6);
		
		String num3 = "235";
		
		System.out.println("Soma num1 e num2: " + num1 + num2);
		
		System.out.println("Soma num1 e num2: " + (num1 + num2));
		
		System.out.println("Soma num1 e num2.intValue: " + (num1 + num2.intValue()));
		
		System.out.println("Soma num1 e num3: " + num1 + num3);
		
		int soma = num2 + Integer.parseInt(num3);
		
		System.out.println("Soma de num2 com parseInt() de Num3: " + soma);
		
		double d1 = 10.678;
		
		Double d2 = 50.789;//Mesmo que Double d1 = new Double(50.789);
		
		int num4 = (int)d1;
		
		System.out.println("num4 com casting de double: " + num4);
		
		int num5 = d2.intValue();
		
		System.out.println("num5 recebendo o metodo intValue de Double: " + num5);
		
		d1 = num2.doubleValue();
		
		System.out.println("d1 recebendo doubleValue de um int: " + d1);
		
	}

}
