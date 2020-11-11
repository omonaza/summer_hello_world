package javaPrograming;

import java.util.HashMap;
import java.util.Map;

public class Frequency {
    public static void main(String[] args) {
        //Initialize array
        int [] arr = new int [] {1, 2, 8, 3, 2, 2, 2, 5, 1};
       // frequency(arr);




        String str = "apple";
        int count = 0;
        for(int i = 0; i < str.length(); i++){
            if(str.charAt(i)=='a'){
                count++;
            }
        }
        System.out.println("a  has occurred" +count);


        System.out.println(charOccurrencesMap(str));




    }
    public static Map<Character,Integer> charOccurrencesMap(String str){

        Map<Character,Integer> charOccurrences = new HashMap<>();
        for(int i =0; i < str.length();i++){
            if(!charOccurrences.containsKey(str.charAt(i))){
                charOccurrences.put(str.charAt(i),1);
            }else {
                int numOfOccurrences = charOccurrences.get(str.charAt(i));
                charOccurrences.put(str.charAt(i),numOfOccurrences+1);
            }
        }
        return charOccurrences;

    }


    public static void  frequency(int[] arr){
        //Array fr will store frequencies of element
        int [] frequency = new int[arr.length];
        int visited =-1;
        for(int i = 0; i < arr.length;i++){
            int count = 1;
            for(int j = i +1; j < arr.length;j++){
                if(arr[i]==arr[j]){
                    count++;
                    //To avoid counting same element again

                   frequency[j]=visited;
                }

            }
            if(frequency[i]!=visited){
                frequency[i]=count;
            }

        }

        //Displays the frequency of each element present in array
        System.out.println("---------------------------------------");
        System.out.println(" Element | Frequency");
        System.out.println("---------------------------------------");
        for(int i = 0; i <frequency.length;i++){
            if(frequency[i]!=visited){
                System.out.println("    " + arr[i] + "    |    " + frequency[i]);
            }

        }
        System.out.println("----------------------------------------");

    }
}
