package HomeWork2;

import java.util.Scanner;

public class FindingTheSumAndAverage {
    public static void main (String [] args ) {
        Scanner inputUser = new Scanner(System.in);
        System.out.println("Please enter the 5 numbers in order");
        int num1 = inputUser.nextInt();
        int num2 = inputUser.nextInt();
        int num3 = inputUser.nextInt();
        int num4 = inputUser.nextInt();
        int num5 = inputUser.nextInt();
        int sum = num1 + num2 + num3 + num4 + num5;
        double average =(double)sum / 5;
        System.out.println("The sum of 5 is " +sum);
        System.out.println("The Average is " +average);
    }
}
