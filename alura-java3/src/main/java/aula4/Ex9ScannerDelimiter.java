package aula4;

import java.util.Scanner;

public class Ex9ScannerDelimiter {
	public static void main(String[] args) {
	    // Initialize Scanner object
	    Scanner scan = new Scanner("Joao da Silva/30 anos/Sao Paulo");
	    // initialize the string delimiter
	    scan.useDelimiter("/");
	    // Printing the tokenized Strings
	    while(scan.hasNext()){
	        System.out.println(scan.next());
	    }
	    // closing the scanner stream
	    scan.close();
	}
}
