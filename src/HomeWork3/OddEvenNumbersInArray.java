package HomeWork3;

import java.util.Arrays;

public class OddEvenNumbersInArray {
    public static void evenOdd (int [] array){

        System.out.println("the Even numbers are ");
        for (int i = 0; i<array.length;i++){
            if(array[i]% 2 == 0 ){
                System.out.println(array[i]);
            }
        }
        System.out.println("the odd numbers are: ");
        for(int i = 0; i <array.length;i++){
            if(array[i]%2!=0){
                System.out.println(array[i]);
            }
        }
    }

    public static void main(String[] args) {
        int [] array = {10,11,12,13,14};
        evenOdd(array);
    }
}
