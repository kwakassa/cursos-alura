package aula3;

public class Ex02TestaString {

	public static void main(String[] args) {
		String texto1 = " String de exemplo ";
		System.out.println("String: \""+texto1+"\"");
		System.out.println("Contains \"exemplo\": " + texto1.contains("exemplo"));
		System.out.println("Trim: \"" + texto1.trim() + "\"");
		System.out.println("Replace WhiteSpace: \"" + texto1.replaceAll(" ", "") + "\"");
		System.out.println("IsEmpty: "+texto1.isEmpty());
		System.out.println("Lenght: " + texto1.length());
	}

}
