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
			PracticeNew Women = new PracticeNew();
			PracticeNew men = new PracticeNew();
			
			((PracticeNew) Man).setName(" Mosarrof Hossain");
			((PracticeNew) Woman).setName(" Nahian Afroz");
			((PracticeNew) Man).setAge(3);
			((PracticeNew) Woman).setAge(2);
			
			((PracticeNew) men).setName(" Nick Name : Hossain ");
			((PracticeNew) men).setAge(3);
			
			((PracticeNew) Women).setName(" Nick Name : Afroz ");
			((PracticeNew) Women).setAge(2);
			
			System.out.println("Name :" + Man.getName());
		
			System.out.println( "Age -  " + Man.getAge());
			
			System.out.println( "Name :" + Woman.getName());
			
			System.out.println("Age -  " + Woman.getAge());
			
			System.out.println( men.getName());
			
			System.out.println( "Age -  " + men.getAge());
			
			System.out.println(Women.getName());
			
			System.out.println( "Age -  " + Women.getAge());
		}
	}


