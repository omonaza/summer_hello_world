package HomeWork3;

import java.util.Scanner;

public class CommonElementsInArray {
    public static void commonElements(int [] array, int[]array2){
        Scanner userInput = new Scanner(System.in);
        System.out.println("Please enter the size of Array");
        int size = userInput.nextInt();
        array=new int[size];

        for (int i = 0; i < size; i ++){
            System.out.println("please Enter the value of Array");
            array[i]=userInput.nextInt();
        }

        System.out.println("Please Enter the size of second Array");
        int size2 = userInput.nextInt();
        array2=new int[size2];

        for (int i = 0; i <size2;i++){
            System.out.println("Please Enter the value of second Array");
            array2[i]=userInput.nextInt();
        }
        for(int i = 0; i < array.length;i++){
            for (int j = 0 ; j < array2.length;j++){
                if(array[i]==array2[j]){
                    System.out.println("the common element is " +array[i]);
                }
            }
        }
    }

    public static void main(String[] args) {
        int [] array = {};
        int [] array2 = {};
        commonElements(array,array2);
    }
}
