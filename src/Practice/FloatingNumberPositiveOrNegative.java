package Practice;

import java.util.Scanner;

public class FloatingNumberPositiveOrNegative {
    /*. Write a Java program that reads a floating-point number and prints "zero"
        if the number is zero. Otherwise, print "positive" or "negative".
    Add "small" if the absolute value of the number is less than 1, or "large" if it exceeds 1,000,000.*/
    public static String floatingDecider (double num1) {
        String result ;
        if ( num1 == 0.0 ) {
            result = " Zero ";
        } else if (num1 < 0.0) {
            result = " Negative ";
        } else {
            result = "Positive";
        } if ( num1 < 1.0 ) {
            result += " Small ";
        }else if (num1 > 1000000.0) {
            result += " Large ";
        } return result;
    }
    public static void main ( String [] args ) {
        Scanner userInput = new Scanner(System.in);
        System.out.println("Please Enter The Number");
        double num1 = userInput.nextDouble();
        String positiveOrNegative = floatingDecider(num1);
        System.out.println("Is the Number Small Negative or large Positive: ? " +positiveOrNegative);
    }
}
