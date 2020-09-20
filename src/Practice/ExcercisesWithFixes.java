package Practice;

import java.util.ArrayList;

public class ExcercisesWithFixes {


    public static int sumNegValues(ArrayList<Integer> list) {
        int sum = 0;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) < 0)
                sum += list.get(i);
        }

       /*for (Integer element: list) {
           if (element < 0)
               sum +=element;
       }*/


        return sum;
    }

    public static void removeLongStrings(ArrayList<String> list) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).length() > 4)
                list.remove(i);
        }
    }
    public static void shiftLeftOne(ArrayList<Integer> list)
    {
        Integer firstElement = list.remove(0);
        list.add(firstElement);
    }

    public static ArrayList reverse(ArrayList<Integer> list)
    {
        ArrayList<Integer> reversed = new ArrayList<Integer>();
        for (Integer element : list) {
            reversed.add(0, element);
            System.out.println(reversed.toString());
        }
        return reversed;
    }


    public static void printEvenIndex(ArrayList list)
    {
        for (int i = 0; i < list.size(); i++)
        {
            if (i % 2 == 0)
            {
                System.out.print(list.get(i) + ", ");
            }
        }
    }




    public static void printEvenElements(ArrayList<Integer> list)
    {
        for (int i = 0; i < list.size(); i++)
        {
            if (list.get(i) % 2 == 0)
            {
                System.out.print(list.get(i) + ", ");
            }
        }
    }



    public static void main(String[] args) {
        //instantiate ArrayList and fill with Integers
        ArrayList<Integer> values1 = new ArrayList<Integer>();
        int[] nums = {-2, 34, -11, 9, -6, 3};
        for (int i = 0; i < nums.length; i++) {
            values1.add(nums[i]);
        }
        System.out.println("Expected Result:\t -19");
        System.out.print("Your Result:\t\t ");
        System.out.println(sumNegValues(values1));


        //instantiate ArrayList and fill with Integers
        ArrayList<String> values = new ArrayList<String>();
        String[] words = {"bathtub", "fish", "computer", "cat", "foo"};
        for (int i = 0; i < words.length; i++) {
            values.add(words[i]);
        }
        removeLongStrings(values);
        System.out.println("Expected Result:\t [fish, cat, foo]");
        System.out.println("Your Result:\t\t " + values);


        //instantiate ArrayList and fill with Integers
        ArrayList<Integer> values2 = new ArrayList<Integer>();
        int[] nums2 = {1, 2, 3, 4, 5};
        for (int i = 0; i < nums2.length; i ++)
        {
            values2.add(nums2[i]);
        }
        System.out.println(values2.toString());
        shiftLeftOne(values2);
        System.out.println(values2.toString());
        shiftLeftOne(values2);
        System.out.println(values2.toString());
        shiftLeftOne(values2);
        System.out.println(values2.toString());
        //System.out.println("Expected Result:\t [2, 3, 4, 5, 1]");

        System.out.println("Your Result:\t\t " + values2);



        //instantiate ArrayList and fill with Integers
        ArrayList<Integer> values4 = new ArrayList<Integer>();
        int[] nums4 = {1, 5, 7, 9, -2, 3, 2};
        for (int i = 0; i < nums4.length; i ++)
        {
            values4.add(nums4[i]);
        }
        ArrayList<Integer> result = reverse(values4);
        System.out.println("Expected Result:\t [2, 3, -2, 9, 7, 5, 1]");
        System.out.println("Your Result:\t\t " + result);




        //instantiate ArrayList and fill with Integers
        ArrayList<Integer> values6 = new ArrayList<Integer>();
        int[] nums6 = {1, 5, 7, 9, -2, 3, 2};
        for (int i = 0; i < nums6.length; i ++)
        {
            values6.add(nums6[i]);
        }
        System.out.println("Expected Result:\t 1, 7, -2, 2,");
        System.out.print("Your Result:\t\t ");
        printEvenIndex(values6);






        //instantiate ArrayList and fill with Integers
        ArrayList<Integer> values7 = new ArrayList<Integer>();
        int[] nums7 = {1, 44, 7, 9, -16, 3, 2};
        for (int i = 0; i < nums7.length; i ++)
        {
            values7.add(nums7[i]);
        }
        System.out.println("Expected Result:\t 44, -16, 2,");
        System.out.println("Your Result:\t\t ");
        printEvenElements(values7);



    }
}
