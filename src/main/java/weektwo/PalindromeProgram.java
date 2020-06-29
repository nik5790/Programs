package weektwo;

import java.util.Scanner;

public class PalindromeProgram {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Value: ");

		int number = sc.nextInt();
		int temp = number;
		int reverse = 0;
		int remainder;

		while (temp != 0) {
			remainder = temp % 10;
			reverse = reverse * 10 + remainder;
			temp = temp / 10;
		}

		if (number == reverse) {
			System.out.println("Number is palindrome " +number);
		} else {
			System.out.println("Number is not palindrome " +number);

		}
	}

}
