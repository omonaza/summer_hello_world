package homeworks;

import java.util.Scanner;

public class TheGreatestNumber {

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int number1 , number2 ;
        System.out.println("Please Enter the first number : ");
        number1=input.nextInt();
        System.out.println("Please Enter the second number : " );
        number2 = input.nextInt();


        if(number1>number2) {
            System.out.println("The Largest number = " + number1);
        }
           else if(number2>number1) {
            System.out.println("The Largest Number = " + number2);
        }
           else {
            System.out.println("Both are equal ");
        }
    }
    }
