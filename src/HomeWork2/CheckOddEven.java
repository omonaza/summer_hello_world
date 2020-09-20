package HomeWork2;

import java.util.Scanner;

public class CheckOddEven {
    public static void main ( String [] args ) {
        Scanner userInput = new Scanner(System.in);
        System.out.println("Please Enter the Number");
        int oddOrEvenNumber = userInput.nextInt();

        if ( oddOrEvenNumber % 2 ==0 ) {
            System.out.println(" is an even number");
        } else {
            System.out.println("An odd number");
        } System.out.println("Bye");
    }
}
