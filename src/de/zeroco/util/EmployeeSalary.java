package de.zeroco.util;

class Employee {
	public static int base = 10000;

	public int salary() {
		return base;
	}
}

class Manager extends Employee {
	public int salary() {
		return base + 20000;
	}
}

class Clerk extends Employee {
	public int salary() {
		return base + 10000;
	}
}

public class EmployeeSalary {
	
	public static void main(String[] args) {
		Clerk c = new Clerk();
		Manager m = new Manager();
		System.out.println(m.salary());
		System.out.println(c.salary());
	}
	

}
