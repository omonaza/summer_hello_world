package HomeWork3;

import java.util.Scanner;

public class ReverseString {
    public static String reverseString ( String name) {
        StringBuilder std = new StringBuilder(name);
         return std.reverse().toString();

    }

    public static void main (String [] args ) {
        Scanner userInput = new Scanner(System.in);
        System.out.println("Please Enter some word ");
        String someWord = userInput.nextLine();
        System.out.println(reverseString(someWord));
    }
}
