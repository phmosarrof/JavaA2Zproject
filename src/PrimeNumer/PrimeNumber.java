package PrimeNumer;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num = 1;
		boolean isPrime = true;
		for (int i = 2; i <= num / 2; i++) // num/2 or math.sqrt(num)
		{
			if (num % i == 0) {
				isPrime = false;

			}

		}
		if (isPrime) {
			System.out.println("It is prime");
		} else if (num == 1 && num == 0) {
			System.out.println("It is not prime");

		}

		else
			System.out.println("It is not prime");

	}
}
