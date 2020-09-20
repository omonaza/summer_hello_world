package HomeWork3;

import java.util.Scanner;

public class CubeOfTheNumber {

    public static int TheCubeOfTheNumber (int num1 ) {
        return num1 * num1 * num1;
    }

    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        for (int i = 0; i < 4 ; i ++) {
            System.out.println("Please Enter the Number");
            int number = userInput.nextInt();
            System.out.println("Number is " + number + " and cube of " + number + " is " + TheCubeOfTheNumber(number));
        }
    }

}
