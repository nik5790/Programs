package pack2;

import pack1.Class1;

public class Class3 extends Class1 {

	public Class3(int a, int b) {
		super(a, b);
	}

	public static void main(String[] args) {
		Class1 c3 = new Class1(115, 5);
		c3.add();
		c3.subtract();
	}

}
