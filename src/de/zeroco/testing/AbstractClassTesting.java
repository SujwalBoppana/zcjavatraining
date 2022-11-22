package de.zeroco.testing;

import de.zeroco.util.Honda;

public class AbstractClassTesting {
	public static void main(String[] args) {
		
	Honda f = new Honda(899999,45);
	f.setColor("Blue");
	f.setModel(18888882);
	System.out.println(f.getColour());
	System.out.println(f.getModelNo());
	System.out.println(f.setPrice(8999999));
	System.out.println(f.setMilage(56));
	}
}
