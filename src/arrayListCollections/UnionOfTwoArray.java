package arrayListCollections;

import java.util.HashSet;

public class UnionOfTwoArray {

	public static void main(String[] args) {

		int a[] = { 1, 2, 3, 5 };
		int b[] = { 1, 2, 0, 3, 7, 5, 6 };

		unionArrays(a, b);
	}

	public static void unionArrays(int[]... argm) {

		HashSet<Integer> union = new HashSet<Integer>();

		for (int[] x : argm) {

			for (int i : x) {

				union.add(i);
			}
		}

		System.out.println(union);

	}

}
