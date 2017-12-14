package aula3;

public class Ex04TestaInteger {

	public static void main(String[] args) {
		Integer i1 = 30;//Java substitui por: Integer i1 = new Integer(30);
		System.out.println(i1);//Metodo toString sobrescrito
		
		String numtxt = "200";
		String txt = "N200";
		System.out.println(Integer.parseInt(numtxt));
		System.out.println(Integer.parseInt(txt));
		
	}

}
