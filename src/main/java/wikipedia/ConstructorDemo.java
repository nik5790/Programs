package wikipedia;

public class ConstructorDemo {

	int eno;
	String ename;
	float sal;

	public ConstructorDemo() {
		System.out.println("Default Constructor created manually by own");
	}

	public ConstructorDemo(int eno) {
		this.eno = eno;

		System.out.println("Employee number -   " + eno);

	}

	public ConstructorDemo(int eno, String ename) {
		
		this(1);
		this.eno = eno;
		this.ename = ename;

		System.out.println("Employee number -   " +eno);
		System.out.println("Employee Name  -    " +ename);

	}

	public ConstructorDemo(int eno, String ename, float sal) {
		
		this(1,"Nik");
		
		this.eno = eno;
		this.ename = ename;
		this.sal = sal;

		System.out.println("Employee number - " +eno);
		System.out.println("Employee Name   - " +ename);
		System.out.println("Employee Salary  - " +sal);

	}

	public static void main(String[] args) throws InterruptedException {
		ConstructorDemo demo = new ConstructorDemo();
		
		//ConstructorDemo demo1 = new ConstructorDemo();
		ConstructorDemo demo2 = new ConstructorDemo(1, "Nik", 465.5f);

	}
}
