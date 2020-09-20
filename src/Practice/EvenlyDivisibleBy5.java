package Practice;

import java.util.Scanner;

public class EvenlyDivisibleBy5 {

    public static boolean DivisibleBy5 (int Evenly ) {
        boolean result ;
        if (Evenly % 5 == 0 ) {
            result = true ;
        } else {
            result = false ;
        } return result;
    }

    public static void main (String [] args ) {
        Scanner userInput = new Scanner(System.in);
        System.out.println("Please Enter the Number ");
        int evenly = userInput.nextInt();
        boolean result = DivisibleBy5(evenly);
        System.out.println(" is number evenly divisible by 5 ?  " +result);

    }
}
