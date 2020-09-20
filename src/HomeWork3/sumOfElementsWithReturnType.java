package HomeWork3;

import java.util.Arrays;
import java.util.Scanner;

public class sumOfElementsWithReturnType {
    public static int sumOfElements(int[] array) {
        Scanner userInput = new Scanner(System.in);
        System.out.println("Please Enter the size of Array");
        int size = userInput.nextInt();
        array = new int[size];

        for (int i = 0; i < size; i++) {
            System.out.println("Please enter the values of Array");
            array[i] = userInput.nextInt();
        }

        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];

        }
        return sum;

    }

    public static void main(String[] args) {
        int[] array = {};

        System.out.println(sumOfElements(array));

    }

}
