package arrayListCollections;

import java.util.ArrayList;

public class ArrayListFramework {
	// ArraList can accept duplicate values
	// ArraList, LinkedList,vector Class - Implement the List interface
	// Array have fixed size whereas Arraylist can grow dynamically
	// you can access and insert any value in any index
	public static void main(String[] args) {

		ArrayList<String> a = new ArrayList<String>();
		
		a.add("Mosarrof");
		a.add("Hossain");
		a.add("Mosarrof");
		a.add("Hossain");
		a.add(0, "Inroduction");
		a.add("25");
		a.add("QA");
		System.out.println(a);
		System.out.println(a.get(2));
		a.remove(3);
		System.out.println(a);
		System.out.println(a.contains("25"));
		System.out.println(a.indexOf("QA"));
		System.out.println(a.lastIndexOf(a));
		System.out.println(a.size());
		System.out.println(a.isEmpty());

	}

}
