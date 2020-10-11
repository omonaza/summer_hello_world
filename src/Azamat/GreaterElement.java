package Azamat;

import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class GreaterElement {
    public static int greaterElement(List<Integer> arr) {
        sort(arr);
        arr.set(0,1);
        for(int i = 0; i <arr.size()-1;i++){

            int diff = arr.get(i+1)-arr.get(i);

            if(diff>1){
                arr.set(i+1,arr.get(i)+1);
            }
        }

        return -1;
    }

    public static void sort(List<Integer> arr) {
        for(int i = 0; i <arr.size();i++){
            for(int j = 0; j < arr.size();j++){
                if(arr.get(i)>arr.get(j)){
                    swap(arr,i,j);
                }
            }
        }

    }

    public static int swap (List<Integer>arr,int searchIndex,int destIndex){
        int temp = arr.get(searchIndex);
        arr.set(searchIndex,destIndex);
        arr.set(destIndex,temp);

        return temp;
    }
}