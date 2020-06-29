package pack1;

public class Class2 extends Class1 {

	public Class2(int a, int b) {
		super(a, b);
	}

	public static void main(String[] args) {

		Class1 c1 = new Class1(15, 10);
		c1.add();
		c1.subtract();

		Class1 c2 = new Class1(105, 5);
		c2.add();
		c2.subtract();
	}

}