package Azamat;

import java.util.Arrays;

public class sumOf2 {
    public static void main(String[] args) {
        int [] arr = {-2,4,-6,7,5};
        int target = 8;


        System.out.println(Arrays.toString(findElementsOfTargetSum(arr,target)));



    }

    public static int[] findElementsOfTargetSum(int[] num, int targetSum){
        int [] result = new int[2];
        for(int i = 0; i < num.length;i++){
            //int secNum = targetSum - num[i];
            for(int j = i+1; j < num.length; j ++){
                if(num[i]+ num[j]==targetSum) {
                    result[0] = num[i];
                    result[1] = num[j];
                    return result;
                }
            }
        }
        return new int[0];
    }
    public static int[] findElementsOfTargetSum1(int[] num, int targetSum){
//        int [] arr = {1,7,5,3,5,9};
//        int target = 10;
        // {1, 3, 5, 5, 7, 9}

        int [] result = new int[2];
        Arrays.sort(num);
        for(int i = 0; i< num.length; i++){
            if(num[i] + num[i+1]==targetSum){
                result[0]=num[i];
                result[1]=num[i+1];
                return result;
            }
        }


        return new int[0];
    }
}
