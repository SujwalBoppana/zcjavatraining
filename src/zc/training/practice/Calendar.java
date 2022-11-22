package zc.training.practice;

public class Calendar {
	/**
	 * this method will gives the output as number of days in the given month
	 * 
	 * @param monthNumber
	 * @return
	 */
	public static int daysInMonth(int monthNumber, int year) {
		switch (monthNumber) {
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			return 31;
		case 4:
		case 6:
		case 9:
		case 11:
			return 30;
		case 2: {
			if (isLeapYear(year)) {
				return 29;
			} else {
				return 28;
			}
		}
		default:
			return 0;
		}
	}

	public static boolean isLeapYear(int year) {
		if (((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0)) {
			return true;
		} else {
			return false;
		}

	}
}
