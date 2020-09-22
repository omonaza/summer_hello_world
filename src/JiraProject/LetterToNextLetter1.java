package JiraProject;

import java.util.Scanner;

public class LetterToNextLetter1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter word");
        String foo = scanner.nextLine().trim();

        StringBuilder bar = new StringBuilder();
        for (char c : foo.toCharArray()) {
            bar.append(Character.toString((char) (((c - 'a' +1) % 26) + 'a')));
        }
        char upperVowel = 0;
        char ch = 0;
        for(int i=0;i <bar.length();i++){
             ch = bar.charAt(i);
             switch (ch){
                 case 'a':
                 case 'e':
                 case 'i':
                 case 'o':
                 case 'u':
                     upperVowel = Character.toUpperCase(ch);
                     break;

             }

//            if(ch == 'a' || ch == 'e' || ch == 'i' //not working
//                    || ch == 'o' || ch == 'u') {
//                upperVowel = Character.toUpperCase(ch);
//
//            }
            bar.toString().trim().replace(ch,upperVowel);

        }
        System.out.println(bar);
    }

}
