package de.zeroco.testing;

import de.zeroco.util.Cat;
import de.zeroco.util.Child;
import de.zeroco.util.Dog;
import de.zeroco.util.Honda;


public class TestingPrograms {
	public static void main(String[] args) {
//
//		// constructor Overloading
//		School aobj = new School("ravi", 20);
//		System.out.println(aobj.getName());
//		System.out.println(aobj.getRollNo());
//		School bobj = new School("raju", 34, "VI", "HYD");
//		System.out.println(bobj.getName());
//		System.out.println(bobj.getRollNo());
//		System.out.println(bobj.getClassName());
//		System.out.println(bobj.getFromCity());
//
//		// constructor Chaining with in the same class
//		Vehicle cobj = new Vehicle("Audi", 5, "black", "petrol", 21);
//		System.out.println(cobj.getCarBrand());
//		System.out.println(cobj.getColour());
//		System.out.println(cobj.getFuelType());
//		System.out.println(cobj.getMilage());
//		System.out.println(cobj.getNoOfGears());
//		Vehicle dobj = new Vehicle("Benz", 6, "Red", "Diesel", 12);
//		System.out.println(dobj.getCarBrand());
//		System.out.println(dobj.getColour());
//		System.out.println(dobj.getFuelType());
//		System.out.println(dobj.getMilage());
//		System.out.println(dobj.getNoOfGears());

		// inheritance single level
		
		
		// inheritance multilevel

		
		// variable masking
		Child child = new Child();
		System.out.println(child.display());
		System.out.println(child.displayParent());
		System.out.println(child.variableShadowing());
		
		// abstract class



	}

}
