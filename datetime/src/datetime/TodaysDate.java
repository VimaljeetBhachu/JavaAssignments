package datetime;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;
import java.time.format.DateTimeFormatter;

public class TodaysDate {
	
	protected static void todaysDateMethod() {
		LocalDate date = LocalDate.now();
		DateTimeFormatter todaysDate = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		
		DayOfWeek dayOfWeek = date.getDayOfWeek();
		Month month = date.getMonth();
		int dt = date.getDayOfMonth();
		int year = date.getYear();
		System.out.print(dayOfWeek + ", " + month + " " + dt + ", " + year);
	}
}
