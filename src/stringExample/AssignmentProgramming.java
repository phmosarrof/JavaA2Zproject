package stringExample;


//this calculate the whole length of the string eg i am a man= 7 letter and 9 characters i just want the amount of the total letters

import java.util.Scanner;
public class AssignmentProgramming {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter a string");

        String input = sc.nextLine();

        System.out.println(input);

        String str = input;
        String[] myString = str.split(" ");
        
       
        int length = myString.length;
        System.out.println(length);
    }

}