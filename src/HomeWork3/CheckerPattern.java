package HomeWork3;

import java.util.Scanner;

public class CheckerPattern {
    public static void pattern(int size) {
        for (int row = 1; row <= size; row++) {
            for (int col = 1; col <= size; col++) {
                if ((row % 2) == 0) {
                    System.out.print(" ");
                }
                System.out.print("# ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.println("Please enter the size");
        int size = userInput.nextInt();
        pattern(size);
    }
}
