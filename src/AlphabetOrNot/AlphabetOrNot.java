package AlphabetOrNot;

public class AlphabetOrNot {

	public static void main(String[] args) {

		char c = '4';
		int x = 0;

		if ((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z'))

			System.out.println(c + " is an Alphabet.");
		else
			System.out.println(c + " is not an Alphabet.");

		if ((x >= 0 && x <= 9999) || (x >= -1 && x <= -99999)) {

			System.out.println(c + " is a number");
			
		}
	}
}
