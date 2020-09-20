package sessions.if_statement;
import java.util.Scanner;
public class BasicCalculatorWithIfAndElse {

    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.println("Please enter operator (*, /, +, -)");
        String operator = userInput.next();
        System.out.println("the operator you entered is "+operator);
        System.out.println("Please enter two numbers: ");
        double firstNumber = userInput.nextDouble();
        double secondNumber = userInput.nextDouble();
        if (operator.equals("*")) {
            System.out.println("The product of "+firstNumber+" and "+secondNumber+ " ="+(firstNumber*secondNumber));
        } else if (operator.equals("/")) {
            if (secondNumber == 0) {
                System.out.println("I do not know how to devide "+firstNumber+" to "+secondNumber);
            } else {
                System.out.println("The division of " + firstNumber + " to " + secondNumber + " =" + (firstNumber / secondNumber));
            }
        } else if (operator.equals("-")) {
            System.out.println("The difference of "+firstNumber+" and "+secondNumber+ " ="+(firstNumber - secondNumber));
        } else if (operator.equals("+")) {
            System.out.println("The sum of "+firstNumber+ " and "+secondNumber+" ="+(firstNumber+secondNumber));
        } else {
            System.out.println("I can only *, /, -, + two numbers, please try again!");
        }
    }
}
