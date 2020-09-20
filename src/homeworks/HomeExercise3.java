package homeworks;

import java.util.Scanner;

public class HomeExercise3 {
    /*
    Exercise 3: Write a Java program to input and display your password.
Expected Output
Input your Password:
Your password was: abc@123
     */
    public static void main (String[] args ) {
        Scanner input = new Scanner(System.in);
        System.out.println("input your password :");
        String password = input.nextLine();
        System.out.println("Your password was  " +password);


    }
}
