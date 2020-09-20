package HomeWork2;

import java.util.Scanner;

public class Add2Integer {
    public static int AddTwoInteger ( int a , int b) {
        return a + b;
    }
    public static void main (String [] args ) {
        Scanner userInput = new Scanner(System.in);
        System.out.println("Please Enter the Numbers in order");
        int a = userInput.nextInt();
        int b = userInput.nextInt();
        System.out.println("The sum is " +AddTwoInteger(a , b) );
    }
}
