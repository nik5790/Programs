package pack1;

public class Class1 {
	int a, b;
	protected int c;

	public Class1(int a, int b) {
		this.a = a;
		this.b = b;
	}

	public void add() {
		c = a + b;
		System.out.println("Additon of number is   " + c);
	}

	public void subtract() {
		c = a - b;
		System.out.println("subtraction of number is   " + c);
	}

	public static void main(String[] args) {
		Class1 c1 = new Class1(15, 10);
		c1.add();
		c1.subtract();
	}

}
