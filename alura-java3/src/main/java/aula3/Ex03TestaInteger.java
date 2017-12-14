package aula3;

public class Ex03TestaInteger {

	public static void main(String[] args) {
		Integer x1 = new Integer(10);
	    Integer x2 = new Integer(10);
	    System.out.printf("Resultado(x1 == x2): ");
	    if (x1 == x2) {
	        System.out.println("igual");
	    } else {
	        System.out.println("diferente");
	    }
	    System.out.println("Apenas comparou a referencia.");
	    System.out.printf("Resultado(x1 == x2): " + x1.equals(x2));
	    System.out.println("Comparou o conteudo");
	}

}
