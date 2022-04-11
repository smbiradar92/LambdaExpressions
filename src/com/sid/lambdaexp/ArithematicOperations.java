package com.sid.lambdaexp;

public class ArithematicOperations {

	public static void main(String[] args) {

		IMathFunction add = (x, y) -> x + y; // Lambda expressions do not require any method name -> represents lamda and
												// always returns exp.

		System.out.println("Addition of  5 + 4 is : "
				+ add.calculate(5, 4));

		IMathFunction sub = (x, y) -> x - y;
		System.out.println("Sustraction of  15 + 5 is : "
				+ sub.calculate(15, 5));
		
		IMathFunction multiply = (x, y) -> x * y;

		System.out.println("Multiplication of 5 * 4 is : "
				+ multiply.calculate(5, 4));

		IMathFunction division = (x, y) -> x / y;

		System.out.println("Division of 20/ 4 is : "
				+ division.calculate(20, 4));

		IMathFunction.printResult(5, 4, "Addition", add);
		IMathFunction.printResult(15, 5, "Sustraction", sub);
		IMathFunction.printResult(5, 4, "Multiplication", multiply);
		IMathFunction.printResult(50, 4, "Division", division);

	}

}
