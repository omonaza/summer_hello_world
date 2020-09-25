package Azamat;
import java.util.Arrays;
import java.util.Scanner;
public class BaktygulFindMaxAndMinInArray {

    public static void main(String[] args){
        //From an array of numbers find the smallest and the biggest integers and extract them to a new array.Note: Numbers must be in random order.  Numbers in Array also can or should contain negatives such as -1 or 0.
        BaktygulFindMaxAndMinInArray findTheLargestAndSmallest = new BaktygulFindMaxAndMinInArray();
        Scanner userInput = new Scanner(System.in);
        System.out.println("Please Enter arrays size");
       // String regex = "\"[a-zA-Z]\"";
        int size = userInput.nextInt();

        int[] numbers = new int[size];

        for (int i = 0; i < size; i++) {
            System.out.println("please enter the values");
            numbers[i] = userInput.nextInt();
        }
        System.out.println(Arrays.toString(numbers));

        System.out.println("The smallest int is: " + findTheLargestAndSmallest.findTheSmallest(numbers));
        System.out.println("The largest int is: " + findTheLargestAndSmallest.findTheLargest(numbers));

        int[] numbers1 = new int[2];

        numbers1[0] = findTheLargestAndSmallest.findTheSmallest(numbers);
        numbers1[1] = findTheLargestAndSmallest.findTheLargest(numbers);
        System.out.println(Arrays.toString(numbers1));
    }

    public int findTheSmallest(int[] numbers) {
        int min = numbers[0];
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] < min) {
                min = numbers[i];
            }
        }
        return min;
    }

    public int findTheLargest(int[] numbers) {
        int max = numbers[0];
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }
        return max;
    }


}