package HomeWork3;

import java.util.Arrays;
import java.util.Scanner;

public class sumOfElementsOfArray {
    public static void sumOfElements(int [] array){
        int sum = 0;//1,3,5,9,
        for(int i = 0; i < array.length;i++){
            sum+=array[i];
        }
        System.out.println("sum of array values " +sum);
    }

    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.println("Please enter the size of Array");
        int size = userInput.nextInt();
        int [] array = new int[size];

        for(int i = 0; i < size;i++){
            System.out.println("Please Enter the values of Array");
            array[i]=userInput.nextInt();
        }
        System.out.println(Arrays.toString(array));
        sumOfElements(array);
    }
}
