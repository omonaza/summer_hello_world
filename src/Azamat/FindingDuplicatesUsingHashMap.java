package Azamat;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class FindingDuplicatesUsingHashMap {
    public static void main(String[] args) {
        List<Integer> num = new ArrayList<>(Arrays.asList(23, 45, 7, 5, 4, 23, 4,45));
        System.out.println(hashMapDuplicates(num));

    }


    public static List<Integer> hashMapDuplicates(List<Integer> numbers) {
        HashMap<Integer, Integer> map = new HashMap<>();
        List<Integer> num = new ArrayList<>();
        for (int i = 0; i< numbers.size() ; i++) {
            if (map.containsValue(numbers.get(i))){
                num.add(numbers.get(i));
            }else {
                map.put(i,numbers.get(i));
            }

        }


       return num;
    }
}
