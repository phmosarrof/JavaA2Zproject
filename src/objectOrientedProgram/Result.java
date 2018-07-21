package objectOrientedProgram;

public class Result extends Student {
	float mark;
	public int setRoll;

	void setdata(){
		setRoll(101);
		setName("Monium");
		mark = 80.00f;		
	}
	void display() {
		System.out.println("Roll : "  + getRoll());
		System.out.println("Name : " + getName());
		System.out.println(" Mark : " + mark);
	}

}
