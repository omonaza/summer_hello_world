package homeworks;

import javax.swing.*;
import java.util.Scanner;

public class PositiveOrNegativeNum {

    public static void main(String[] args) {

        int myNum;
        Scanner input = new Scanner(System.in);
        System.out.println(" Please Enter the number  " );
        myNum = input.nextInt();

        if (myNum > 0) {
            System.out.println("Given number is Positive ");
        }
        else if (myNum < 0)
        System.out.println("Given number is Negative");




    }
}
