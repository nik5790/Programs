package wikipedia;

import java.util.Scanner;

import org.testng.Assert;

public class AirthmeticOperations {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter ArraySize:   ");
		int asize = sc.nextInt();
		int[] a = new int[asize];

		System.out.println("Enter Array Element:    ");
		for (int i = 0; i < a.length; i++) {
			a[i] = sc.nextInt();
			System.out.println( "a["+i+"]="+a[i]);
//			for (int j =0; j<a.length; j++)
			
		
				
		}
	}

}
