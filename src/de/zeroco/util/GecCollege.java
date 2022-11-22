package de.zeroco.util;

public class GecCollege implements College {

	@Override
	public int noOfStudents() {
		return 3000;
	}

	@Override
	public int noOfLecturers() {
		return 200;
	}

	@Override
	public boolean isSportsAvailable() {
		return true;
	}

	@Override
	public boolean isLabAvailable() {
		return true;
	}

}
