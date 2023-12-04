package exemple;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;

public class ex_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalDate d04 = LocalDate.parse("2022-07-20");//data escolhida
		LocalDateTime d05 = LocalDateTime.parse("2022-07-20T15:10:20");//data hora escolhida
		Instant d06 = Instant.parse("2022-07-20T01:10:20z");//data hora global escolhida
		
		LocalDate r1 = LocalDate.ofInstant(d06, ZoneId.systemDefault());//transformando data-hora global em local
		LocalDate r2 = LocalDate.ofInstant(d06, ZoneId.of("Portugal"));
		LocalDateTime r3 = LocalDateTime.ofInstant(d06, ZoneId.systemDefault());
		LocalDateTime r4 = LocalDateTime.ofInstant(d06, ZoneId.of("Portugal"));
		
		System.out.println("r1 = " + r1);
		System.out.println("r2 = " + r2);
		System.out.println("r3 = " + r3);
		System.out.println("r4 = " + r4);
		
		System.out.println("d04 dia = " + d04.getDayOfMonth());
		System.out.println("d04 mês = " + d04.getMonthValue());
		System.out.println("d04 ano = " + d04.getYear());
		
		System.out.println("d05 hora = " + d05.getHour());
		System.out.println("d05 minuto = " + d05.getMinute());
	}

}
