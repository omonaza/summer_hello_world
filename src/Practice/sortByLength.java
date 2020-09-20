package Practice;

import java.util.Arrays;
import java.util.Scanner;

public class sortByLength {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any sentence : ");
        String line = sc.nextLine();

        System.out.println(sortByLength(line));
    }
    public static String sortByLength(String str) {

        String temp = "";
        String[] eachWordArray = str.split(" ");
        String newStrings = "";

        for (int i = 0; i < eachWordArray.length; i++) {
            for (int j = 0; j < eachWordArray.length; j++) {
                if (eachWordArray[i].length() < eachWordArray[j].length()) {
                    temp = eachWordArray[i];
                    eachWordArray[i] = eachWordArray[j];
                    eachWordArray[j] = temp;
                }else if (eachWordArray[i].length()==eachWordArray[j].length()){
                    if (eachWordArray[i].charAt(0)<eachWordArray[j].charAt(0)){
                        temp = eachWordArray[i];
                        eachWordArray[i] = eachWordArray[j];
                        eachWordArray[j] = temp;
                    }
                }
            }
        }
        newStrings = Arrays.toString(eachWordArray);

        return newStrings;
    }
}
