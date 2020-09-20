package HomeWork2;

import java.util.Scanner;

public class MultiplicationTable {
    public static void main (String [] args ) {
        Scanner terms = new Scanner(System.in);
        int number = terms.nextInt();
        System.out.println("Please Enter the Number ");
        int num1 = 0, num2 = 1, num3 = 2, num4 = 3, num5 = 4, num6 = 5;
        int result1 = number * num1;
        int result2 = number * num2;
        int result3 = number * num3;
        int result4 = number * num4;
        int result5 = number * num5;
        int result6 =number * num6;
        System.out.println(number +"*" +num1 + "=" +result1);
        System.out.println(number +"*" +num2 + "=" +result2);
        System.out.println(number +"*" +num3 + "=" +result3);
        System.out.println(number +"*" +num4 + "=" +result4);
        System.out.println(number +"*" +num5 + "=" +result5);
        System.out.println(number +"*" +num6 + "=" +result6);
    }
}
