package objectOrientedProgram;

public class PracticeNew {

		
		String Name;
		int Age;
		
		public String getName() {
			return Name;
		}
		public int getAge() {
			return Age;
		}
		public void setName(String moni) {
			this.Name = moni;
		}
		public void setAge( int Age) {
			this.Age= Age;
		}
		public static void main(String [] argus) {
			
			PracticeNew Man = new PracticeNew();
			PracticeNew Woman = new PracticeNew();
			
			((PracticeNew) Man).setName(" Mosarrof Hossain");
			((PracticeNew) Woman).setName(" Nahian Afroz");
			((PracticeNew) Man).setAge(30);
			((PracticeNew) Woman).setAge(24);
			
			System.out.println("Name :" + Man.getName());
		
			System.out.println( "Age -  " + Man.getAge());
			
			System.out.println( "Name :" + Woman.getName());
			
			System.out.println("Age -  " + Woman.getAge());
		}
	}


