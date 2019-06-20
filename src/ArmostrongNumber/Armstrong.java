package ArmostrongNumber;
public class Armstrong {

    public static void main(String[] args) {

    /*	A positive integer is called an Armstrong number of order n if

    	abcd... = an + bn + cn + dn + ...
    	In case of an Armstrong number of 3 digits, the sum of cubes of each digits is equal to the number itself. For example:

    	153 = 1*1*1 + 5*5*5 + 3*3*3  // 153 is an Armstrong number.
    	
     for (;originalNumber != 0; originalNumber /= 10) {
    n++;
}
    	
    	*/
    	int number = 900, originalNumber, remainder, result = 0;

        originalNumber = number;

        while (originalNumber != 0)
        {
            remainder = originalNumber % 10;
            result += Math.pow(remainder, 3);
            originalNumber /= 10;
        }

        if(result == number)
            System.out.println(number + " is an Armstrong number.");
        else
            System.out.println(number + " is not an Armstrong number.");
    }
}