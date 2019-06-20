package stringExample;

import java.io.*;
import java.util.*;

public class Bsp1_0828240_3 {

	public static void main(String[] args) throws Exception {
	//	BufferedReader br = new BufferedReader(new FileReader("C:\\GivenTextFile.txt"));
		Scanner br = new Scanner(System.in);
		String line = "", str = "";
		int count = 0;

		while ((line = br.nextLine()) != null) {
			str += line + " ";
		}
		StringTokenizer st = new StringTokenizer(str);
		while (st.hasMoreTokens()) {
			String s = st.nextToken();
			count++;

		}
		System.out.println("Number of Words : " + count);
		System.out.println("Number of letters" + str.toCharArray().length);
	}
}