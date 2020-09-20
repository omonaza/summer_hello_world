package Practice;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class ListOfArray {
    public static void main(String[] args){
        ArrayList<Integer> list1= new ArrayList<>();
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
        System.out.println("The common elements are "+list3.toString());
    }
    public static ArrayList<Integer> commonElements(ArrayList<Integer> list1, ArrayList<Integer> list2){
        ArrayList<Integer> commonList = new ArrayList<>();
        for (Integer element1: list1){
            for (Integer element2: list2){
                if (element1.equals(element2)){
                    addIfNotExists(commonList, element1);
                }
            }
        }
        return commonList;
    }
    public static ArrayList<Integer> commonElementsWithCOntains(ArrayList<Integer> list1, ArrayList<Integer> list2){
        ArrayList<Integer> commonList = new ArrayList<>();



        for (Integer element1: list1) {
            if (list2.contains(element1))
                addIfNotExists(commonList, element1);
        }
        return commonList;
    }
    public static Boolean addIfNotExists(ArrayList<Integer> list, Integer element){
        if (!list.contains(element)) {
            list.add(element);
            return true;
        } else {
            return false;
        }
    }}
