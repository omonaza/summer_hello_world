package HomeWork2;

import java.util.Scanner;

public class CheckOddEven2 {
    public static boolean OddOrEvenTest ( int OddOrEven ) {
        boolean answer ;
        if (OddOrEven % 2 == 0 ) {
           answer = false;
        } else {
            answer = true;
        } return answer;


    }
    public static void main (String [] args ) {
        Scanner userInput = new Scanner(System.in);
        System.out.println("Please Enter The Numbers ");
        int isOddOrEven = userInput.nextInt();
        boolean answer = OddOrEvenTest(isOddOrEven);
        System.out.println("is it An Odd Number: ? " +answer);

    }
}
