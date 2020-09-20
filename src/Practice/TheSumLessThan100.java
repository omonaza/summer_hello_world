package Practice;

import java.util.Scanner;

public class TheSumLessThan100 {
    public static boolean SumLessThan ( int num1 , int num2 ) {
        boolean result = true;
        int sum = num1 + num2;
        if (sum < 100){
            result = true;
        } else {
            result =false;
        } return result;
    }

    public static void main (String [] args ) {
        Scanner userInput = new Scanner(System.in);
        System.out.println("Please Enter the Numbers In Order");
        int num1 = userInput.nextInt();
        int num2 = userInput.nextInt();
        boolean result = SumLessThan(num1,num2);
        System.out.println(" is sum less than 100: ? " +result);
    }
}
