package objectOrientedProgram;

class OuterClass {

	private int D = 89;
	String s = "M";

	class InnnerClass {
		int k = 90;
		float o = 33.06f;
		
		public int methodAdd () {
			System.out.println("Print this line.");
			return 10;
		}
	}

	public int getD() {
		return D;
	}

	public void setD(int d) {
		D = d;
	}
}
	public class NestedClass{

		public static void main(String args[]) {

			OuterClass outer = new OuterClass();

			OuterClass.InnnerClass inner = outer.new InnnerClass();
			
			System.out.println(inner.k);
			System.out.println(inner.o);
			System.out.println(inner.methodAdd());
			System.out.println(outer.s);
			System.out.println(outer.getD());
		


		}

	}



