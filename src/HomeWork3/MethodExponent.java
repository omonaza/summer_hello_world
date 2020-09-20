package HomeWork3;

import java.util.Scanner;

public class MethodExponent {
    public static int exponent(int base , int exp ) {
        int product = 1;
        for (int i = exp; i !=0  ; i--) {
            product *= base;
        } return product;


    }

    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.println("Please enter the base ");
        int base = userInput.nextInt();
        System.out.println("Please enter the exponent ");
        int exp = userInput.nextInt();
        System.out.println(base + " raises to the power of " + exp + " is: " + exponent(base, exp));
    }
}
