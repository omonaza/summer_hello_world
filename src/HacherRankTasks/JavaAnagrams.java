package HacherRankTasks;

import java.util.Arrays;
import java.util.Scanner;

public class JavaAnagrams {
    static boolean isAnagram(String a, String b) {
//        boolean result = false;
//      if (a.length()!=b.length()){
//          result = false;
//      }else {
//          result=true;
//      }
//
//      a = a.toLowerCase();
//      b = b.toLowerCase();
//
//
//      int [] char_frequencies = new int[26];
//
//      for (int i = 0; i <a.length();i++){
//          char current_char = a.charAt(i);
//          int index = current_char-'a';
//          char_frequencies[index]++;
//      }
//
//      for (int i=0; i <b.length();i++){
//          char current_char = b.charAt(i);
//          int index = current_char-'a';
//          char_frequencies[index]--;
//      }
//
//      for (int i =0; i <26;i++){
//          if(char_frequencies[i]!=0){
//              result = false;
//          }
//      }
//
//
//
//
//    return result;


        a =a.replace(" ","").toLowerCase();
        b= b.replace(" ","").toLowerCase();

        char [] c = a.toCharArray();
        char [] d = b.toCharArray();
        Arrays.sort(c);
        Arrays.sort(d);
        boolean result = false;

        if(Arrays.equals(c,d)){
            result = true;
        }else {
            result = false;
        }
         return result;
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}
