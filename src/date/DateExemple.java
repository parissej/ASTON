package date;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DateExemple {

	public static void main(String[] args) {
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d/MM/yyyy");
		
		String date = "15/10/2016";
		
		LocalDate ld = LocalDate.parse(date, formatter);
		
		System.out.println(date+"\n"+ld);
	}
	
}
