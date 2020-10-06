package datetime;

import java.io.IOException;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class DaysAlive {
	
	protected static Calendar todaysDate(int yearToday, int monthToday, int dayToday) {
		
	    Calendar today = new GregorianCalendar(yearToday, monthToday - 1, dayToday);
	    return today;
	}
	
	protected static Calendar birthDate(int yearBorn, int monthBorn, int dayBorn) {
		Calendar born = new GregorianCalendar(yearBorn, monthBorn - 1, dayBorn);
		return born;
	}
	
	protected static int daysCalculator(Calendar today, Calendar born) throws IOException {
		
		double diff = today.getTimeInMillis() - born.getTimeInMillis();
	    diff = diff / (24 * 60 * 60 * 1000);
	    int finalDays = (int) Math.round(diff);
	    if(finalDays >= 0) {
	    	return finalDays;
	    }
	    else {
	    	 throw new IOException("Your No of days alive cannot be negative");
	    }
		
	}
}
