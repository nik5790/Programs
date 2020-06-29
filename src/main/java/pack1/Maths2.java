package pack1;

public class Maths2 extends Maths1 {

	public static void main(String[] args) {
		Maths2 mt = new Maths2();
		mt.Add();
		mt.subtract();
	}

	@Override
	public void Add() {
		System.out.println("Addition Method Called");
	}

	@Override
	public void subtract() {
		System.out.println("Subtract Method Called");

	}

}
