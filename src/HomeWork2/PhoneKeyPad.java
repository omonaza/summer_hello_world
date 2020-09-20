package HomeWork2;

import java.util.Scanner;

public class PhoneKeyPad {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.println("Please Enter Alphabet from A - Z ");
        char latter = userInput.next().toUpperCase().charAt(0);
        String number = "";

        System.out.println("Please Enter Alphabet from A - Z ");
        char latter1 = userInput.next().toLowerCase().charAt(0);
        String result = PhoneKeyPad1(latter1);
        System.out.println(result);

        if (latter == 'A' || latter == 'B' || latter == 'C') {
            number = "2";

        } else if (latter == 'D' || latter == 'E' || latter == 'F') {
            number = "3";
        } else if (latter == 'G' || latter == 'H' || latter == 'I') {
            number = "4";
        } else if (latter == 'J' || latter == 'K' || latter == 'L') {
            number = "5";
        } else if (latter == 'M' || latter == 'N' || latter == 'O') {
            number = "6";
        } else if (latter == 'P' || latter == 'Q' || latter == 'R' || latter == 'S') {
            number = "7";
        } else if (latter == 'T' || latter == 'U' || latter == 'V') {
            number = "8";
        } else if (latter == 'W' || latter == 'X' || latter == 'Y' || latter == 'Z') {
            number = "9";
        }
        System.out.println(number);


    }

    public static String PhoneKeyPad1(char letter) {
        String number = "";
        switch (letter) {
            case 'a':
            case 'b':
            case 'c':
                number = "2";
                break;
            case 'd':
            case 'e':
            case 'f':
                number = "3";
                break;
            case 'g':
            case 'h':
            case 'i':
                number = "4";
                break;
            case 'j':
            case 'k':
            case 'l':
                number = "5";
                break;
            case 'm':
            case 'n':
            case 'o':
                number = "6";
                break;
            case 'p':
            case 'q':
            case 'r':
            case 's':
                number = "7";
                break;
            case 't':
            case 'u':
            case 'v':
                number = "8";
            case 'w':
            case 'x':
            case 'y':
            case 'z':
                number = "9";
                break;
            default:
                System.err.println(" Error sorry ");


        }
        return number;


    }


}
