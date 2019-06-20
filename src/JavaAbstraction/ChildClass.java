package JavaAbstraction;

public class ChildClass extends ParentClass {
	int var = 100;

	ChildClass() {
		super();
	}

	public static void main(String[] args) {
		ChildClass p = new ChildClass();

		p.method(); // child
		System.out.println(p.var);

		p.myMethod(); // overriding
		p.myMethod2("Mymethod", 100); // overriding

	}

	public void method() {
		System.out.println("It is public method in child class");
		super.method();
		System.out.println(super.var);
	}

	@Override
	void myMethod() {
		System.out.println("It is overriding mymethod from parents class");

	}

	@Override
	void myMethod2(String a, int c) {
		System.out.println("It my method 2 overriding method from parents");

	}
}