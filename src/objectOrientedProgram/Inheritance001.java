package objectOrientedProgram;

public class Inheritance001 {

	public static void main(String[] args) {
		
 Student s = new Student();
 Result r = new Result();
 s.name = " Monium";
 s.roll = 101;
 System.out.println(" Name : " +s.name);
 System.out.println(" Name : " +s.roll);
		 
 System.out.println(" Class Name of S : " + s.getClass());
 System.out.println(" Memory location of S object : " + s.toString());
 System.out.println(" Class Name of S : " + s.equals("It's me"));
 System.out.println(" Roll : " + r.roll);
 System.out.println(" Class Name of r : " + r.getClass());
 System.out.println(" Memory location of r object : " + r.toString());
	}

}
