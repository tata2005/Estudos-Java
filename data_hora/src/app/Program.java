package app;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class Program {

	public static void main(String[] args) {
		
		DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");//para formatar o texto
		DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
		DateTimeFormatter fmt3 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm").withZone(ZoneId.systemDefault());//para formatar o texto global
		//withZone(ZoneId.systemDefault() --> serve para que fique no horario da maquina que esta rodando
		
		LocalDate d01 = LocalDate.now(); //data atual
		LocalDateTime d02 = LocalDateTime.now();//data  hora local atual
		Instant d03 = Instant.now();//data hora global
		
		LocalDate d04 = LocalDate.parse("2022-07-20");//data escolhida
		LocalDateTime d05 = LocalDateTime.parse("2022-07-20T15:10:20");//data hora escolhida
		Instant d06 = Instant.parse("2022-07-20T15:10:20z");//data hora global escolhida
		Instant d07 = Instant.parse("2022-07-20T15:10:20-03:00");
		
		LocalDate d08 = LocalDate.parse("20/02/2023", fmt1);//texto formatado
		LocalDateTime d09 = LocalDateTime.parse("20/02/2023 01:30", fmt2);
		
		LocalDate d10 = LocalDate.of(2023, 10, 20);//digitação direta
		LocalDateTime d11 = LocalDateTime.of(2023, 10, 20, 1, 30);
				
		System.out.println("d01 = " + d01);//impressao de texto em ISO8601
		System.out.println("d02 = " + d02);
		System.out.println("d03 = " + d03);
		System.out.println("d04 = " + d04);
		System.out.println("d05 = " + d05);
		System.out.println("d06 = " + d06);
		System.out.println("d07 = " + d07);
		System.out.println("d08 = " + d08);
		System.out.println("d09 = " + d09);
		System.out.println("d10 = " + d10);
		System.out.println("d11 = " + d11);
		
		System.out.println("d04 = " + d04.format(fmt1));//impressao do texto em forma customizada
		System.out.println("d05 = " + d05.format(fmt2));
		System.out.println("d06 = " + fmt3.format(d06));//texto global formatado
		
	}

}
