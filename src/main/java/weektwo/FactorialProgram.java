package weektwo;

import java.util.Scanner;

public class FactorialProgram {

	public static void main(String[] args) {
		int x = 1;
		int n;

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number to calculate the Factorial of a number: ");
		n = sc.nextInt();
		for (int i = n; i >= 1; i = i - 1) {
			x = x * i;
		}
		System.out.println("Factorial of a " + n + " is " + x);
	}

}
