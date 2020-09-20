package homeworks;

import java.util.Scanner;

public class Exercise4 {
    /*
    Exercise 4: Write a Java program to calculate the sum of two integers and return true
    if the sum is equal to a third integer.
Sample Output:
Input the first number : 5
Input the second number: 10
Input the third number : 15
The result is: true
     */
    public static void main (String [] args ) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the first number ");
        int num1 = input.nextInt();
        System.out.println("Please enter the second number ");
        int num2 = input.nextInt();
        System.out.println("Please enter the third number ");
        int num3 = input.nextInt();

        if ((num1+num2) >= num3) {
            System.out.println("The result is true");
        }
         else
             System.out.println(" Numbers are not equal ");



    }
}
