package zc.training.practice;

public class Armstrong {
	public static void isArmstring(int num) {
		int count = 0;
		int sum = 0;

		int temp = num;
		while (temp > 0) {
			count++;
			temp = temp / 10;
		}
		temp = num;
		while (temp > 0) {
			int prod = 1;
			int last = temp % 10;
			for (int i = 0; i < count; i++) {
				prod = prod * last;
			}
			sum += prod;
			temp = temp / 10;
		}
		if (sum == num) {
			System.out.println("The given number is Armstrong Number " + sum);
		} else {
			System.out.println("The given number is not an Armstrong Number ");
		}
	}

	public static void main(String[] args) {
		isArmstring(1634);
	}
}
