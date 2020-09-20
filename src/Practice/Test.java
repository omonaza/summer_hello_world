package Practice;

import java.util.ArrayList;

public class Test {                                 // this is the first solution
    public static void printEvenElements(ArrayList <Integer>list)
    {
        for (int i = 0; i < list.size(); i++)
        {      // we can do also explicit casting like (int) or with an Object (Integer)
            if (list.get(i)% 2 == 0)
            {
                System.out.print(list.get(i) + ", ");
            }
        }
    }
    public static void main(String[] args)
    {
        //instantiate ArrayList and fill with Integers
        ArrayList<Integer> values = new ArrayList<Integer>();
        int[] nums = {1, 44, 7, 9, -16, 3, 2};
        for (int i = 0; i < nums.length; i ++)
        {
            values.add(nums[i]);
        }
        System.out.println("Expected Result:\t 44, -16, 2,");
        System.out.print("Your Result:\t\t ");
        printEvenElements(values);
    }

}
