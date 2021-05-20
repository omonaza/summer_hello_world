package Azamat;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class FindAllPeopleName {
    public static void main(String[] args) {
        List<String> names =
                Arrays.asList("Beflection Rio", "Collection", "AStream", "Ra","Collection");

        String str = "abcdadcgfrwacd";


        System.out.println(nameWhichEndsWithA(names));
        System.out.println(countDuplicates(names));
        System.out.println(findAllDupChars(str));

    }

    public static List<String> nameWhichEndsWithA(List<String> names){
        List<String> A_names = new ArrayList<>();
        for (int i = 0; i < names.size(); i++) {
            if(names.get(i).contains("A")){
                A_names.add(names.get(i));
            }
        }


        return A_names;
    }
    public static int countDuplicates(List<String> names){
        int count = 0;
        for(int i = 0; i < names.size(); i ++){
            for(int j = i +1; j < names.size(); j ++){
                if(names.get(i).equals(names.get(j))){
                    count++;

                }
            }
        }

        return count;
    }

    public static String findAllDupChars(String str){
        String dupes = "";
        for (int i = 0; i <str.length() ; i++) {
            for(int j = i +1; j < str.length(); j ++){
                if(str.charAt(i)==str.charAt(j)){
                    dupes +=str.charAt(i);
                    i++;
                }
            }
        }


        return dupes;
    }
}
