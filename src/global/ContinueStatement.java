
package global;

public class ContinueStatement {

	public static void main(String[] args) {

		for (int i = 2; i <= 10; i++) {
			/*
			 * I have mentioned continue statement inside if condition where i is equal to 4
			 * if i value is equal to 4 then the control goes to continue statement and the
			 * control jumps at the begining of for loop for next iteration without
			 * executing print statement. So, the output "Value of i is 4" wont display in
			 * the console.
			 */

			if (i == 4) {
				continue;
			}

			System.out.println("Value of i is " + i);

		}

	}

}