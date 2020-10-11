package JiraProject;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Ev_42ModifyAndReturnTheGivenMap {

    public static Map<String, String> mapBully(Map<String, String> map) {
        if(map.containsKey("a")){
            map.put("b",map.get("a"));
            map.put("a","");
        } return map;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter the size of map,only numbers");
        int size = in.nextInt();
        HashMap<String, String> hmap = new HashMap<>(size);
        for (int i = 0; i < size; i++) {
            System.out.println("Please enter the key and Value of map");
            String a = in.next();
            String b = in.next();

            hmap.put(a, b);
        }

            System.out.println(mapBully(hmap));

    }
    }

