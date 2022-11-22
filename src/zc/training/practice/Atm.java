package zc.training.practice;

class BankAccount {
	public static double balance = 100000;

	public double addBalance(double amount) {
		return balance + amount;
	}

	public double getWithdraw(double amount) {
		if (amount < balance) {
			return balance - amount;
		}
		return 0;
	}
}

public class Atm extends BankAccount {
	public double addBalance(double amount) {
		return balance + amount;
	}

	public double getWithdraw(double amount) {
		if (amount < balance) {
			return balance - amount;
		}
		return 0;
	}
}
