package homeworks;

import java.util.Scanner;

public class FindingTheAverage {

    public static void main (String [] args ) {

        Scanner input = new Scanner(System.in);
        int number1 , number2 ;
        System.out.println("Please Enter The First Number :");
        number1=input.nextInt();
        System.out.println("Please Enter The Second Number :");
        number2 = input.nextInt();
        int sum = number1 + number2 ;
        int difference = number1 - number2;
        int product = number1 * number2;
        double average =( number1 + number2) / 2 ;
        int distance = Math.abs(number1-number2);
        int max = Math.max(number1,number2);
        int min = Math.min(number1,number2);

        System.out.println("The sum of " +number1 + " and " +number2 + " = " +sum);
        System.out.println("The Difference of " +number1 + " and " +number2 + " = " +difference);
        System.out.println("The Product of " +number1 + " and " +number2 + " = " +product);
        System.out.println("The Average of " +number1 + " and " +number2 + " = " +average);
        System.out.println("The Distance of " +number1 + " and " +number2 + " = " +distance);
        System.out.println("The Max of " +number1 + " and " +number2 + " = " +max);
        System.out.println("The Min of " +number1 + " and " +number2 + " = " +min);





    }
}
