package HomeWork3;

import java.util.ArrayList;
import java.util.Arrays;

public class ReplaceSecondElementArrayList {
    public static void main(String[] args) {

        ArrayList<String>color = new ArrayList<>();
        color.add("Red");
        color.add("Green");
        System.out.println("Original color list: " +color);
        String newColor = "White";
        color.set(1,newColor);
        int num = color.size();
        System.out.println("Replace the second element with white");
        int i = 0;
        while (i<num){
            System.out.println(color.get(i));
            i++;
        }



    }

}
