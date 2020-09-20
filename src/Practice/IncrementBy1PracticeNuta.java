package Practice;

import java.util.Scanner;

public class IncrementBy1PracticeNuta {
    public static void main ( String [] args ) {
        Scanner userInput = new Scanner(System.in);
        System.out.println("Please enter the number ");
        int num1 = userInput.nextInt();
        num1++;
        System.out.println(" the number increments by 1 :  " +num1);
    }
}
