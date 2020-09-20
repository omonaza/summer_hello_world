package HomeWork3;

import java.util.Scanner;

public class PrintArrayInStarsArray {
    public static void PrintStars(int[] num) {
        Scanner userInput =  new Scanner(System.in);
        System.out.println("Please enter the size of Array");
        int size = userInput.nextInt();
        num = new int[size];

        for (int index = 0; index < size; index++) {
            System.out.println("please enter the value of Array");
            num[index] = userInput.nextInt();
        }
        for (int i = 0; i < i; i++) {
            for (int j = 0; j < num[i]; j++) {
                System.out.print("*");
            }
            System.out.println();



        }

    }

    public static void main(String[] args) {
        int[] num = {};
        PrintStars(num);

    }

}
