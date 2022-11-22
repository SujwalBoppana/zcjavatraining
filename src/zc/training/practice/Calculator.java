package zc.training.practice;

public class Calculator {
	public static void add(int first, int second) {
		int sum = first + second;
		System.out.println(sum);
	}

	public static void subtract(int first, int second) {
		int sub = first - second;
		System.out.println(sub);

	}

	public static void division(int first, int second) {
		int div = first / second;
		System.out.println(div);
	}

	public static void mutliplaction(int first, int second) {
		int mult = first * second;
		System.out.println(mult);
	}

	public static void main(String[] args) {
		int first = 5;
		int second = 2;
		add(first, second);
		division(first, second);
		mutliplaction(first, second);
		subtract(first, second);

	}

}
