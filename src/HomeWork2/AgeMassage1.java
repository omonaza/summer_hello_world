package HomeWork2;

import java.util.Scanner;

public class AgeMassage1 {
    public static void main ( String [] args ) {
        Scanner userInput = new Scanner(System.in);
        System.out.println("Please Enter Your Age ");
        int age = userInput.nextInt();

        if (age < 16 ) {
            System.out.println("You can't drive ");
        } else if (age >= 16 && age <=17 ) {
            System.out.println("You can drive but not to vote ");
        }else if (age >= 18 && age <= 24 ) {
            System.out.println("You can vote but not rent a car ");
        } else {
            System.out.println("You can do pretty much everything  ");
        }
    }
}
