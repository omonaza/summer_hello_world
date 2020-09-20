package HomeWork2;

import java.util.Scanner;

public class TheGreatestNum {
    public static void main (String [] args ) {
        Scanner inputUser = new Scanner(System.in);
        System.out.println("Please Enter The 3 Numbers in order");
        int num1 = inputUser.nextInt();
        int num2 = inputUser.nextInt();
        int num3 = inputUser.nextInt();
        int sum = num1 + num2;

        if(num1>=num2)
            System.out.println("The Greatest number is " +num1);
        else if (num1<= num2 && sum<=num3)
            System.out.println("The Greatest number is " +sum);
        else
            System.out.println("The Greatest number is " +num3);
    }
}
