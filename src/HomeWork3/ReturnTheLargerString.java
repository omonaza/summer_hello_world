package HomeWork3;

import java.util.Scanner;

public class ReturnTheLargerString {
    public static String LargerString(String word, int n) {
        String result = "";
        for (int counter = 0; counter < n; counter++) {
            result += word;
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner userInput =new Scanner(System.in);
        int counter = 0 ;
        while (counter<3) {
            System.out.println("Please Enter a number");
            int n = userInput.nextInt();
            String word = "Hi";
            String result = LargerString(word, n);
            System.out.println(result);
            counter++;
        }
    }
}
