package Practice.OlgaMentoring;

import java.util.Arrays;

public class ZerosAtTheEnd {
    public static int[] zerosAtTheEnd(int [] num) {
        int [] result = new int[num.length];
        System.out.println(result.length); // same size as a given array ;
        System.out.println(Arrays.toString(result));
        int index = 0; // new counter of indexes of the new created array.
        for (int i = 0; i <num.length; i ++){  // 0
            if (num[i]!=0 ){
                result[index++] = num[i];    // 3 ,1 , 5, 3, 2;

            }
        } return result;
    }
    // given an array 0s and numbers , we have to return array , with the numbers at the same order from the given array
    // but move all 0s to the end .
    // ex: given array 3 , 0 ,1, 5, 0 , 0,3 , 2.

    public static void main(String[] args) {
        int [] array = { 3 , 0 ,1, 5, 0 , 0,3 , 2};
        System.out.println(Arrays.toString(zerosAtTheEnd(array)));

    }
}
