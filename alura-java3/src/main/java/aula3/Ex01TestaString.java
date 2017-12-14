package aula3;

public class Ex01TestaString {
	public static void main(String[] args) {
		String s = "fj11";
		s.replaceAll("1", "2");
		System.out.println(s);
		s = s.replaceAll("1", "2");
		System.out.println(s);
	}
}
