package de.zeroco.util;

public class SeniorEngineer implements Promotion {
	int sal;
	int hike;
	int totalSal;
	int cuttings;
	int bonus;
	String position;

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
		this.totalSal = bonus+sal + hike - cuttings;
	}

	@Override
	public void setPfCuttings(int cuttings) {
		this.cuttings = cuttings;
	}

	@Override
	public void setBonus(int bonus) {
		this.bonus = bonus;
	}

	@Override
	public void SetPosition(String position) {
		this.position = position;
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

	public int getBonous() {
		return bonus;
	}
	
	public String getPosition() {
		return position;	
	}

}
