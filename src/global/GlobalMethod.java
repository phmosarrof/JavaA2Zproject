package global;

public class GlobalMethod {

	public GlobalMethod() {

	}

	private int a = 10;
	static String b = "ICTERGURU";

	public void getData() {

		System.out.println(a);

	}

	public static void getData1() {

		System.out.println(b);
	}

	public static void main(String[] args) {

		GlobalMethod obj = new GlobalMethod();
		obj.getData();
		GlobalMethod.getData1();
		getData1();

	}

}
