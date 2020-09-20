package HomeWork3;

import java.util.Scanner;

public class TrianglePattern {
    public static void trianglePattern(int size ) {
        for (int i = 0 ; i < size; i ++){
            for (int j = 0; j < i; j ++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.println("Please Enter Number");
        int size = userInput.nextInt();
        trianglePattern(size);
    }
}
