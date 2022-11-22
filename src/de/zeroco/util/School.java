package de.zeroco.util;

public class School {
	String studentName;
	int rollNo;
	String className;
	String fromCity;

	public School(String name, int rollNo) {
		this.studentName = name;
		this.rollNo = rollNo;
	}

	public School(String studentName, int rollNo, String className, String fromCity) {
		this.studentName = studentName;
		this.rollNo = rollNo;
		this.className = className;
		this.fromCity = fromCity;
	}

	public String getName() {
		return studentName;
	}

	public int getRollNo() {
		return rollNo;
	}

	public String getClassName() {
		return className;
	}

	public String getFromCity() {
		return fromCity;
	}
}
