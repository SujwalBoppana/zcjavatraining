package zc.training.practice;

public class Overloading {
	public static int getAdd(int first, int second) {
		return first + second;
	}

	public static int getAdd(int first, int second, int third) {
		return first + second + third;
	}

	public static double getAdd(double first, double second) {
		return first + second;
	}

	public static double getAdd(double first, double second, double third) {
		return first + second + third;
	}

	public static int getGreater(int first, int second) {
		if (first > second)
			return first;
		else
			return second;
	}

	public static int getGreater(int first, int second, int third) {
		if (first >= second && first >= third)
			return first;
		else if (second >= first && second >= third)
			return second;
		else
			return third;
	}

	public static void main(String[] args) {
		System.out.println(getAdd(3.3, 5.5, 6.5));
		System.out.println(getGreater(9, 8, 7));

	}

}
