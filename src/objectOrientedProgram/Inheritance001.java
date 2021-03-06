package objectOrientedProgram;

public class Inheritance001 {

	public static void main(String[] args) {

		Student s = new Student();
		Result r = new Result();

		//s.name = " Monium";
		//s.roll = 101;
		
		s.setName("Monium");
		s.setRoll(101);

		System.out.println(" Name : " +s.getName());
		System.out.println(" Name : " +s.getRoll());

		r.setRoll = (102);
		r.setName("Mahdi");
		r.mark = 99;

		System.out.println();
		
		
		System.out.println(" Class Name of S : " + s.getClass());
		System.out.println(" Memory location of S object : " + s.toString());
		System.out.println(" Class Name of S : " + s.equals("It's me"));

		System.out.println();
		
		System.out.println(" Roll : " + r.getRoll());
		System.out.println(" Roll : " + r.getName());
		System.out.println(" Roll : " + r.mark);

		System.out.println(" Class Name of r : " + r.getClass());
		System.out.println(" Memory location of r object : " + r.toString());

		System.out.println("Is S object inheritance of Student class ?  " +( s instanceof Student));
		System.out.println("Is S object inheritance of Student class ?  " +( s instanceof Result));
		System.out.println("Is S object inheritance of Student class ?  " +( r instanceof Student));
		System.out.println("Is S object inheritance of Student class ?  " +( r instanceof Result));

		System.out.println("Is S object inheritance of Student class ?  " +( s instanceof Object));
		System.out.println("Is r object inheritance of Student class ?  " +( r instanceof Object));
	}

}
