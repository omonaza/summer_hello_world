package HomeWork3;
import java.util.Arrays;
public class ArrayExample {
    public static void printArray(int[] array){
        for (int i =0; i <array.length;i++){
            System.out.println(array[i]);
        }
    }

    public static void main(String[] args) {
        int [] array = {1,2,3,4,5};
        printArray(array);
        System.out.println(Arrays.toString(array));
    }
}
