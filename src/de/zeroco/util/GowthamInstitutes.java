package de.zeroco.util;

public class GowthamInstitutes implements College, HighSchool {

	@Override
	public int NoOfRooms() {
		return 200;
	}

	@Override
	public String getAddress() {
		return "Vijayawada";
	}

	@Override
	public int noOfStudents() {
		return 5000;
	}

	@Override
	public int noOfLecturers() {
		return 500;
	}

	@Override
	public boolean isSportsAvailable() {
		return true;
	}

	@Override
	public boolean isLabAvailable() {
		return false;
	}

}
