package HomeWork2;

import java.util.Random;
import java.util.Scanner;

public class PrintNumberInWord {
    public static String PrintNumberInWord(int number) {
        String word = "";
        if (number == 0) {
            word = "Zero";
        } else if (number == 1) {
            word = "One";
        } else if (number == 2) {
            word = "Two";
        } else if (number == 3) {
            word = "Three";
        } else if (number == 4) {
            word = "Four";
        } else if (number == 5) {
            word = "Five";
        } else if (number == 6) {
            word = "Six";
        } else if (number == 7) {
            word = "Seven";
        } else if (number == 8) {
            word = "Eight";
        } else if (number == 9) {
            word = " Nine";
        } else {
            word = "Some Other Numbers";
        }
        return word;
    }

    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.println("Please enter the number");
        int number1 = userInput.nextInt();
        String number = PrintNumberInWord(number1);
        System.out.println(number);

        System.out.println("Please enter the number");
        int number2 = userInput.nextInt();
        String result = "";
        switch (number2) {
            case 0:
                result = " zero";
                break;
            case 1:

                result = " one";
                break;
            case 2:
                result = "two";
                break;
            case 3:
                result = "three";
                break;
            case 4:
                result = "four";
                break;
            case 5:
                result = "five";
                break;
            case 6:
                result = "six";
                break;
            case 7:
                result = "Seven";
                break;
            case 8:
                result = "eight";
                break;
            case 9:
                result = "nine ";
        } System.out.println(result);


    }

}
