package openClosedPrinciple.caso1;

import java.time.LocalDate;

public class main {

	public static void main(String[] args) {
		LocalDate fecha = LocalDate.of(2020, 1, 1);
		LocalDate fecha2 = fecha.plusDays(1);
		System.out.print(fecha2);
	}

}
