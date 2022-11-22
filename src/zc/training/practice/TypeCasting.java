package zc.training.practice;

public class TypeCasting {
	public static void widening() {
		// widening
		int first = 300;
		double second = first;
		System.out.println(second);

		byte third = 127;
		short fourth = third;
		System.out.println(fourth);

		short fifth = 32767;
		int sixth = fifth;
		System.out.println(sixth);

		int seventh = 2147483647;
		
		long eight = seventh;
		eight = eight + 1;
		System.out.println(eight);
	}

	public static void narrowing() {
		// narrowing
		long first = 5678658666L;
		int second = (int) first;
		System.out.println(second);
		short third = (short) second;
		System.out.println(third);
		byte fourth = (byte) third;
		System.out.println(fourth);
		double fifth = 56.7894534254445;
		float sixth = (float) fifth;
		System.out.println(sixth);
		short seventh = (short) sixth;
		System.out.println(seventh);
	}

	public static void main(String[] args) {
		widening();
		narrowing();
	}

}
