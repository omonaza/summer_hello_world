package Practice;

import java.util.Scanner;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class PractiseHashSet {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String s = scan.nextLine();

        Set<String> colors = new HashSet<>();
        colors.add("white");
        colors.add("red");
        colors.add("black");
        colors.add("brown");
        colors.add("blue");

        for (String element:colors){
            System.out.println(element);
        }
        int[] array = {1,2,2,3,5,6,7,3,7,8,10,10};
        Integer[] array1 = {1,2,2,3,5,6,7,3,7,8,10,10};
        Integer[] array2 = {1,100,2,200};

        System.out.println("The difference are " +Arrays.toString(findDifferentElements(array1,array2)));
        System.out.println("The common elements are " +Arrays.toString(findCommonElements(array1,array2)));
        System.out.println("The union elements are " +Arrays.toString(findUnionElements(array1,array2)));
        System.out.println("before removing the duplicates " +Arrays.toString((array)));
        System.out.println("The duplicates removed " +Arrays.toString(removeDuplicates(array)));


//        Assume that we have an array of numbers, write a method which receives an array
//        of integers and returns array with removed duplicates by using HashSets

      /*  Write a Java program to compare two arrays : all the methods accepts two arrays of Integer as an input, and return single Array of Integer
        1. method which returns difference of two arrays
        2. method which returns common elements of two arrays
        3. method which return union of elements of two arrays*/
    }
    public static Integer[] findDifferentElements (Integer[]arr1,Integer[]arr2){
        HashSet<Integer> set1 = new HashSet<>(Arrays.asList(arr1));
        HashSet<Integer> set2 = new HashSet<>(Arrays.asList(arr2));
        HashSet<Integer> tempSet = (HashSet<Integer>) set1.clone();
        set1.removeAll(set2);
        set2.removeAll(tempSet);
        set1.addAll(set2);
//        System.out.println("---"+set2.toString());
//        System.out.println("---"+set1.toString());

         return set1.toArray(new Integer[0]);
    }
    public static Integer[] findCommonElements(Integer[] arr1, Integer[] arr2){

        HashSet<Integer> set1 = new HashSet<>(Arrays.asList(arr1));
        HashSet<Integer> set2 = new HashSet<>(Arrays.asList(arr2));
        set1.retainAll(set2);

        return set1.toArray(new Integer[0]);
    }
    public static Integer[] findUnionElements(Integer[] arr1, Integer[] arr2){
        HashSet<Integer> set1 = new HashSet<>(Arrays.asList(arr1));
        HashSet<Integer> set2 = new HashSet<>(Arrays.asList(arr2));
        set1.addAll(set2);

        return set1.toArray(new Integer[set1.size()]);
    }

    public static String toStringMethod(Integer[] array){
        String result="[";
        for (Integer element: array)
            result += ", "+element;
        return result+"]";
    }

    public static int[] removeDuplicates(int[] arr){

        Set<Integer> noDupSet = new HashSet<>();

        for (int i = 0; i< arr.length; i++){
            noDupSet.add(arr[i]);
        }

        int[] finalArray = new int[noDupSet.size()];

        int counter = 0;
        for (Integer element: noDupSet){
            finalArray[counter++] = element;
        }

        return finalArray;
    }

    public static Integer[] removeDuplicatesUpdated(Integer[] arr){
        HashSet<Integer> noDupSet = new HashSet<>(Arrays.asList(arr));
        return noDupSet.toArray(new Integer[0]);
    }


        }



