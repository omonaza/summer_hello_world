package sessions.WhileLoop;

import java.util.Scanner;

public class WhileUserInput {
    public static void main(String[] args){
        Scanner userInput = new Scanner(System.in);
        int counter = 0;
        while (counter < 5) {
            System.out.println("Please enter two numbers: ");
            int start = userInput.nextInt();
            int end = userInput.nextInt();
            int sum = sumOfNumbersInRange(start, end);
            System.out.println("The sum of numbers in range "+ sum);
            counter++;
        }
    }

    public static int sumOfNumbersInRange(int start, int end){
        int result = 0;
        int counter = start;
        while (counter <= end) {
            result = result + counter;
            counter++;
        }
        return result;
    }

    }








