package zc.training.practice;

class Bank {
	public int getRateOfInterest() {
		return 0;
	}
}

class Sbi extends Bank {
	public int getRateOfInterest() {
		return 8;
	}
}

class Icic extends Bank {
	public int getRateOfInterest() {
		return 7;
	}
}

class Axis extends Bank {
	public int getRateOfInterest() {
		return 9;
	}
}

public class Test {
	public static void main(String[] args) {
		Sbi s = new Sbi();
		Icic i = new Icic();
		Axis a = new Axis();
		System.out.println(a.getRateOfInterest());
		System.out.println(i.getRateOfInterest());
		System.out.println(s.getRateOfInterest());
	}

}
