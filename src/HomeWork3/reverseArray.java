package HomeWork3;

import java.util.Scanner;

public class reverseArray {
    public static void reverse() {
        Scanner userInput = new Scanner(System.in);
        System.out.println("Please Enter the size of Array");
        int array = userInput.nextInt();
        int[] num1 = new int[array];
        for (int i = 0; i < array; i++) {
            System.out.println("Please Enter the values of array " + i + 1);
            num1[i] = userInput.nextInt();
        }
        userInput.close();
        System.out.println("Your Arrays are ");
        for (int i = 0; i < num1.length; i++) {
            System.out.println(num1[i]);
        }


        System.out.println("\nnow I will Reverse Array ");
        for (int i = num1.length - 1; i >= 0; i--) {
            System.out.println(num1[i]);

        }
    }

    public static void main(String[] args) {
        reverse();
    }


}
