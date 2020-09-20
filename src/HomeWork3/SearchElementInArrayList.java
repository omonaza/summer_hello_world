package HomeWork3;

import java.util.ArrayList;

public class SearchElementInArrayList {
    public static void searchElement(ArrayList<String>list){

        for (int i =0;i <list.size();i++){
            if(list.get(i).contains("Red")){
                System.out.println(" found element "+list.get(i));
                break;
            }else {
                System.out.println("there is no such element");
                break;
            }
        }
    }
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Red");
        list.add("Green");
        list.add("orange");
        list.add("White");
        list.add("Black");

        searchElement(list);

    }

}
