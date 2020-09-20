package Practice;

import java.util.Scanner;

public class PracticeFromNuta1 {
    public static void main(String[] args) {


        Scanner userInput = new Scanner(System.in);
        System.out.println("Please Enter the Numbers ");
        int num1 = userInput.nextInt();
        int num2 = userInput.nextInt();
        //CalculatorInt(num1, num2);
        int sumOfNum1AndNum2 = CalculatorInt(num1, num2);
        System.out.println("The sum of " + num1 + " and " + num2 + " = " + sumOfNum1AndNum2);
    }


    public static int CalculatorInt(int num1, int num2) {
        int result = num1 + num2;
        return result;

        // public static void CalculatorInt(int num1, int num2){
        // System.out.println("The sum of " + num1 + " and " + num2 + " = " + (num1 + num2));


    }
}



