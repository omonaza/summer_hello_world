package HomeWork3;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class MapHashMapEmployeeSalary {

    public static void main(String[] args) {
        //Below Line will create HashMap with initial size 10 and 0.5 load factor

        Map<String, Integer> empSal = new HashMap<String, Integer>(10, 0.5f);

        //Adding employee name and salary to map

        empSal.put("Ramesh", 10000);

        empSal.put("Suresh", 20000);

        empSal.put("Mahesh", 30000);

        empSal.put("Naresh", 1000);

        empSal.put("Nainesh",15000);

        empSal.put("Rakesh", 10000);



        // Duplicate Value also allowed but Keys should not be duplicate

       //Value can be null as well

       // Printing full Map

        System.out.println("Original map " +empSal.toString());
        //Adding new employee the Map to see ordering of object changes
        empSal.put("Doni",3500);
        //Removing one key-value pair
        empSal.remove("Nainesh",15000);
        System.out.println();
        System.out.println("updated map " +empSal.toString());
        System.out.println(empSal.values().toString());
        System.out.println(empSal.keySet().toString());



    }
}
