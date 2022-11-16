package zc.training.practice;

public class TypeCasting {
	public static void widening() {
		// widening
		int num1 = 300;
		double num2 = num1;
		System.out.println(num2);

		byte num3 = 127;
		short num4 = num3;
		System.out.println(num4);

		short num5 = 32767;
		// num5=num5+1;
		int num6 = num5;
		System.out.println(num6);

		int num7 = 2147483647;
		// num7=num7+1;
		long num8 = num7;
		num8 = num8 + 1;
		System.out.println(num8);

		long num9 = 567886699;
		float num10 = num9;
		System.out.println(num10);

		double num11 = num9;
		System.out.println(num11);

	}

	public static void narrowing() {
		// narrowing
		long num1 = 5678658666l;
		int num2 = (int) num1;
		System.out.println(num2);
		short num3 = (short) num2;
		System.out.println(num3);
		byte num4 = (byte) num3;
		System.out.println(num4);
		double num5 = 56.7894534254445;
		float num6 = (float) num5;
		System.out.println(num6);
		short num7 = (short) num6;
		System.out.println(num7);
	}

	public static void main(String[] args) {
		widening();
		narrowing();
	}

}
