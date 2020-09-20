package JiraProject;

import java.util.Scanner;

public class changeEveryLater {

    public  String move (String word){
        StringBuilder result = new StringBuilder();
        String alphabet = "AaBbCcDdEeFfGgHhIiJjKkLlMmNnOoPpQqRrSsTtUuVvWwXxYyZz!!??@@11223344556677889910";
        for (int i = 0; i < word.length(); i++){
            result.append(alphabet.charAt(alphabet.indexOf(word.charAt(i) +1)));

        }
        return result.toString();
    }

    public static void main(String[] args) {
        changeEveryLater later = new changeEveryLater();

            Scanner userInput = new Scanner(System.in);
            System.out.println("Please enter word,no special char; ");
            String word = userInput.next();
      //  String count = word;
//            do {
//
//            }  while (word.toLowerCase().charAt('z')=='z');
//                System.out.println("sfdg");


            System.out.println(later.move(word));



    }
}
