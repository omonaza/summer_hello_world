package HomeWork3;

import java.util.Scanner;

public class returnFirstHalfOfWord {
    public static String theFirstHalf (String word) {
        return word.substring(0 ,word.length()/2);
    }
    public static void main (String [] args ) {
        Scanner userInput = new Scanner(System.in);
        System.out.println("Please Enter some Word ");
        String word = userInput.nextLine();
        System.out.println(theFirstHalf(word));
    }

}
