package Azamat;

import java.util.ArrayList;
import java.util.Scanner;

public class IncreasingOrDecreasingOrderOfNumber {
    public static void main(String[] args) {
        int number1 = 0;
        int number2 = 0;
        int number3 = 0;
        Scanner userInput = new Scanner(System.in);
        System.out.println("Please enter first integer number: ");
        boolean b = true;
        while (b) {
            String num = userInput.next();
            if (num.charAt(0) == '-') {
                if (Character.isDigit(num.charAt(1))) {
                    number1 = Integer.parseInt(num);
                    b = false;
                } else {
                    System.out.println("Please enter integer only: ");
                }
            } else {
                if (Character.isDigit(num.charAt(0))) {
                    number1 = Integer.parseInt(num);
                    b = false;
                } else {
                    System.out.println("Please enter integer only: ");
                }
            }
        }
        b = true;
        System.out.println("Please enter second integer number: ");
        while (b) {
            String num = userInput.next();
            if (num.charAt(0) == '-') {
                if (Character.isDigit(num.charAt(1))) {
                    number2 = Integer.parseInt(num);
                    b = false;
                } else {
                    System.out.println("Please enter integer only: ");
                }
            } else {
                if (Character.isDigit(num.charAt(0))) {
                    number2 = Integer.parseInt(num);
                    b = false;
                } else {
                    System.out.println("Please enter integer only: ");
                }
            }
        }
        b = true;
        System.out.println("Please enter third integer number: ");
        while (b) {
            String num = userInput.next();
            if (num.charAt(0) == '-') {
                if (Character.isDigit(num.charAt(1))) {
                    number3 = Integer.parseInt(num);
                    b = false;
                } else {
                    System.out.println("Please enter integer only: ");
                }
            } else {
                if (Character.isDigit(num.charAt(0))) {
                    number3 = Integer.parseInt(num);
                    b = false;
                } else {
                    System.out.println("Please enter integer only: ");
                }
            }
        }

        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.add(number1);
        numbers.add(number2);
        numbers.add(number3);

        System.out.println(numbers);

        if (number1 < number2 && number2 < number3) {
            System.out.println("increasing");
        } else if (number3 < number2 && number2 < number1) {
            System.out.println("decreasing");
        } else {
            System.out.println("Neither increasing or decreasing order");
        }

    }
}