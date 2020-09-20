package HomeWork3;

import java.util.Scanner;

public class DisplayTheTermsOfOdd {

    public static void main (String [] args ) {
        Scanner userInput = new Scanner(System.in);
        System.out.println("Input number of terms is");
        int input = userInput.nextInt();

        System.out.println("The odd numbers are ");
        int counter=1;
        int sum =0;
        while (counter <= input) {
            System.out.println(2*counter-1);
            sum= sum + 2*counter-1;
           counter++;
        }
        System.out.println ("The Sum of odd Natural Number upto " +counter+" terms is: " +sum);


    }
}
