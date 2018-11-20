package date;

import java.text.DateFormat;
import java.util.Date;
public class TestDate {
	public static void main(String[] args) {
		Date aujourdhui = new Date();
		DateFormat shortDateFormat = DateFormat.getDateTimeInstance(
				DateFormat.SHORT,
				DateFormat.SHORT);
		DateFormat longDateFormat = DateFormat.getDateTimeInstance(
				DateFormat.LONG,
				DateFormat.LONG);
		System.out.println(shortDateFormat.format(aujourdhui));
		System.out.println(longDateFormat.format(aujourdhui));
	}
}