package Practice;

import java.util.ArrayList;

public class Test1 {
    public static int sumNegValues(ArrayList<Integer> list) {
        int sumNeg = 0;
        for (int i = 0; i <list.size();i++){
            if(list.get(i)<0){
                sumNeg+=list.get(i);
            }
           /* for(Integer element:list){
                sumNeg+=element;
            }*/
        } return sumNeg;
        //code here
    }
    public static void main(String[] args)
    {
        //instantiate ArrayList and fill with Integers
        ArrayList<Integer> values = new ArrayList<Integer>();
        int[] nums = {-2, 34, -11, 9, -6, 3};
        for (int i = 0; i < nums.length; i ++)
        {
            values.add(nums[i]);
        }
        System.out.println("Expected Result:\t -19");
        System.out.print("Your Result:\t\t ");
        System.out.println(sumNegValues(values));
    }
}
