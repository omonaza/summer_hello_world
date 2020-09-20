package JiraProject;

import java.util.Scanner;

public class LetterToNextLetter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter word");
        String foo = scanner.nextLine().trim();

        StringBuilder bar = new StringBuilder();
        for (char c : foo.toCharArray()) {
            bar.append(Character.toString((char) (((c - 'a' +1) % 26) + 'a')));
        }
//        char upperVowel = 0;
//        for(int i=0;i<bar.length();i++){
//            char ch = bar.charAt(i);
//            if(ch == 'a' || ch == 'e' || ch == 'i' //not working
//                    || ch == 'o' || ch == 'u') {
//                upperVowel = Character.toUpperCase(ch);
//
//            }
//            bar.toString().trim().replace(ch,upperVowel);
//        }
        System.out.println(bar);
    }

}
