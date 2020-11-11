package javaPrograming;

import java.lang.reflect.Array;
import java.util.Arrays;

public class copyAllElementsOfOneArrayIntoAnotherArray {

    public static void main(String[] args) {
        int [] arr1 = {1,2,3,4,5};

        int [] arr2 = new int [arr1.length];

        for(int i =0; i <arr1.length; i++){
            arr2[i]=arr1[i];
        }


//        System.out.println("elements of arr 1 " + Arrays.toString(arr1));
//        System.out.println("elements of arr 2 " + Arrays.toString(arr2));

        System.out.println("elements of arr 1");
        for(int i =0; i < arr1.length; i++){
            System.out.print(arr1[i] + " ");
        }
        System.out.println();

        System.out.println("elements of arr 2");
        for(int i =0; i < arr2.length; i++){
            System.out.print(arr2[i] + " ");
        }

    }
}
