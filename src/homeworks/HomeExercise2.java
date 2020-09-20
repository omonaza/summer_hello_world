package homeworks;

import java.util.Scanner;

public class HomeExercise2 {
   /*
   Exercise 2: Write Java program to allow the user to input his/her age.
   Then the program will show if the person is eligible to vote.
   A person who is eligible to vote must be older than or equal to 18 years old.
Ex:
Enter your age: 18
You are eligible to vote.
    */
    public static void main (String [] args ) {
        Scanner input=new Scanner(System.in);
        System.out.println("Please enter your age ");
        int age = input.nextInt();

        if( age >= 18) {
            System.out.println("you are Eligible to vote ");
        }
        else {
            System.out.println("Yoo are not Eligible sorry ");
        }
    }
}
