/*
 * Checks if a given year is a leap year or a common year,
 * and computes the number of days in a given month and a given year. 
 */
public class Calendar0 {	
	
	// Gets a year (command-line argument), and tests the functions isLeapYear and nDaysInMonth.
	public static void main(String args[]) {
		int year = Integer.parseInt(args[0]);
		isLeapYearTest(year);
		nDaysInMonthTest(year);
	}
		 
	// Tests the isLeapYear function.
	private static void isLeapYearTest(int year) {
		String commonOrLeap = "common";
		if (isLeapYear(year)) {
			commonOrLeap = "leap";
		}
		System.out.println(year + " is a " + commonOrLeap + " year");  
		for (int i=1; i < 13; i++) {
		System.out.println("Month "+ i + " has " + (nDaysInMonth(i, year)) + " days");
		}
	}

	// Tests the nDaysInMonth function.
	private static void nDaysInMonthTest(int year) {
		int Month;
		int days = 31;
		for ( int i = 1; i < 13; i ++)
		{
			nDaysInMonth( i , year);
		switch (year) {
			case 1: Month = 1;
			break;
			case 2: Month = 2;
			if (isLeapYear(year) == true)
			days = 29;
			else days = 28;
			break;
			case 3: Month = 3;
			break;
			case 4: Month = 4;
			days = 30;
			break;
			case 5: Month = 5;
			break;
			case 6: Month = 6;
			days = 30;
			break;
			case 7: Month = 7;
			break;
			case 8: Month = 8;
			break;
			case 9: Month = 9;
			days = 30;
			break;
			case 10: Month = 10;
			break;
			case 11: Month = 11;
			days = 30;
			break;
			case 12: Month = 12;
			break;
			default: Month = 0;
			days = 0;
			break;
		}
		}
	}

	// Returns true if the given year is a leap year, false otherwise.
	public static boolean isLeapYear(int year) {
		boolean LeapYear = false;
		LeapYear = (((year % 400) == 0) || ((year % 4) == 0) && ((year % 100) != 0));
	    // Replace the following statement with your code
		return LeapYear;
	}
	 
	// Returns the number of days in the given month and year.
	// April, June, September, and November have 30 days each.
	// February has 28 days in a common year, and 29 days in a leap year.
	// All the other months have 31 days.
	public static int nDaysInMonth(int month, int year) {
		// Replace the following statement with your code
			if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12)
			return 31;
			if (month == 4 || month == 6 || month == 9 || month == 11 )
			return 30;
			if ( month == 2) {
				if ( isLeapYear(year) == true )
				return 29;
				else return 28;
			}
		else return 0;	
	}
}
