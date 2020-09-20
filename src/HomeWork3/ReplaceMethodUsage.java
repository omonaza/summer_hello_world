package HomeWork3;

import java.util.Scanner;

public class ReplaceMethodUsage {

    public static String replace (String str ){
      String result = str.replace('x','X');
      return result;
    }

    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.println("Please Enter the word");
        String word = userInput.nextLine();
        System.out.println(replace(word));
    }
}
