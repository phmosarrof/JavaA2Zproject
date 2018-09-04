package objectOrientedProgram;

class Men01 {

	String FristName;
	String LastName;
	char Gender;
	int Age;
	double Hight;
	float Weight;
	String DOB;
	boolean IsAlive;
	long phoneNo;
	String SSN;


	void setData() {

	}
	void display() {

	}
	public void Man() {

	} 
	
}
	public class Men {
		
		public static void main(String [] args) {

			Men01 Human = new Men01();

			Human.FristName = "Monir";
			//System.out.println(+ FristName);
			Human.LastName = "hossain";
			Human.Age = 15;
			Human.Gender = 'M';
			Human.Hight = 145.50;
			Human.Weight = 125;
			Human.IsAlive = true;
			Human.DOB = "10.10.2000";
			Human.SSN = "2102454214";
			Human.phoneNo = 1717692156;
System.out.println(Human.Age);
		}

	}
	
