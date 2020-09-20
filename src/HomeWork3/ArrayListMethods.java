package HomeWork3;

import java.util.ArrayList;
import java.util.List;

public class ArrayListMethods {

    public static void main(String[] args) {

        List<String> names = new ArrayList<>();

        names.add("Jane");
        names.add(0, "Thomas");
        names.add(1, "Robin");
        names.add("David");
        names.add("Becky");

        System.out.println(names);
        System.out.println(names.isEmpty());
        System.out.println(names.containsAll(names));
        System.out.println(names.contains(names));
        System.out.println(names.indexOf("Jane"));
        names.subList(1,4);
        System.out.println(names);
        names.removeAll(names);
        System.out.println(names.isEmpty());
        names.size();
        System.out.println(names);

    }
}