package zc.training.practice;

public class Operators {
	public static int getAdd(int first, int second) {
		return first + second;
	}

	public static int getSubtract(int first, int second) {
		return first - second;
	}

	public static int getMulti(int first, int second) {
		return first * second;
	}

	public static int getDivision(int first, int second) {
		return first / second;
	}

	public static int getModular(int first, int second) {
		return first % second;
	}

	public static int getIncrementOperator(int first) {
		return ++first;
	}

	public static int getDecrementOperator(int first) {
		return --first;
	}

	public static boolean getLogicalAndOperators(int first, int second) {
		// && ---this will give output as true if both conditions are satisfied else it
		// will give false as output
		return first == 4 && second == 5;

	}

	public static boolean getLogicalOrOperators(int first, int second) {
		// || ! ---this will give output as true if one of these conditions are
		// satisfied else it will give false as output
		return first == 4 || second == 5;

	}

	public static boolean getLogicalNotOperators(int first) {
		// ! --- this operator will work for only one operand
		return !(first == 4);

	}

	public static String getRelationalOperators(int first, int second) {
		// ==,!=,>,<,>=,<= it will check the relation b/w two operands
		if (first == second) {
			return "two values are equal";
		} else if (first != second) {
			return "two values are not equal";
		} else if (first > second) {
			return " the first  value is greater than second value ";
		}
		if (first < second) {
			return " the first  value is lessthan second value ";
		}
		return "Enter a valid input";

	}

	public static int getAssignmenntOperators(int first) {
		int second = first;
		return second;
	}

	public static int getTernaryOperator(int first) {
		int second = (first > 20) ? 20 : 30;
		return second;
	}

	public static int getBitWiseAndOperator(int first, int second) {
		int third = first & second;
		return third;
	}

	public static int getBitWiseOrOperator(int first, int second) {
		int third = first | second;
		return third;
	}

	public static int getBitWiseXorOperator(int first, int second) {
		int third = first ^ second;
		return third;

	}
}
