package zc.training.practice;

public class Palindrome {

	 

	public static void isPalindrome(int sum, int num, int num1) {
		if (num1 == 0) {
			if (num == sum) {
				System.out.println("It is palindrome : " + sum);
			}
			return;
		}
		int r = num1 % 10;
		sum = sum * 10 + r;
		num1 = num1 / 10;
		isPalindrome(sum, num, num1);
	}

	public static void main(String[] args) {
		int sum = 0;
		 int num = 131;
		 int num1 = num;
		isPalindrome(sum,num,num1);
	}
}
