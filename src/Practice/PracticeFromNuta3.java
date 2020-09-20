package Practice;

import java.util.Scanner;

public class PracticeFromNuta3 {
    public static void main (String [] args ) {
        Scanner userInput =new Scanner(System.in);
        System.out.println("Please Enter The Number ");
        int num1 = userInput.nextInt();
        String EvenOdd =EvenOrOdd(num1);
        System.out.println(" is number Even Or Odd "+num1 + " = " +EvenOdd );
       // EvenAndOdd(num1);

    }
    public static String EvenOrOdd ( int IsEvenOrOddNumber) {
        String result;
        if (IsEvenOrOddNumber % 2 == 0) {
            result = IsEvenOrOddNumber + " is an Even Number";
        } else  {
            result = IsEvenOrOddNumber + " is an Odd Number";
        } return result;
    }

   /* public static void EvenAndOdd (int isEvenOrOddNumber){
        if(isEvenOrOddNumber % 2 == 0){
          String result = isEvenOrOddNumber + "";
          System.out.println( result +" is an Even Number");
        }
        else {
            System.out.println(isEvenOrOddNumber +" is an Odd Number ");
        }
    }*/
}
