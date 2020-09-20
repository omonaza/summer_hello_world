package HomeWork2;

import java.util.Scanner;

public class IfTheSumEqualsToThirdNum {

    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.println("Please Enter The First Number");
        int num1 = userInput.nextInt();
        System.out.println("Please Enter The Second Number");
        int num2 = userInput.nextInt();
        System.out.println("Please Enter Third Number ");
        int num3 = userInput.nextInt();
        boolean EqualToThird = isEqualToThird(num1, num2, num3);
        System.out.println("The sum of " + num1 + " and " + num2 + " isEqual to " + num3 + " = " + EqualToThird);
       // isEqualToThird(num1, num2, num3);
    }
    public static boolean isEqualToThird(int num1, int num2, int num3) {
        int sum = num1 + num2;
        boolean result = num3 == sum ? true : false;
        return result;
    }
        /* public static void  isEqualToThird (int num1 , int num2 ,int num3) {
        int sum = num1 + num2;
        if (num3 == sum){
            System.out.println("The Result is " +true );
        } else {
            System.out.println("The Result is " +false );
        }
     }*/
}