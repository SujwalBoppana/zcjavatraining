package de.zeroco.util;

class Parent {
	// variable hiding
	String name = "ParentClass";

	public String display() {
		return name;
	}
}

public class Child extends Parent {
	String name = "ChildClass";

	public String display() {
		return name;
	}

	public String displayParent() {
		return super.name;
	}

	public String variableShadowing() {
		String name = "VariableShadowing";
		return name;
	}
}
