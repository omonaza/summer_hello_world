package Azamat;

import java.util.Scanner;

public class findDuplicatesInString {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        System.out.println("Plz Enter Your String: ");
        String string1 = sc.nextLine();
        int count;

        //Converts given string into character array
        char string[] = string1.toCharArray();

        System.out.println("Duplicate characters in a given string: ");
        //Counts each character present in the string
        for(int i = 0; i <string.length; i++) {
            count = 1;
            for(int j = i+1; j <string.length; j++) {
                if(string[i] == string[j] && string[i] != ' ') {
                    count++;
                    //Set string[j] to 0 to avoid printing visited character
                    string[j] = '0';
                }
            }
            //A character is considered as duplicate if count is greater than 1
            if(count > 1 && string[i] != '0')
                System.out.println(string[i]+ "---> " +count);
        }


//        System.out.println("Plz Enter Your String: ");
//        Scanner sc = new Scanner(System.in);
//        String s1 = sc.nextLine();
//        int count = 0;
//        for (int i = 0; i < s1.length(); i++) {
//            for (int j = 0  ; j < s1.length(); j++) {
//                if (s1.charAt(i) == s1.charAt(j)) {
//                    count++;
//                }
//            }
//            System.out.println(s1.charAt(i) + " --> " + count);
//            String d = String.valueOf(s1.charAt(i)).trim();
//            s1 = s1.replaceAll(d, "");
//            count = 0;
//
//        }




    }
    }

