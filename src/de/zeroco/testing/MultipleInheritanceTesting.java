package de.zeroco.testing;

import de.zeroco.util.GowthamInstitutes;

public class MultipleInheritanceTesting {
	public static void main(String[] args) {

		GowthamInstitutes gowthamInstitutes = new GowthamInstitutes();
		System.out.println(gowthamInstitutes.getAddress());
		System.out.println(gowthamInstitutes.noOfLecturers());
		System.out.println(gowthamInstitutes.NoOfRooms());
		System.out.println(gowthamInstitutes.noOfStudents());
		System.out.println(gowthamInstitutes.isLabAvailable());
		System.out.println(gowthamInstitutes.isSportsAvailable());
	}

}
