package Practice;

import java.util.Scanner;

public class PracticeFromNuta2 {


        public static void main (String [] args ) {
            Scanner userInput = new Scanner(System.in);
            System.out.println("Please Enter The Numbers ");
            int num1 = userInput.nextInt();
            int num2 = userInput.nextInt();
            trueFalse(num1,num2);
           // boolean isEqual = trueFalse(num1,num2);
           // System.out.println("IsEqual " +num1 + " and " +num2 +" = " +isEqual);
        }
          public static void trueFalse (int num1, int num2) {
            boolean isEqual;
            if (num1==num2) {
                isEqual = true;
                System.out.println("isEqual " +num1 +" and " +num2 +" = " +isEqual);
            } else {
                isEqual=false;
                System.out.println("isEqual " +num1 +" and " +num2 +" = " +isEqual);
            }

          }
        /*public static boolean trueFalse (int num1, int num2) {
            boolean isEqual;
            if (num1 == num2) {
                isEqual = true;
            } else
                isEqual = false;

            return isEqual;
        }*/
    }


