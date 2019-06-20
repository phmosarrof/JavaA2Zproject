package Pyramid;

public class NumberPattern {

	public static void main(String[] args) {
		for (int x = 1; x <= 5; x++) {
			for (int y = 1; y <= x; y++) {
				System.out.print(y + " ");
			}
			System.out.println();
		}
	}
}
