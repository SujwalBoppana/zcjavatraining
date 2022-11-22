package de.zeroco.testing;

import de.zeroco.util.SeniorEngineer;

public interface MultiLevelInterface {
	public static void main(String[] args) {
		SeniorEngineer seniorEngineer = new SeniorEngineer();
		seniorEngineer.sethike(5000);
		seniorEngineer.setPfCuttings(2000);
		seniorEngineer.setsalary(50000);
		seniorEngineer.setBonus(20000);
		seniorEngineer.settotalSalary();
		seniorEngineer.SetPosition("Senior Engineer");
		System.out.println("Basic sal is " + seniorEngineer.getSal());
		System.out.println("Hike is " + seniorEngineer.getHike());
		System.out.println("Cuttings is " + seniorEngineer.getPfCuttings());
		System.out.println("The bonous is "+seniorEngineer.getBonous());
		System.out.println("Total sal is " + seniorEngineer.getTotalSal());
		System.out.println("The position is "+seniorEngineer.getPosition());
	}

}
