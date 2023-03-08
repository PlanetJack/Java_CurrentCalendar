package Calendar;

import java.util.Calendar;

public class Exercise_Page518 {

	public static void main(String[] args) {

		Calendar now = Calendar.getInstance();
		
		int year = now.get(Calendar.YEAR);
		
		int month = now.get(Calendar.MONTH) + 1;
		String strMonth = (month<10)? ("0"+month) : (""+month);
		
		int dayOfMonth = now.get(Calendar.DAY_OF_MONTH);
		String strDayOfMonth = (dayOfMonth<10)? ("0"+dayOfMonth) : (""+dayOfMonth);
		
		String[] dayArray = {"Sun", "Mon", "Tue", "Wed", "Thur", "Fri", "Sat"};
		int dayOfWeek = now.get(Calendar.DAY_OF_WEEK);
		String strDayOfWeek = dayArray[dayOfWeek-1] + ": Day Of Week";
		
		int hour = now.get(Calendar.HOUR_OF_DAY);
		String strHour = (hour<10)? ("0"+ hour) : (""+hour);
		
		int second = now.get(Calendar.SECOND);
		String strSecond = (second<10)? ("0"+second) : (""+second);
		
		System.out.println(year + " YY");
		System.out.println(strMonth + " MM");
		System.out.println(strDayOfMonth + " DD");
		System.out.println(strDayOfWeek + " ");
		System.out.println(strHour + " HH");
		System.out.println(strSecond + " SS");
		
		
	}

}
