package Azamat;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class markLength4 {
    public static void main(String[] args) {

        LinkedList<String> original = new LinkedList<>(Arrays.asList("this","is","a lot", "of fun","for","every","Java","programmer","azam"));
       // System.out.println(length4(original));

        List<String> original1 = new ArrayList<>(Arrays.asList("this","is","a lot", "of fun","for","every","Java","programmer","azam"));
        System.out.println(length4WithList(original1));

    }

    public static LinkedList<String> length4(LinkedList<String> original){
        LinkedList<String> list =  new LinkedList<>();
        for (String str: original) {
            if(str.length()==4){
                list.add("****");
            }
            list.add(str);
        }

        return list;
    }

    public static List<String> length4WithList(List<String> original){
        for (int i = 0; i < original.size(); i++) {
            if(original.get(i).length()==4){
                original.add(i,"****");
                i++;
            }

        }

        return original;
    }
}
