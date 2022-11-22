package de.zeroco.util;

public class VkrCollege implements College {

	@Override
	public int noOfStudents() {
		return 1600;
	}

	@Override
	public int noOfLecturers() {
		return 150;
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
