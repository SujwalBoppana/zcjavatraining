package zc.training.practice;

public class Palindrome {

	 

	public static void isPalindrome(int sum, int num, int temp) {
		if (temp == 0) {
			if (num == sum) {
				System.out.println("It is palindrome : " + sum);
			}
			return;
		}
		int r = temp % 10;
		sum = sum * 10 + r;
		temp = temp / 10;
		isPalindrome(sum, num, temp);
	}

	public static void main(String[] args) {
		int sum = 0;
		 int num = 131;
		 int temp = num;
		isPalindrome(sum,num,temp);
	}
}
