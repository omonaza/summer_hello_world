package HomeWork3;

import java.util.Scanner;

public class FirstNameToUppercase {
    public static String FirstToUppercase (String name) {
        String firstLatter = name.substring(0,1).toUpperCase();
        String result = firstLatter.concat(name.substring(1,name.length()));
        return result;
    }
    public static void convertAndPrintTwoWords(String l1 , String l2) {
        System.out.print(FirstToUppercase(l1) + " " + FirstToUppercase(l2));
    }
    public static void main (String [] args ) {
        Scanner userInput = new Scanner(System.in);
        System.out.println("Please Enter your First Name and Last Name ");
        String firstName = userInput.nextLine();
        String lastName = userInput.nextLine();
        convertAndPrintTwoWords(firstName,lastName);
    }
}
