package arrayListCollections;

import java.util.HashSet;
import java.util.Iterator;

public class hashSetListFramework {
	// HashSet cannot accept duplicate values
	// HashSet,treeSet,LinkedHashSet- Implementing Set interface
	// there is no guarantee that data is store sequentially
	// you can access and insert any value in any index
	public static void main(String[] args) {

		HashSet<String> a = new HashSet<String>();
		a.add("Mosarrof");
		a.add("Hossain");
		a.add("Mosarrof");
		a.add("Hossain");

		a.add("25");
		a.add("QA");
		System.out.println(a);

		a.remove(3);
		System.out.println(a);
		System.out.println(a.contains("26"));

		System.out.println(a.size());
		System.out.println(a.isEmpty());

		Iterator<String> i = a.iterator();
		System.out.println(i.next());
		while (i.hasNext()) {
			System.out.println(i.next());
		}
	}

}
