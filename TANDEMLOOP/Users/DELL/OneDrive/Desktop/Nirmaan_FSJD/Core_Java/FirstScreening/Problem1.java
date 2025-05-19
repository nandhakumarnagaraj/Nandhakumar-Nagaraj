package FirstScreening;

import java.util.Scanner;

public class Problem1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter first number: ");
		double a = sc.nextDouble();
		System.out.print("Enter second number: ");
		double b = sc.nextDouble();
		System.out.print("Enter operation (+, -, *, /): ");
		String op = sc.next();

		Calculator calc = new Calculator();
		switch (op) {
		case "+":
			System.out.println("Result: " + calc.add(a, b));
			break;
		case "-":
			System.out.println("Result: " + calc.subtract(a, b));
			break;
		case "*":
			System.out.println("Result: " + calc.multiply(a, b));
			break;
		case "/":
			System.out.println("Result: " + calc.divide(a, b));
			break;
		default:
			System.out.println("Invalid operation");
		}
	}
}

class Calculator {
	public double add(double a, double b) {
		return a + b;
	}

	public double subtract(double a, double b) {
		return a - b;
	}

	public double multiply(double a, double b) {
		return a * b;
	}

	public double divide(double a, double b) {
		if (b == 0)
			throw new ArithmeticException("Cannot divide by zero");
		return a / b;
	}
}
