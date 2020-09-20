package sessions.if_statement;

import java.util.Scanner;

public class BasicCalculators {

    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);
        System.out.println("Please enter operator (*, /, +, -)");
        String operator = userInput.next();
        System.out.println("Please enter two numbers: ");
        double firstNumber = userInput.nextDouble();
        double secondNumber = userInput.nextDouble();
        switch (operator) {
            case "*":
                System.out.println("The product of " + firstNumber + " and " + secondNumber + " =" + (firstNumber * secondNumber));
                break;
            case "/":
                if (secondNumber == 0) {
                    System.out.println("I do not know how to devide " + firstNumber + " to " + secondNumber);
                } else {
                    System.out.println("The division of " + firstNumber + " to " + secondNumber + " =" + (firstNumber / secondNumber));
                }
                break;
            case "-":
                System.out.println("The difference of " + firstNumber + " and " + secondNumber + " =" + (firstNumber - secondNumber));
                break;
            case "+":
                System.out.println("The sum of " + firstNumber + " and " + secondNumber + " =" + (firstNumber + secondNumber));
                break;
            default:
                System.out.println("I can only *, /, -, + two numbers, please try again!");
                break;
        }
    }
}

