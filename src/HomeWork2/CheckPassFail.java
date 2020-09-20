package HomeWork2;

import java.util.Scanner;

public class CheckPassFail {
    public static void main (String [] args ) {
        Scanner userInput = new Scanner(System.in);
        System.out.println("Please Enter the number ");
        int mark = userInput.nextInt();

       if ( mark >= 50 ){
           System.out.println("Pass");
        } else {
           System.out.println("Fail");
       }
       System.out.println("Done");



    }
}
