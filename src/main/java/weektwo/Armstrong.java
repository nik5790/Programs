package weektwo;

public class Armstrong {
	public static void main(String[] args) {
		int num;
		int temp;
		int sum = 0;

		System.out.print("Armstrong numbers from 100 to 1000:");
		for (int i = 100; i <= 1000; i++) {
			num = i;
			while (num != 0) {
				temp = num % 10;
				num = num / 10;
				sum = sum + (temp * temp * temp);
			}
			if (sum == i) {
				System.out.print(i + " ");
			}
			sum = 0;
		}
	}
}
