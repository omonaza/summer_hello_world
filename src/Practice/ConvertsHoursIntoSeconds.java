package Practice;

import java.util.Scanner;

public class ConvertsHoursIntoSeconds {
    public static int SecondConverter (int hour ) {
        int second  = hour * 3600;
         return second;
    }

    public static void main ( String [] args ) {
        Scanner userInput = new Scanner(System.in);
        System.out.println("Please Enter hours in Number ");
        int hours = userInput.nextInt();
        System.out.println(" Converter hours into seconds  " +SecondConverter(hours));
    }
}
