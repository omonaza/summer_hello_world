package sessions.arrays;

import java.util.Scanner;

public class ArrayHistogram {
    //1. Read inputs from the user and store it in the array
    //2. Get each element and print stars till the element size;
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.println("Please enter the size of array");
       int n = userInput.nextInt();
        int [] array = new int[n];

        for (int i = 0; i < n ; i ++){
            System.out.println("Please enter the values in array");
            array[i]=userInput.nextInt(); // 123
        }
        for ( int i = 0; i < n; i ++){
            for (int j = 0; j < array[i]; j ++){
                System.out.print("*");      // **
            }                               //**
            System.out.println();
        }

    }
}
