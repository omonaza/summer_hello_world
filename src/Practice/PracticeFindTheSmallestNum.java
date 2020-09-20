package Practice;

import java.util.Scanner;

public class PracticeFindTheSmallestNum {

    public static void FindTheSmallestNum ( int a , int b , int c) {
        int min = a;
        if (a < b && a < c){
            min = a;
        } else if (b < a && b < c) {
            min=b;
        } else if (c < a && c < b ) {
            min = c;
            // else{  } is optional, we can still use it
        }  System.out.println("The Smallest of " +a + " and " +b +  " and " +c + " = " + min);
    }
       public static int FindTheSmallestNumber ( int a, int b, int c) {
           int min = a;
           if (a < b && a < c) {
               min = a;
           } else if (b < a && b < c) {
               min = b;
           } else if (c < a && c < b) {
               min = c;
               // else{  } is optional, we can still use it
           } return min;



       }


    public static void main (String [] args ) {
        Scanner userInput =new Scanner(System.in);
        System.out.println("Please Enter The Numbers in Order");
        int a = userInput.nextInt();
        int b = userInput.nextInt();
        int c = userInput.nextInt();
        FindTheSmallestNum(a,b,c);
        System.out.println("The Smallest of " +a + " and " +b +  " and " +c + " = " + FindTheSmallestNumber(a,b,c));

    }
}
