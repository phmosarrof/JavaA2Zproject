package stringExample;

import java.util.*;

class Palindrome {
	public static void main(String args[]) {
		
		String original, reverse = ""; 	// Objects of String class
		Scanner in = new Scanner(System.in);

		System.out.println("Enter a string to check it is a palindrome or not !");
		System.out.println("-----------------------------------------");
		
		original = in.nextLine();

		// String str = original;
		
		String[] mystring = original.split(" ");

		String lengthnew = original.replaceAll("\\s+", "");

		for (int i = original.length() - 1; i >= 0; i--)
  
			reverse = reverse + original.charAt(i);

		if (original.equals(reverse)) {
			System.out.println("The string is a palindrome.");
			System.out.println("The total character of string 	: " + lengthnew.length());
			System.out.println("The inputed text has 	        : " + mystring.length + " word/s");
		} else {

			System.out.println("The string isn't a palindrome.....");
			System.out.println("-----------------------------------------");
			System.out.println("The Reverse text 	                : " + reverse);
			System.out.println("The Total character of the string 	: " + lengthnew.length());
			System.out.println("The inputed text has 		        : " + mystring.length + " word/s");
		}

	}

}