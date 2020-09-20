package sessions.String;

import java.util.Scanner;

public class StringBuilderExercises {

    public static boolean isPalindrome (String inPutString) {
        //  StringBuilder stb = new StringBuilder(inPutString);
        // return stb.reverse().toString().equals(inPutString);

        StringBuilder stb = new StringBuilder(inPutString);
        System.out.println("is it reverse "+stb.reverse());
        boolean result ;
        if (stb.reverse().toString().equals(inPutString)) {
            result = true;
        } else {
            result = false;
        } return result; // length
    }
        public static String convertFirstToUpper(String s ){

            String firstLetter = s.substring(0,1).toUpperCase();
            String result = firstLetter.concat(s.substring(1, s.length())); // firstLetter + s.substring()
            return result;

        }

    public static void convertAndPrintTwoWords(String s1, String s2){
        System.out.println(convertFirstToUpper(s1)+ " "+convertFirstToUpper(s2));
    }




    public static void main (String [] args  ) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Monday");
        stringBuilder.append("Tuesday");
        stringBuilder.insert(6,'-');
        stringBuilder.delete(3,6);
        stringBuilder.reverse();
        System.out.println(stringBuilder);

        Scanner userInput = new Scanner(System.in);
        System.out.println(" Please Guess a word ");
        String word = userInput.next();
        boolean isPalindromeResult = isPalindrome(word);
        if (isPalindromeResult) {
            System.out.println("It is Palindrome");
        }else {
            System.out.println("it is not Palindrome");
        }

        System.out.println(convertFirstToUpper("Azamat"));
        convertAndPrintTwoWords("will", "smith");





    }
}
