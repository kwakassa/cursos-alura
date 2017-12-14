package br.gov.caixa.ptdes;

public class OperadoresCompostos {
	
	
	public static void main(String[] args) {
		int x = 1; // Atribui 1 a x
		
		System.out.println(" --- Operadores Aritmeticos --- ");
		System.out.println(" -------- " + "+=" + " -------- ");
		System.out.println("Para x = " + x);
		x += 5; // Equivalente a x = x + 5;
		System.out.println("x += 5 -> resultado: x=" + x);
		
		System.out.println(" -------- " + "*=" + " -------- ");
		System.out.println("Para x = " + x);
		x *= 2; // Equivalente a x = x * 2;
		System.out.println("x *= 2 -> resultado: x=" + x);
		
		System.out.println(" -------- " + "/=" + " -------- ");
		System.out.println("Para x = " + x);
		x /= 2; // Equivalente a x = x / 2;
		System.out.println("x /= 2 -> resultado: x=" + x);
		
		System.out.println(" -------- " + "-=" + " -------- ");
		System.out.println("Para x = " + x);
		x -= 3; // Equivalente a x = x - 3;
		System.out.println("x -= 3 -> resultado: x=" + x);
		
		System.out.println(" -------- " + "%=" + " -------- ");
		System.out.println("Para x = " + x);
		x %= 5; // Equivalente a x = x % 5;
		System.out.println("x %= 5 -> resultado: x=" + x);
		
		
		System.out.println(" --- Operadores Binarios --- ");
		System.out.println(" -------- " + "|=" + " -------- ");
		System.out.println(" -------- " + "| (OR)" + " -------- ");
		System.out.println("Para x = " + x);
		System.out.println("Decimal: " + x + " - Binario: " + Integer.toBinaryString(x));
		System.out.println("Decimal: " + "4" + " - Binario: " + Integer.toBinaryString(4));
		x |= 4; // Equivalente a x = x | 4;
		System.out.println("x |= 4 -> resultado: x=" + x);
		System.out.println("Decimal: " + x + " - Binario: " + Integer.toBinaryString(x));
		
		System.out.println(" -------- " + "^=" + " -------- ");
		System.out.println(" -------- " + "^ (XOR)" + " -------- ");
		System.out.println("Para x = " + x);
		System.out.println("Decimal: " + x + " - Binario: " + Integer.toBinaryString(x));
		System.out.println("Decimal: " + "1" + " - Binario: " + Integer.toBinaryString(1));
		x ^= 1; // Equivalente a x = x ^ 1;
		System.out.println("x ^= 1 -> resultado: x=" + x);
		System.out.println("Decimal: " + x + " - Binario: " + Integer.toBinaryString(x));
		
		System.out.println(" -------- " + "&=" + " -------- ");
		System.out.println(" -------- " + "& (AND)" + " -------- ");
		System.out.println("Para x = " + x);
		System.out.println("Decimal: " + x + " - Binario: " + Integer.toBinaryString(x));
		System.out.println("Decimal: " + "255" + " - Binario: " + Integer.toBinaryString(255));
		x &= 255; // Equivalente a x = x & 255;
		System.out.println("x &= 255 -> resultado: x=" + x);
		System.out.println("Decimal: " + x + " - Binario: " + Integer.toBinaryString(x));
		
		System.out.println(" -------- " + "<<=" + " -------- ");
		System.out.println("Para x = " + x);
		System.out.println("Decimal: " + x + " - Binario: " + Integer.toBinaryString(x));
		x <<= 2; // Equivalente a x = x << 2;
		System.out.println("x <<= 2 -> resultado: x=" + x);
		System.out.println("Decimal: " + x + " - Binario: " + Integer.toBinaryString(x));
		
		x=-1;
		System.out.println(" -------- " + ">>=" + " -------- ");
		System.out.println("Para x = " + x);
		System.out.println("Decimal: " + x + " - Binario: " + Integer.toBinaryString(x));
		x >>= 2; // Equivalente a x = x > > 2;
		System.out.println("x >>= 2 -> resultado: x=" + x);
		System.out.println("Decimal: " + x + " - Binario: " + Integer.toBinaryString(x));
		
		System.out.println(" -------- " + ">>>=" + " -------- ");
		x = -1;
		System.out.println("Para x = " + x);
		System.out.println("Decimal: " + x + " - Binario: " + Integer.toBinaryString(x));
		x >>>= 2; // Equivalente a x = x > > > 2;
		System.out.println("x >>>= 2 -> resultado: x=" + x);
		System.out.println("Decimal: " + x + " - Binario: " + Integer.toBinaryString(x));
		x=0;
		System.out.println(" -------- " + "~ (NOT ou Complemento de numero binario)" + " -------- ");
		System.out.println("Para x = " + x );
		System.out.println("Decimal: " + x + " - Binario: " + Integer.toBinaryString(x));
		x = ~x;
		System.out.println("x = ~x -> resultado: x=" + x);
		System.out.println("Decimal: " + x + " -          Binario: " + Integer.toBinaryString(x));
		System.out.println("Decimal: " + x + " -          HEXA: " + Integer.toHexString(x).toUpperCase());
		
		int a = -1;
		System.out.println(" -------- " + "Curiosidades" + " -------- ");
		System.out.println("Valor: " + a);
		System.out.println("Binario: " + Integer.toBinaryString(a));
		System.out.println("HEXA: " + Integer.toHexString(a).toUpperCase());
		a = 2147483647;
		System.out.println();
		System.out.println("Valor Maximo Inteiro Positivo (32 bits): " + a);
		System.out.println("Binario: " + Integer.toBinaryString(a));
		System.out.println("HEXA: " + Integer.toHexString(a).toUpperCase());
		a = -2147483648;
		System.out.println();
		System.out.println("Valor Maximo Inteiro Negativo (32 bits): " + a);
		System.out.println("Binario: " + Integer.toBinaryString(a));
		System.out.println("HEXA: " + Integer.toHexString(a).toUpperCase());
		
		int y = 0;
		System.out.println(" -------- " + "y++" + " -------- ");
		System.out.println("Para y = " + y + ":");
		System.out.println("Valor de y em y++: " + y++);
		
		System.out.println(" -------- " + "--y" + " -------- ");
		System.out.println("Para y = " + y + ":");
		System.out.println("Valor de y em --y: " + --y);

	}

}
