package zc.training.practice;

public class Loops {

	public static int getFactorial(int fact, int number) {
		for (int value = 1; value <= number; value++) {
			fact = fact * value;
		}
		return fact;
	}

	public static boolean isPrime(int number) {
		int count = 0;
		for (int i = 2; i < number; i++) {
			if (number % i == 0) {
				count++;
				break;
			}
		}

		if (count == 0) {
			return true;
		} else {
			return false;
		}
	}

	public static int getReverseNumber(int number) {
		int reverse = 0;
		while (number > 0) {
			int remainder = number % 10;
			reverse = reverse * 10 + remainder;
			number = number / 10;
		}
		return reverse;
	}

	public static int getSumOfEven(int range) {
		int sum = 0;
		int count = 1;
		do {
			if (count % 2 == 0) {
				sum = sum + count;
			}
			count++;
		} while (count <= range);

		return sum;
	}

	public static int sumofarray(int numbers[]) {
		int sum = 0;
		for (int number : numbers) {
			sum += number;
		}
		return sum;
	}
}
