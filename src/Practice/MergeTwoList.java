package Practice;

import java.util.ArrayList;

public class MergeTwoList {
    public static ArrayList<Integer> joinLists(ArrayList<Integer> list1, ArrayList<Integer> list2){
       list1.addAll(list2);
      return list1;

    }
}
