package com.sid.lambdaexp;

@FunctionalInterface // There should be only one abstract method.
public interface IMathFunction {

	int calculate(int a, int b);

	public static void printResult(int a, int b,
			String function, IMathFunction fobj) { // only static methods are allowed, normal method nit allowed.

		System.out.println(
				"Result of " + function + " is :" + a + " ,"
						+ b + " = " + fobj.calculate(a, b));

	}
}
