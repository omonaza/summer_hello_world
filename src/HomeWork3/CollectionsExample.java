package HomeWork3;

import java.util.*;

public class CollectionsExample {

    public static void main(String[] args) {

        Integer[] nums = { 4, 3, 2, 4, 5, 6, 4, 2, 7, 8, 9, 0, 1 };

        List<Integer> ns = new ArrayList<>(Arrays.asList(nums));
        System.out.println("Default order:");
        System.out.println(ns);
        System.out.println();

        System.out.println("Ascending order:");
        Arrays.sort(nums);
        List<Integer> ns1 = new ArrayList<>(Arrays.asList(nums));
        System.out.println(ns1);
        System.out.println();


        System.out.println("Descending order:");
        Collections.reverse(ns1);
        System.out.println(ns1);
        System.out.println();

        System.out.println("Swapping the first and the last elements:");
//
//        Collections.swap(ns1,0,ns1.size()-1);
//        System.out.println(ns1);

        System.out.println(swapFirstLast(ns1) +"my method ");
        System.out.println();
        System.out.println("Replacing all 4s with 0s:");
        System.out.println(replaceFoursToZeros(ns1) + " method");

        System.out.println();
        System.out.println("Random order:");
        System.out.println(shuffling(ns1));


        System.out.println("Find the maximimum value of the collection");
        System.out.println(findMax(ns1));

        System.out.println("Find the minimum value of the collection");
        System.out.println(findMin(ns1));
    }

   public static List<Integer> swapFirstLast(List<Integer> nums){
        int temp = nums.get(0);
        nums.set(0,nums.get(nums.size()-1));
        nums.set(nums.size()-1,temp);


        return nums;
   }
 public static List<Integer> replaceFoursToZeros(List<Integer> nums){
      for (int i = 0; i < nums.size();i++){
          if(nums.get(i).equals(4)){
              nums.set(i,0);
          }
      }

        return nums;
 }

 public static List<Integer> shuffling (List<Integer> nums){
        Random rm = new Random();
   for (int i = 0; i <nums.size()*100; i ++) {
       int a = rm.nextInt(nums.size());
       int b = rm.nextInt(nums.size());
       swap(nums,a,b);

   }

     return nums;
 }
    public static void swap(List<Integer> array, int srcIndex, int destIndex){
        int temp = array.get(srcIndex);    // array [srcIndex] is free now;
        array.set(srcIndex, array.get(destIndex)); //
        array.set(destIndex, temp);
    }

    public static int findMax (List<Integer> nums){
        int max = 0;
        for (int i = 0; i <nums.size();i++){
            if(nums.get(i)> max){
                max = nums.get(i);
            }
        }


        return max;
    }

    public static int findMin (List<Integer>nums){
        int min = 0;
        for (int i = 0; i < nums.size();i++){
            if(nums.get(i)< min){
                min = nums.get(i);
            }
        }

        return min;
    }

}

