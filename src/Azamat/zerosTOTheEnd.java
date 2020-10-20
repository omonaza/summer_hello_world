package Azamat;

import java.util.Arrays;

public class zerosTOTheEnd {
//    Given Array of integers in parameter, which include digits.
//    And the Task return array where all zeros will be on the right side.
//    For Example:
//    given: [9,0,3,4,0,0,1]
//            return: [9,3,4,1,0,0,0] (And it is not sorted, make the task without sort)
    public static int [] zerosToRight(int [] num){
       int [] result = new int[num.length];
       int index = 0;
        for(int i = 0; i < num.length; i++){
            if(num[i]!= 0){
                result[index++]=num[i];
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int [] result = {9,0,3,4,0,0,1};
        System.out.println(Arrays.toString(zerosToRight(result)));
    }
}
