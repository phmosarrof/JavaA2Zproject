package objectOrientedProgram;

public class Inheritance001 {

	public static void main(String[] args) {
		
 Student s = new Student();
 s.name = " Monium";
 s.roll = 101;
 System.out.println(" Name : " +s.name);
 System.out.println(" Name : " +s.roll);
		 
 System.out.println(" Class Name of S : " + s.getClass());
 System.out.println(" Class Name of S : " + s.toString());
 System.out.println(" Class Name of S : " + s.equals("It's me"));
	}

}
