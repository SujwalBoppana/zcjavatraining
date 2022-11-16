package zc.training.practice;

public class Operators {
	public static void arithmeticOperaters(int num1, int num2) {
		// +, - ,* ,/ ,%
		int num3 = num1 + num2; // addition
		System.out.println(num3);
		int num4 = num1 - num2; // subtraction
		System.out.println(num4);
		int num5 = num1 * num2; // multiplication
		System.out.println(num5);
		int num6 = num1 / num2; // division
		System.out.println(num6);
		int num7 = num1 % num2; // modular division
		System.out.println(num7);

	}

	public static void incrementOperator() {
		int num1 = 20;
		System.out.println(num1--);
		System.out.println(--num1);
	}

	public static void decrementOperator() {
		int num1 = 50;
		System.out.println(num1++);
		System.out.println(++num1);

	}

	public static boolean logicalAndOperators(int num1, int num2) {
		// && ---this will give output as true if both conditions are satisfied else it
		// will give false as output
		return num1 == 4 && num2 == 5;

	}

	public static boolean logicalOrOperators(int num1, int num2) {
		// || ! ---this will give output as true if one of these conditions are
		// satisfied else it will give false as output
		return num1 == 4 || num2 == 5;

	}

	public static boolean logicalNotOperators(int num1) {
		// ! --- this operator will work for only one operand
		return !(num1 == 4);

	}

	public static void relationalOperators(int num1, int num2) {
		// ==,!=,>,<,>=,<= it will check the relation b/w two operands
		if (num1 == num2) {
			System.out.println(num1 + num2);
		}
		if (num1 != num2) {
			System.out.println(num1 - num2);
		}
		if (num1 > num2) {
			System.out.println(num1 * num2);
		}
		if (num1 >= num2) {
			System.out.println(num1 / num2);
		}
		if (num1 < num2) {
			System.out.println(num1 % num2);
		}
		if (num1 <= num2) {
			System.out.println(num2);
		}

	}

	public static void assignmenntOperators(int num1) {
		// =,+= , -=, /=, *=, %=
		int num2 = num1;
		System.out.println(num2);
		num1 += num1;
		System.out.println(num1);
		num1 -= num1;
		System.out.println(num1);
		num1 *= num1;
		num1 += num1;
		System.out.println(num1);
		System.out.println(num1);

	}

	public static void ternaryOperator(int num1) {
		int num2 = (num1 > 20) ? 20 : 30;
		System.out.println(num2);
	}

	public static void bitWiseOperator() {
		int num1 = 60;
		int num2 = 13;
		int num3 = num1 | num2;
		System.out.println(num3);
		int num4 = num1 & num2;
		System.out.println(num4);
		int num5 = num1 ^ num2;
		System.out.println(num5);

	}

	public static void main(String[] args) {
		arithmeticOperaters(6, 3);
		incrementOperator();
		decrementOperator();
		System.out.println(logicalAndOperators(4, 5));
		System.out.println(logicalOrOperators(4, 6));
		System.out.println(logicalNotOperators(5));
		relationalOperators(4, 5);
		assignmenntOperators(7);
		ternaryOperator(20);
		bitWiseOperator();

	}

}
