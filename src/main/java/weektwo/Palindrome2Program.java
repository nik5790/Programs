package weektwo;

import java.util.Scanner;

public class Palindrome2Program {
	public static void main(String[] args) {

		String str;
		String rev = "";

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the string : ");

		str = sc.next();

		int len = str.length();

		for (int i = len - 1; i >= 0; i=i-1)
			rev = rev + str.charAt(i);

		if (str.equals(rev))
			System.out.println("String is a palindrome: " +str);
		else
			System.out.println("String is not a palindrome: " +str);

	}
}
