package Azamat;


import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class countDuplicates {

    public static int countDuplicate(List<Integer> numbers) {
       //  Write your code here
//        Collections.sort(numbers);
//        Integer result = 0;
//        for(int i = 0; i < numbers.size(); i++){
//            for(int j = i+1; j < numbers.size();j++){
//                if(numbers.get(i)==numbers.get(j))
//                    result++;
//                   ++i;
//            }
//        }
//        return result;


        HashSet<Integer> set = new HashSet<Integer>();
        HashSet<Integer> duplicateSet = new HashSet<Integer>();

        for(int i=0;i<numbers.size();i++){
            if(set.contains(numbers.get(i))){
                duplicateSet.add(numbers.get(i));
            }else{
                set.add(numbers.get(i));
            }
        }

        return duplicateSet.size();
    }


                public static void main (String[]args) throws IOException {
                    //1+1+3
                    List<Integer> numbers = new ArrayList<>(Arrays.asList(1, 3, 3, 3, 3, 3, 4, 4, 4, 4, 4, 4, 1, 3, 1, 4, 3, 1, 4, 3, 1, 4, 5, 6));

                    System.out.println(countDuplicate(numbers));
                }
            }



