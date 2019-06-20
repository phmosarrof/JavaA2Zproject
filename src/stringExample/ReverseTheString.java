package stringExample;

public class ReverseTheString {

	public static void main(String[] args) {


		String a = "mosarrof";
		String b = "";

		for(int i = a.length()-1; i>=0; i--) 

		{
			System.out.println(a.charAt(i));

			b = b+a.charAt(i);
		}

		System.out.println(b);
		System.out.println(b.indexOf("m"));
		System.out.println(b.charAt(6));

	}


}


