package br.gov.caixa.ptdes;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class TestaDatas {

	public static void main(String[] args) {
		Date date1 = new Date();
		SimpleDateFormat formatadorData = new SimpleDateFormat("dd-MM-yyyy");
		System.out.println("--- Date 1: Data Atual ---");
		System.out.println("Date 1: " + date1);
		System.out.println("Date 1 Formatada: " + formatadorData.format(date1));
		
		System.out.println();
		System.out.println("--- Date 1 com data alterada ---");
		date1.setDate(15);
		date1.setMonth(0);//mes varia de 0 a 11
		date1.setYear(90);//Nesse caso é somado o valor a 1900
		System.out.println("Data 1: " + date1);
		System.out.println("Data 1 Formatada: " + formatadorData.format(date1));
		
		System.out.println();
		System.out.println("--- Calendar com Factory: Data Atual ---");
		Calendar calendar1 = Calendar.getInstance();
		System.out.println("Calendar 1: " + calendar1);
		System.out.println("Calendar 1 Formatado: " + formatadorData.format(calendar1.getTime()));
		
		System.out.println();
		System.out.println("--- Calendar Instanciado com Classe Implementada ---");
		Calendar calendar2 = new GregorianCalendar();
		System.out.println("Calendar 2: " + calendar2);
		System.out.println("Calendar 2 Formatado: " + formatadorData.format(calendar2.getTime()));
		
		System.out.println();
		System.out.println("--- Calendar com Data Alterada ---");
		calendar2.set(1980, 0, 20);//calendar2.set(ano, mes, dia); // onde mes varia de 0 a 11
		System.out.println("Calendar 2: " + calendar2);
		System.out.println("Calendar 2 Formatado: " + formatadorData.format(calendar2.getTime()));
		
		System.out.println();
		System.out.println("--- Calendar com alteracao por metodos ---");
		calendar2.set(Calendar.DAY_OF_MONTH, 27);
		calendar2.set(Calendar.MONTH, 11);
		calendar2.set(Calendar.YEAR, 2000);
		System.out.println("Calendar 2: " + calendar2);
		System.out.println("Calendar 2 Formatado: " + formatadorData.format(calendar2.getTime()));
		
		
	}

}
