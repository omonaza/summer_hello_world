package HomeWork3;

import java.util.Scanner;

public class ReturningGreetingFromName {
    public static String returningGreeting (String name ) {
        return  "Hello " + name  + "!";

    }
    public static void main (String [] args ) {
        Scanner userInput = new Scanner(System.in);
        System.out.println("Please Enter Your Name");
        String name = userInput.nextLine();
        String result = returningGreeting(name);
        System.out.println(result);

    }

}
