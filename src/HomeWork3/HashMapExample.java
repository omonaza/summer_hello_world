package HomeWork3;

import com.sun.javafx.collections.MappingChange;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapExample {
    public static void main(String[] args) {

        Map<String, String> domains = new HashMap<>();

        domains.put("de", "Germany");
        domains.put("sk", "Slovakia");
        domains.put("us", "United States");
        domains.put("ru", "Russia");
        domains.put("hu", "Hungary");
        domains.put("pl", "Poland");
        domains.put("kgz", "Kyrgyzstan");
        domains.put("kz", "Kazakhstan");
        domains.put("uz", "Uzbekistan");

//     for(String s : domains.keySet()){
//         System.out.println(s);
//     }
        System.out.println("All countries");
        Set<Map.Entry<String,String>> mapEntry = domains.entrySet();
        for(Map.Entry<String,String> entry : mapEntry){
            System.out.println(entry.getKey() + " " +entry.getValue());
        }
        System.out.println();
        System.out.println("Central Asian Countries only ");

        Set<Map.Entry<String,String>> mapEntry1 = domains.entrySet();
        for(Map.Entry<String,String> entry : mapEntry1){
             if(entry.getKey().equals("kgz") || entry.getKey().equals("kz") || entry.getKey().equals("uz"))
            System.out.println(entry.getKey() + " " +entry.getValue());
        }


           domains.replace("usa" ,"United States Of America");
           domains.put("uae" ,"United Arab  Emirates");

        System.out.println();
        System.out.println("All countries");
        Set<Map.Entry<String,String>> mapEntry3 = domains.entrySet();
        for(Map.Entry<String,String> entry : mapEntry3){
            System.out.println(entry.getKey() + " " +entry.getValue());
        }


    }
}