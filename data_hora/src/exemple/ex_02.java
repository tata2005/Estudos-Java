package exemple;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class ex_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalDate d04 = LocalDate.parse("2022-07-20");//data escolhida
		LocalDateTime d05 = LocalDateTime.parse("2022-07-20T15:10:20");//data hora escolhida
		Instant d06 = Instant.parse("2022-07-20T01:10:20z");//data hora global escolhida
		
		LocalDate pastWeekLocalDate = d04.minusDays(7);//diminuir dias
		LocalDate nextWeekLocalDate = d04.plusDays(7);//aumentar dias
		
		System.out.println("pastWeekLocalDate = " + pastWeekLocalDate);
		System.out.println("nextWeekLocalDate = " + nextWeekLocalDate);
		
		LocalDateTime pastWeekLocalDateTime = d05.minusHours(7);//diminuir horas
		LocalDateTime nextWeekLocalDateTime = d05.plusHours(7);//aumentar horas
		
		System.out.println("pastWeekLocalDateTime = " + pastWeekLocalDateTime);
		System.out.println("nextWeekLocalDateTime = " + nextWeekLocalDateTime);
		
		Instant pastWeekInstant = d06.minus(7, ChronoUnit.DAYS);//diminuir dias d-h global
		Instant nextWeekInstant = d06.plus(7, ChronoUnit.DAYS);//aumentar dias d-h global
		
		System.out.println("pastWeekInstant = " + pastWeekInstant);
		System.out.println("nextWeekInstant = " + nextWeekInstant);
		
		Duration t1 = Duration.between(pastWeekLocalDate.atTime(0, 0), d04.atTime(0, 0));//calculo da duração
		Duration t2 = Duration.between(pastWeekLocalDateTime, d05);
		Duration t3 = Duration.between(pastWeekInstant, d06);

		System.out.println("t1 = " + t1.toDays());
		System.out.println("t2 = " + t2.toDays());
		System.out.println("t3 = " + t3.toDays());
	}

}
