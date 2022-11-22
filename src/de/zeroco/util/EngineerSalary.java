package de.zeroco.util;

public class EngineerSalary implements SalaryDeductions {
	int sal;
	int hike;
	int totalSal;
	int cuttings;

	@Override
	public void setsalary(int sal) {
		this.sal = sal;
	}

	@Override
	public void sethike(int hike) {
		this.hike = hike;
	}

	@Override
	public void settotalSalary() {
		this.totalSal = sal+hike-cuttings;
	}

	@Override
	public void setPfCuttings(int cuttings) {
		this.cuttings = cuttings;
	}

	public int getSal() {
		return sal;
	}

	public int getHike() {
		return hike;
	}

	public int getTotalSal() {
		return totalSal;
	}

	public int getPfCuttings() {
		return cuttings;
		
	}

}
