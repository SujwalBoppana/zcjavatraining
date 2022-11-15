package zc.training.practice;

public class Calculator {
	public static void addMethod(int num1, int num2) {
		int sum = num1 + num2;
		System.out.println(sum);
	}

	public static void subtractMethod(int num1, int num2) {
		int sub = num1 - num2;
		System.out.println(sub);

	}

	public static void divisionMethod(int num1, int num2) {
		int div = num1 / num2;
		System.out.println(div);
	}

	public static void mutliplactionMethod(int num1, int num2) {
		int mult = num1 * num2;
		System.out.println(mult);
	}

	public static void main(String[] args) {
		int num1 = 5;
		int num2 = 2;
		addMethod(num1, num2);
		divisionMethod(num1, num2);
		mutliplactionMethod(num1, num2);
		subtractMethod(num1, num2);

	}

}
