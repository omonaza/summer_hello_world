package HomeWork3;

import java.util.Scanner;

public class AddingUpValuesInWhileLoop {
    public static int addingUp() {
        int num = 0;
        Scanner userInput = new Scanner(System.in);
        System.out.println("Please Enter number");
        num = userInput.nextInt();
        int sum = 0;
        while (num != 0) {
            sum += num;
            System.out.println("the total so far is " + sum);
            System.out.println("number: ");
            num = userInput.nextInt();

        }
        return sum;
    }

    public static void main(String[] args) {

        System.out.println("the total is " +addingUp());
    }
}
