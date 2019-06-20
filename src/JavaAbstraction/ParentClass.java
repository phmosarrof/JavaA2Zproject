package JavaAbstraction;

public abstract class ParentClass {

	
	int var = 10;
	ParentClass() {
		System.out.println("Parent class constractor");
	}

	public static void main(String[] args) {

	}

	public void method() {
		System.out.println("It is public method in Parent class");
	}

	abstract void myMethod();

	abstract void myMethod2(String a, int c);
}
