package zc.training.practice;

public class PrimeWithOutDebug {
	public static void factorial() {
		int i, fact = 1;
		int number = 5;// It is the number to calculate factorial
		for (i = 1; i <= number; i++) {
			fact = fact * i;
		}
		System.out.println("Factorial of the given " + number + " is: " + fact);
	}

	public static void isPrime() {
		int num = 25;
		int count = 0;
		for (int i = 2; i < num; i++) {
			if (num % i == 0) {
				count++;
				break;
			}
		}

		if (count == 0) {
			System.out.println("It is a Prime Number.");
		} else {
			System.out.println("It is not a Prime Number.");
		}
	}

	public static void main(String[] args) {
		System.out.println("Start ");
		factorial();
		isPrime();
		System.out.println("End");
	}

}
