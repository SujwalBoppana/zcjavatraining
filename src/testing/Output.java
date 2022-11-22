package testing;

import zc.training.practice.*;

public class Output {
	public static void main(String[] args) {
		// operators
//		System.out.println(Operators.getAdd(5, 6));
//		System.out.println(Operators.getSubtract(5, 7));
//		System.out.println(Operators.getMulti(5, 6));
//		System.out.println(Operators.getDivision(50, 5));
//		System.out.println(Operators.getModular(15, 3));
//		System.out.println(Operators.getIncrementOperator(10));
//		System.out.println(Operators.getDecrementOperator(5));
//		System.out.println(Operators.getBitWiseAndOperator(10, 20));
//		System.out.println(Operators.getBitWiseOrOperator(30, 40));
//		System.out.println(Operators.getBitWiseXorOperator(20, 50));
//		System.out.println(Operators.getTernaryOperator(26));
//		System.out.println(Operators.getAssignmenntOperators(50));
//		System.out.println(Operators.getLogicalAndOperators(56, 56));
//		System.out.println(Operators.getLogicalNotOperators(67));
//		System.out.println(Operators.getLogicalOrOperators(50, 60));
//		System.out.println(Operators.getRelationalOperators(50, 60));
//
//		// Decision making Statements
//		System.out.println(ControlStatements.getSwitchCase(90));
//		System.out.println(ControlStatements.getIf(5, 6));
//		System.out.println(ControlStatements.getElseIf(20, 30));
//		System.out.println(ControlStatements.getNestedIf(20, 12));
//		System.out.println(ControlStatements.getIfelse(50, 60));
//
//		System.out.println(Loops.isPrime(3));
//		System.out.println(Loops.getReverseNumber(45));
//		System.out.println(Loops.getSumOfEven(7));
//		int[] numbers = { 3, 4, 5, 23, 0, 12 };
//		System.out.println(Loops.sumofarray(numbers));
		// Calendar
		System.out.println((Calendar.daysInMonth(0, 2001)));
		
		System.out.println(Overloading.getAdd(3.3, 5.5, 6.5));
		System.out.println(Overloading.getGreater(9, 8, 7));
		
		//overriding
		Atm a = new Atm();
		System.out.println(a.addBalance(5000));

	}

}
