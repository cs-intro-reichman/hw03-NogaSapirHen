public class Calendar {
	static int dayOfMonth = 1;   
	static int month = 1;
	static int year = 1900;
	static int dayOfWeek = 2;     // 1.1.1900 was a Monday
	static int nDaysInMonth = 31; // Number of days in January
	static	int SundayCount = 0;

    public static void main(String args[]) {
		int year = Integer.parseInt(args[0]);
        	while (year<year+1)
		{
			if (dayOfWeek == 1) {
				System.out.println( dayOfMonth + "/" + month +"/" + year + " Sunday");
			}
			else System.out.println( dayOfMonth + "/" + month +"/" + year );
			if ( dayOfMonth == 31 && month == 12) 
			break;
			advance();
		}
	}
		
	
	 // Advances the date (day, month, year) and the day-of-the-week.
	 // If the month changes, sets the number of days in this month.
	 // Side effects: changes the static variables dayOfMonth, month, year, dayOfWeek, nDaysInMonth.
	 private static void advance() {
		//new year
		if ( dayOfMonth == 31 && month == 12) {
			year ++;
			month = 1;
			dayOfMonth = 1;
		}
		// new month
		else
			if (dayOfMonth == nDaysInMonth (month,year) ) {
			month ++;
			dayOfMonth = 1;
			nDaysInMonth (month,year);
			}
		else
			//neither
			dayOfMonth ++;
		// days of the week
		if ( dayOfWeek == 7)
		dayOfWeek = 1;
		else dayOfWeek ++;
	}


		
	  
		 
    // Returns true if the given year is a leap year, false otherwise.
	private static boolean isLeapYear(int year) {
	    boolean LeapYear = false;
		LeapYear = (((year % 400) == 0) || ((year % 4) == 0) && ((year % 100) != 0));
		return LeapYear;
	}
	 
	// Returns the number of days in the given month and year.
	// April, June, September, and November have 30 days each.
	// February has 28 days in a common year, and 29 days in a leap year.
	// All the other months have 31 days.
	private static int nDaysInMonth(int month, int year) {
		if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12)
			return 31;
			if (month == 4 || month == 6 || month == 9 || month == 11 )
			return 30;
			if ( month == 2) {
				if ( isLeapYear(year) == true )
				return 29;
				else return 28;
			}
		return 0;	
	}
}