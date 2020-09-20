package sessions.maps;

import com.sun.javafx.collections.MappingChange;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class SecondClassExercises {
 public static HashMap<String,Integer> evenOdd (Integer[]num){
     HashMap<String,Integer> result= new HashMap<>();
     result.put("Even",0);
     result.put("Odd",0);


//     int countEvenOdd =0;
//     int countOdd = 0;
     for(int i = 0; i < num.length;i++){
         if (num[i]%2==0){
             result.put("Even",result.get("Even") + 1);
         }else {
             result.put("Odd",result.get("Odd")+1);
         }

//        result.put("Even",countEvenOdd);
//         result.put("Odd",countOdd);
     }





     return result;
 }


    public static void main(String[] args) {
        HashMap<String,Integer>result = new HashMap<>();
        Integer [] num = {1,2,3,4,5,6};

        System.out.println(evenOdd(num));
    }

}
