package HomeWork3;

import java.util.ArrayList;

public class compareTwoArraylis2 {

    public static void main(String[] args) {
        ArrayList<String> arr1 = new ArrayList<>();
        arr1.add("Red");
        arr1.add("Green");
        arr1.add("Black");
        arr1.add("White");
        arr1.add("Pink");
        ArrayList<String> arr2 = new ArrayList<>();
        arr2.add("Red");
        arr2.add("Green");
        arr2.add("Black");
        arr2.add("Pink");
        ArrayList<String> result = new ArrayList<>();
        for (String element1 : arr1) {
            if (arr2.contains(element1)) {
                result.add("yes ");
                continue;
            }
            if (!arr2.contains(element1)) {
                result.add("no ");
            }
        }
        System.out.println(result);
    }
}
