package objectOrientedProgram;



public class Demo_Overloading {
	   void disp(int a, double b){
		System.out.println("Method A");
	   }
	   void disp(int a, double b, double c){
		System.out.println("Method B");
	   }
	   public static void main(String args[]){
		   Demo_Overloading obj = new Demo_Overloading();
		/* I am passing float value as a second argument but
		 * it got promoted to the type double, because there
		 * wasn't any method having arg list as (int, float)
		 */
		obj.disp(100, 20.67f);
		obj.disp(200, 211);
		obj.disp(10, 20, 21);

	   }
	}
	