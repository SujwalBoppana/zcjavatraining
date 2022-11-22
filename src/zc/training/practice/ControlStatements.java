package zc.training.practice;

public class ControlStatements {
	
	public static boolean getIf(int first, int second) {
		// if statement
		if (first == second) {
			return true;
		}
		return false;
	}

	public static String getIfelse(int first, int second) {
		// if-else statement
		if (first > second) {
			return "The  first number is greaterthan " + second;
		} else {
			return "The  second Number is greaterthan " + first;
		}
	}

	public static String getElseIf(int first, int second) {
		// else - if statement
		if (first > second) {
			return "The  first number is greaterthan " + second;

		} else if (first == second) {
			return "The both number are equal ";

		} else {
			return "The given first  number is lessthan 20";

		}
	}

	public static String getNestedIf(int first, int second) {
		// nested if
		if (first > second)

		{
			if (first <= 12) {

				if (first == 10) {
					return "The given value is 10 ";

				} else if (first == 11) {
					return "The given value is 11 ";
				} else if (first == 12) {
					return "The given value is 12 ";
				}

			} else {
				return "the given number is greater than 12";
			}
		}
		return "Invalid";

	}

	public static String getSwitchCase(int marks) {
		if (marks >= 0 && marks <= 100) {
			// switch-case
			switch (marks / 10) {
			case 10:
				return "your grade is A+ ";
			case 9:
				return "your grade is A ";
			case 8:
				return "your grade is B ";
			case 7:
				return"your grade is C ";
			case 6:
				return "your grade is D ";
			case 5:
				return "your grade is E ";
			default:
				return "your grade is F ";
			}
		} else {
			return "Invalid Input ";
		}

	}
}
