package homeworks;

import java.util.Scanner;

public class TheGreatestNumber2 {
    public static void main ( String [] args ) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the Fist number ");
        int num1 = input.nextInt();
        System.out.println("Please Enter the Second Number ");
        int num2 = input.nextInt();
        System.out.println("Please Enter Third Number ");
        int num3 = input.nextInt();


       // boolean theGreatest= num1>= num2 || num2 <= num1 || num1 + num2 >= num3 ;
       // System.out.println("The Greatest Number of " + num1 +" and " + num2 +" is "  +num3 + "\n" +theGreatest );

        if(num1>=num2  ) {
            System.out.println("The Greatest Number is " + num1);
        }
            else if(num2>=num3) {

            System.out.println("The Greatest number is " +num2 );
        }
         else
             System.out.println("The Greatest : " +num3  );

        }


        }


