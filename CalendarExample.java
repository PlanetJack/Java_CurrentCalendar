package Calendar;

import java.util.Calendar;

public class CalendarExample {

	public static void main(String[] args) {

		Calendar now = Calendar.getInstance();
		
		int year = now.get(Calendar.YEAR);
		int month = now.get(Calendar.MONTH) + 1;
		int day = now.get(Calendar.DAY_OF_MONTH);
		
		
		int week = now.get(Calendar.DAY_OF_WEEK);
		String strWeek = null;
		switch(week){
			case Calendar.MONDAY:
			strWeek ="Mon";
			break;
			case Calendar.TUESDAY:
				strWeek ="TUE";
				break;
			case Calendar.WEDNESDAY:
				strWeek ="WED";
				break;
			case Calendar.THURSDAY:
				strWeek ="THUR";
				break;
			case Calendar.FRIDAY:
				strWeek ="FRI";
				break;
			case Calendar.SATURDAY:
				strWeek ="SAT";
				break;
			case Calendar.SUNDAY:
				strWeek ="SUN";
				break;
		
		}
		
		int amPm = now.get(Calendar.AM_PM);
		String strAmPm = null;
		if(amPm == Calendar.AM) {
			strAmPm = "Morning";
		} else {
			strAmPm = "Afternoon";
		}
		
		int hour = now.get(Calendar.HOUR);
		int minute = now.get(Calendar.MINUTE);
		int second = now.get(Calendar.SECOND);
		
		
		System.out.println(year + ": YY ");
		System.out.println(month + ": MM ");
		System.out.println(day + ": DD ");
		System.out.println(strWeek + ": day of week ");
		System.out.println(strAmPm);
		System.out.println(hour + ": Hour ");
		System.out.println(minute + ": Minute ");
		System.out.println(second + ": Second ");
			
	}

}
