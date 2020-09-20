package sessions.arrays;
import java .util.Random;
public class sortingOutArrays {

    public void swap(int[] array, int srcIndex, int destIndex){
        int temp = array[srcIndex];    // array [srcIndex] is free now;
        array[srcIndex] = array[destIndex]; //
        array[destIndex] = temp;
    }



    public void printIntArray(int[] numberArray){
        for (int i = 0; i < numberArray.length; i++){
            System.out.println("["+i+ "]  = "+numberArray[i]);
        }
    }

    // Write a Java program to insert 0 into some specific value
    public void overwrite(int[] array, int element){
        for(int i = 0; i < array.length; i++){
            if(array[i] == element){
                array[i] = 0;
            }
        }
    }

    //Write a Java program to shuffle a given array of integers. [1,2,3,4] -> [2,1,4,3]
    public void shuffle(int[] array){
        Random random= new Random();
        for(int i = 0; i < array.length; i++){
            int a = random.nextInt(array.length);
            int b = random.nextInt(array.length);
            swap(array, a, b);
        }
    }

    public static void main(String[] args) {

        sortingOutArrays src = new sortingOutArrays();

        System.out.println("swapping arrays in order");
        int[] array = {1,2,3,5,4,10};
        src.swap(array,3,4);
        src.printIntArray(array);
        System.out.println("overwriting to zero ");
        src.overwrite(array,1);
        src.printIntArray(array);
        System.out.println("shuffling the array");
        src.shuffle(array);
        src.printIntArray(array);
    }
}
