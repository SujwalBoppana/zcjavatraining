package zc.training.practice;

public class OuterClass {
	static int valueOne = 30;

	public int display() {
		return valueOne;
	}

	class InnerClass {
		int valueTwo = 12;

		public int sum() {
			return valueOne + valueTwo;
		}

		public int getReverseNumber(int number) {
			int reverse = 0;
			while (number > 0) {
				int remainder = number % 10;
				reverse = reverse * 10 + remainder;
				number = number / 10;
			}
			return reverse;
		}
	}

	public static class StaticInnerClass {
		public  int sumofarray(int numbers[]) {
			int sum = 0;
			for (int number : numbers) {
				sum += number;
			}
			return sum;
		}
	}
}
