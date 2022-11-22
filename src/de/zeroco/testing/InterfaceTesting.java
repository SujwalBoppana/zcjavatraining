package de.zeroco.testing;

import de.zeroco.util.GecCollege;
import de.zeroco.util.VkrCollege;

public class InterfaceTesting {

	public static void main(String[] args) {
		VkrCollege vkrCollege = new VkrCollege();
		System.out.println(vkrCollege.noOfStudents());
		System.out.println(vkrCollege.noOfLecturers());
		System.out.println(vkrCollege.isLabAvailable());
		System.out.println(vkrCollege.isSportsAvailable());
		
		GecCollege gecCollege = new GecCollege();
		System.out.println(gecCollege.noOfLecturers());
		System.out.println(gecCollege.noOfStudents());
		System.out.println(gecCollege.isLabAvailable());
		System.out.println(gecCollege.isSportsAvailable());

	}

}
