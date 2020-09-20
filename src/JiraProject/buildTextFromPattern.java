package JiraProject;

import java.util.Scanner;

public class buildTextFromPattern {
    public String buildText (String word, String separator,int times){
        String buildText = "";
        for (int i =1; i <= times; i ++){
            buildText+=word ;

            if(i < times){
                buildText+=separator;
            }
        }return buildText;
    }

    public static void main(String[] args) {
        buildTextFromPattern b1 = new buildTextFromPattern();
        Scanner userInput = new Scanner(System.in);
        System.out.println("Please Enter word");
        String word = userInput.next();
        System.out.println("Please enter separator");
        String separator = userInput.next();
        System.out.println("Times");
        int times = userInput.nextInt();

        System.out.println(b1.buildText(word,separator,times));
    }
}
