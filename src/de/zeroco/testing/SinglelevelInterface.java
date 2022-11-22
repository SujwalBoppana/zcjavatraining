package de.zeroco.testing;

import de.zeroco.util.EngineerSalary;

public class SinglelevelInterface {
	public static void main(String[] args) {

		EngineerSalary engineerSalary = new EngineerSalary();
		engineerSalary.sethike(5000);
		engineerSalary.setPfCuttings(2000);
		engineerSalary.setsalary(50000);
		engineerSalary.settotalSalary();
		System.out.println("Basic sal is " + engineerSalary.getSal());
		System.out.println("Hike is " + engineerSalary.getHike());
		System.out.println("Cuttings is " + engineerSalary.getPfCuttings());
		System.out.println("Total sal is " + engineerSalary.getTotalSal());
	}

}
