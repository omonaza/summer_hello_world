package Practice;

import java.util.ArrayList;

public class ArrayListCloneMergeDifferentCommon {
    public static Boolean addIfNotExists(ArrayList<Integer> list, Integer element) {
        if (!list.contains(element)) {
            list.add(element);
            return true;
        } else {
            return false;
        }
    }

    // clone Array list with method
    public static ArrayList<Integer> cloneTheListByClone(ArrayList<Integer> list) {

        return (ArrayList<Integer>) list.clone();
    }

    // clone Arraylist with for loop
    public static ArrayList<Integer> cloneTheList(ArrayList<Integer> list) {
        ArrayList<Integer> destList = new ArrayList<>();
        for (Integer element : list)
            destList.add(element);

        return destList;
    }

    public static ArrayList<Integer> commonElementsWithCOntains(ArrayList<Integer> list1, ArrayList<Integer> list2) {
        ArrayList<Integer> commonList = new ArrayList<>();
        for (Integer element1 : list1) {
            if (list2.contains(element1))
                addIfNotExists(commonList, element1);
        }
        return commonList;
    }

    public static ArrayList<Integer> commonElements(ArrayList<Integer> list1, ArrayList<Integer> list2) {
        ArrayList<Integer> commonList = new ArrayList<>();
        for (Integer element1 : list1) {
            for (Integer element2 : list2) {
                if (element1.equals(element2)) {
                    addIfNotExists(commonList, element1);
                }
            }
        }
        return commonList;
    }


    public static ArrayList<Integer> mergeLists(ArrayList<Integer> list1, ArrayList<Integer> list2) {
        ArrayList<Integer> mergedList = new ArrayList<>();
        mergedList.addAll(list1);
        mergedList.addAll(list2);
        /*
        for (Integer element: list2)
            list1.add(element);
        */
        return mergedList;
    }

    public static ArrayList<Integer> diffElementsWithCOntains(ArrayList<Integer> list1, ArrayList<Integer> list2) {
        ArrayList<Integer> commonList = new ArrayList<>();
        for (Integer element1 : list1) {
            if (!list2.contains(element1))
                addIfNotExists(commonList, element1);
        }

        for (Integer element2 : list2) {
            if (!list1.contains(element2))
                addIfNotExists(commonList, element2);
        }

        return commonList;
    }


    public static void main(String[] args) {

        ArrayList<Integer> list1 = new ArrayList<>();
        addIfNotExists(list1, 1);
        addIfNotExists(list1, 2);
        addIfNotExists(list1, 3);
        addIfNotExists(list1, 1);
        addIfNotExists(list1, 3);

        System.out.println(list1.toString());

        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(10);
        list2.add(3);
        list2.add(3);
        list2.add(2);
        list2.add(100);

        System.out.println(list2.toString());

        ArrayList<Integer> list3 = commonElementsWithCOntains(list1, list2);
        ArrayList<Integer> list4 = diffElementsWithCOntains(list1, list2);

        System.out.println("The common elements are " + list3.toString());
        System.out.println("The diff elements are " + list4.toString());

        ArrayList<Integer> list5 = mergeLists(list1, list2);
        System.out.println("list1 and list3 merged into " + list5.toString());

        ArrayList<Integer> list6 = cloneTheList(list1);
        ArrayList<Integer> list7 = cloneTheListByClone(list1);
        System.out.println("list1 cloned into " + list6.toString());
        System.out.println("list1 cloned by clone " + list7.toString());
    }
}
