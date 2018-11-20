package date;

import java.text.DateFormatSymbols;
import java.time.LocalDate;
import java.time.Period;
import java.util.Locale;

public class Age {

	public static void main(String[] args) {
		
		LocalDate pdate = LocalDate.of(1998, 01, 24);
		LocalDate now = LocalDate.now()	;
		
		Period diff = Period.between(pdate, now);
		
		System.out.println("J'ai "+diff.getYears()+" ans, "+diff.getMonths()+" mois et "+diff.getDays()+" jours !\n");
		
		DateFormatSymbols dfs = DateFormatSymbols.getInstance(new Locale("fr"));
		
		for (int i = 0; i < dfs.getMonths().length; i++) {
			System.out.println(dfs.getMonths()[i]);
		}
		
		System.out.println("Aujourd'hui on est le : "+ LocalDate.now());
		System.out.println("Demain sera le : "+ LocalDate.now().plusDays(1));
		System.out.println("Il y a 10 jours : "+ LocalDate.now().plusDays(-10));
		System.out.println("Dans 10 jours : "+ LocalDate.now().plusDays(10));
		
		
	}
	
	
}
