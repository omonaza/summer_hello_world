package Azamat;

import java.util.ArrayList;

public class Task7 {
//    Task 7
//    Given two parameters, first is String sentence and second String letter.
//    Find the longest distance between two the same letters from parameter.
//    If parameter letter in the sentence only one or zero than return -1.
//    Do not count spaces in the sentence.
//            Example 1:
//    String sentence = “we come hero to eat”;
//    String letter = “e”;
//    Result: 5 (edited)
//            1:36
//    Example 2:
//    String sentence = “understand the sentence”;
//    String letter = “e”;
//    Result: 9
//            1:36
//    Example 3:
//    String sentence = “nature”;
//    String letter = “b”;
//    Result: -1

    public static int longestDistance(String str, String a){
//        int  result = 0;
//        for(int i =0; i < sen.length();i++){
//            for(int j = 0; j < letter.length();j++)
//            if(sen.substring(i).equalsIgnoreCase(letter.substring(j))){
//                result++;
//            }else {
//                result = -1;
//            }
//        }
//
//


      //  str = "";
      //  a = "";
//        str = str.trim().replaceAll("\\s", "");
//        char[] chArray = str.toCharArray();
//        ArrayList<Integer> inArray = new ArrayList<>();
//
//        for(int i =0;i<chArray.length;i++) {
//            if(chArray[i] == a.charAt(0) ) {
//                inArray.add(i+1);
//            }
//        }
//
//        return inArray.get(inArray.size()-1)-inArray.get(0); // 24


//
        int dist = 0;
//        for(int i = 0; i < str.length();i++){
//            if(str.trim().charAt(i)==a.charAt(0)){
//                dist = str.indexOf(i);
//            }else {
//                dist = -1;
//            }
//        }
//
//        int dist2 = 0;
//        for(int i = str.length()-1; i > 0 ; i --){
//            if(str.trim().charAt(i)==a.charAt(0));
//                dist2 = str.indexOf(i);
////            }else {
//                dist2 = -1;
//            }
//
//
//        int result = dist + dist2;
//
//
//        char dis [] = str.toCharArray();
//        char dist2 [] = a.toCharArray();
//        int d = 0;
//        int a1 = 0;
//
//        for(int i = 0; i < dis.length;i++){
//           if(dis[i]==dist2[0]){
//               d = dis[i];
//           }
//        }
//
//        for(int i = dis.length-1; i > 0 ; i --){
//            if(dis[i]==dist2[0]){
//                a1 = dis[i];
//            }
//        }
//        return d + a1;
           int index = 0;
           int first = 0;

            first = str.trim().indexOf(a);
            index = str.trim().lastIndexOf(a);
          //  String result = str.subSequence(first,index);


        return -1;
    }

    public static void main(String[] args) {



        String sen = "understand the sentence";
        String l = "e";
        System.out.println(longestDistance(sen,l));
        System.out.println(sen.indexOf(l));
        System.out.println(sen.lastIndexOf(l));
        String a =  sen.trim();
        System.out.println(a.trim().codePointCount(a.indexOf(l),a.lastIndexOf(l)));


    }





}
