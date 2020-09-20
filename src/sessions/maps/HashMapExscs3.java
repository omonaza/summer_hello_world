package sessions.maps;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapExscs3 {

    public static void main(String[] args) {
        HashMap<Integer, String> studentsMap = new HashMap<>();
        studentsMap.put(1, "Student1");
        studentsMap.put(2, "Student2");
        studentsMap.put(3, "Student3");

        System.out.println("The values map :" + studentsMap.values().toString());
        System.out.println();


        HashMap<Integer, String> studentsMap2 = new HashMap<>();

        studentsMap2.put(11, "Student11");
        studentsMap2.put(22, "Student22");
        studentsMap2.put(33, "Student33");

        Set<Map.Entry<Integer, String>> entrySet = studentsMap.entrySet();
        System.out.println("Proof1 : update (set -> map)");
        for(Map.Entry<Integer,String> entry:entrySet){
            System.out.println(entry.getKey() + " " +entry.getValue());

            if(entry.getKey().equals(1)){
                System.out.println("I am updating set entry with the key "+ entry.getKey());
                entry.setValue("StudentN1");
            }
        }
        System.out.println("After the update , set values");
        for (Map.Entry<Integer,String> entry: entrySet){
            System.out.println(entry.getKey()+ " " + entry.getValue());
        }
        System.out.println("The values map updated :" + studentsMap.values().toString());

        System.out.println("proof N2: (map -> set)I am updating map, and not touching the set");
        studentsMap.put(2,"StudentN2");
        System.out.println();


        System.out.println("The values map :" + studentsMap.values().toString());

        System.out.println("After the update , set values");
        for (Map.Entry<Integer, String> entry: entrySet){
            System.out.println(entry.getKey()+ " " + entry.getValue());
        }

        studentsMap.putAll(studentsMap2);
        System.out.println("After the putAll");
        System.out.println(" values "+ studentsMap.toString());


    }
}
