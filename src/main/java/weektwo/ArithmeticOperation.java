package weektwo;

import java.util.Scanner;

public class ArithmeticOperation {


	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter First number :");
		int number1 = sc.nextInt();

		System.out.println("Enter second number :");
		int number2 = sc.nextInt();

		int Add = number1 + number2;
		int Subtract = number1 - number2;
		int Multiply = number1 * number2;
		int Divide = number1 / number2;

		System.out.println("Enter operation to perform :");
		String result = sc.next();

		if (result.toLowerCase().equals("add")) {
			System.out.println("Addition of two numbers : " + Add);
		}
		if (result.toLowerCase().equals("substract")) {
			System.out.println("Subtract between two numbers : " + Subtract);
		}
		if (result.toLowerCase().equals("multiply")) {
			System.out.println("Multiply of two numbers : " + Multiply);
		}
		if (result.toLowerCase().equals("divide")) {
			System.out.println("Division of two numbers: " + Divide);
		}

	}
}
