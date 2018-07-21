package objectOrientedProgram;

public class Result extends Student {
	float mark;

	void setdata(){
		roll = 101;
		name = "Monium";
		mark = 80.00f;		
	}
	void display() {
		System.out.println("Roll : "  + roll);
		System.out.println("Name : " + name);
		System.out.println(" Mark : " + mark);
	}

}
