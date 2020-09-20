package HomeWork3;

import java.util.ArrayList;

public class CompareTwoArrayLists1 {
    public static ArrayList<String> compareArrayList(ArrayList<String> list1, ArrayList<String> list2) {
        ArrayList<String> result = new ArrayList<>();

        for (int i = 0; i < list1.size(); i++) {
            for (int j = i; j < list2.size(); j++) {
                if (list1.get(i).contains(list2.get(j))) {
                    result.add("Yes");
                    break;


                } else {
                    result.add("No");
                    break;


                }
            }

        }

        return result;

    }

    public static void main(String[] args) {
        ArrayList<String> list1 = new ArrayList<>();
        ArrayList<String> list2 = new ArrayList<>();
        list1.add("red");
        list1.add("green");
        list1.add("white");
        list1.add("pink");
        list1.add("black");

        list2.add("red");
        list2.add("green");
        list2.add("white");
        list2.add("pink");



        System.out.println(compareArrayList(list1, list2));


    }
}
