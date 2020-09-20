package HomeWork2;

import java.util.Scanner;

public class CompareTwoNumbers {

    public static void main ( String [] args ) {
        Scanner userInput = new Scanner(System.in);
        System.out.println("Please Enter Numbers in order ");
        int a = userInput.nextInt();
        int b = userInput.nextInt();
        String result = "";
        if ( a > b ) {
            result = " the second number is smaller then first  ";
        } else if (a < b ) {
            result = "first number is smaller than second number";
        }else  {
            result = " first number and second number are equals ";
        } System.out.println(result);
    }
}
