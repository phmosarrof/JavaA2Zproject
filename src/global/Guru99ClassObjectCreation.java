package global;
public class Guru99ClassObjectCreation {
	public static void main (String[] args) throws ClassNotFoundException {
		//1 - By using Class.forname() method 
		Class c1 = Class.forName("Guru99ClassObjectCreation"); 
		//2- By using getClass() method 
		Guru99ClassObjectCreation guru99Obj = new Guru99ClassObjectCreation();
		Class c2 = guru99Obj.getClass();
		//3- By using .class 
		Class c3= Guru99ClassObjectCreation.class;
		}
	}