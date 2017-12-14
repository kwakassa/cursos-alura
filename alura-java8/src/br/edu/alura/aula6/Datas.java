package br.edu.alura.aula6;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Random;

public class Datas {

	public static void main(String[] args) {
		LocalDate hoje = LocalDate.now();
		DateTimeFormatter formatterDate = DateTimeFormatter.ofPattern("dd-MM-yyy");
		System.out.println("Hoje: " + DateTimeFormatter.ofPattern("dd-MM-yyy").format(hoje));
		System.out.println("ou");
		System.out.println("Hoje: " + hoje.format(formatterDate));
		Random random = new Random();
		LocalDate dataFutura = hoje.plusYears( 5+random.nextInt(10)).plusMonths(5+random.nextInt(10)).plusDays( 5+random.nextInt(10));
		System.out.println("Data Futura: " + dataFutura.format(formatterDate));
		
		Period period = Period.between(hoje, dataFutura);
		System.out.println("Periodo: " + period.getYears() + " anos, " + period.getMonths() + " meses e " + period.getDays() + " dias." );
		
		DateTimeFormatter formatterTimestamp = DateTimeFormatter.ofPattern("dd-MM-yyy HH:mm:ss");
		
		ZonedDateTime dataAgora = ZonedDateTime.now();
		System.out.println("Hoje com Timestamp: " + dataAgora.format(formatterTimestamp));
		
		LocalDate data = LocalDate.now();//LocalDate.of(2099, Month.JANUARY, 25);
		data = data.withDayOfMonth(25).withMonth(1).withYear(2099);
		System.out.println("Data: " + DateTimeFormatter.ofPattern("dd-MM-yyy").format(data));
	}

}
