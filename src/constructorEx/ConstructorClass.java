package constructorEx;

public class ConstructorClass {
	static int k;
	String name;
	static int a = 10;
	static int b = 30;
	int c;
	private char[] d;

	public int sum(int a, int b) {
		return a + b;
	}

	public ConstructorClass(int a, int b) {
		c = a + b;
	}
	public ConstructorClass(int a, String bd) {
		int d = a;
	}
	public void display() {

		name = "Karim";

		System.out.println(name);
	}

	public static void main(String[] args) {

		ConstructorClass obj = new ConstructorClass(36,"Monir");

		System.out.println(obj.a);
		System.out.println(obj.b);
		System.out.println(obj.c);
		System.out.println(obj.d);
		obj.display();

		k = obj.sum(5, 9);

		System.out.println(k);

	}

}
