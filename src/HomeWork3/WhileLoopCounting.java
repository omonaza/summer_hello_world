package HomeWork3;

import java.util.Scanner;

public class WhileLoopCounting {
    public static void main (String [] args ) {
        Scanner userInput = new Scanner(System.in);
        System.out.println("Type Message, I'll display it 5 times");
        String message = userInput.nextLine();
         int counter = 0 ;
         while (counter < 5) {
             System.out.println(message);
             counter++;
         }
    }
}
