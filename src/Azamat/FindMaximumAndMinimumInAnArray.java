package Azamat;

import java.util.Arrays;
import java.util.Scanner;

public class FindMaximumAndMinimumInAnArray {
    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);
        System.out.println("Please enter the size of an Array you are about to enter: ");
        int size = 0;
        boolean b1 = true;
        while (b1){
           String s = userInput.next();
            if (Character.isDigit(s.charAt(0))) {
                size = Integer.valueOf(s);
                b1 = false;
            }
                else {
                System.out.println("Please enter only integers");
            }
        }

        int[] userEnteredNumbers = new int[size];
        boolean b ;
        for (int i = 0; i < size; i++) {
            b = true;
            while (b) {
                System.out.println("Please enter an Array of numbers: ");
                String s = userInput.next();
                if(s.charAt(0)=='-'){
                    userEnteredNumbers[i]=Integer.parseInt(s);
                    b = false;
                }else{
                    System.out.println("Please enter integer only: ");
                }
                if (Character.isDigit(s.charAt(0))) {
                    userEnteredNumbers[i] = Integer.valueOf(s);
                    b = false;
                }
//                else {
//                    System.out.println("wrong data");

            }
        }
        System.out.println("Max is: " + findMax(userEnteredNumbers));
        System.out.println("Min is: " + findMin(userEnteredNumbers));
    }

    public static int findMax(int[] numbers) {

        int max = 0;
        Arrays.sort(numbers);
        max = numbers[numbers.length - 1];
        return max;
    }

    public static int findMin(int[] numbers) {

        int min = 0;
        Arrays.sort(numbers);
        min = numbers[0];
        return min;
    }

}
