package HomeWork2;

import java.util.Scanner;

public class CheckPassFail2 {

    public static void CheckPassFail ( int mark ) {
        if (mark >= 50 ){
            System.out.println("PASS");
        }else {
            System.out.println("FAIL");
        }
        System.out.println("DONE");
    }

    public static void main ( String [] arsgs ) {
        Scanner userInput = new Scanner(System.in);
        System.out.println("Please Enter The Number ");
        int mark = userInput.nextInt();
        CheckPassFail(mark);

    }
}
