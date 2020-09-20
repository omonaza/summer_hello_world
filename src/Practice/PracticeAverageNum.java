package Practice;

import java.util.Scanner;

public class PracticeAverageNum {

    public static double calculateTheAverage ( int a , int b, int c){
        return (a + b + c ) / 3;
    }

    public static void FindingAverage (int a, int b, int c) {
        double result = (a + b + c) / 3;
        System.out.println("The Average of " +a + " and " +b +  " and " +c + " = " +result);
    }

     public static void main ( String [] args ) {
         Scanner userInput =new Scanner(System.in);
         System.out.println("Please Enter the numbers ");
         int num1 = userInput.nextInt();
         int num2 = userInput.nextInt();
         int num3 = userInput.nextInt();
         //double average = calculateTheAverage(num1,num2,num3); // this is the one option
        // int average = (num1 + num2 + num3) / 3; second option .
         System.out.println("The Average of " +num1 + " and " +num2 +  " and " +num3 + " = " +calculateTheAverage(num1,num2,num3) );
          // in the System out the third option !
         FindingAverage(num1,num2,num3);




     }


         
         }




