package Practice;

import java.util.ArrayList;

public class Test3 {
    public static void shiftLeftOne(ArrayList<Integer> list)
    {
      Integer firstElement = list.remove(0);
      list.add(firstElement);
        }

        //code here

    public static void main(String[] args)
    {
        //instantiate ArrayList and fill with Integers
        ArrayList<Integer> values = new ArrayList<Integer>();
        int[] nums = {1, 2, 3, 4, 5};
        for (int i = 0; i < nums.length; i ++)
        {
            values.add(nums[i]);
        }
        shiftLeftOne(values);
        System.out.println("Expected Result:\t [2, 3, 4, 5, 1]");
        System.out.println("Your Result:\t\t " + values);
    }
}
