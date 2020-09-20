package HomeWork3;

import java.util.Scanner;

public class EnterYourPin {
    public static void enterYourPin() {
        Scanner userInput = new Scanner(System.in);
        int pin = 12345;
        System.out.println("Welcome to the Bank Of Michigan ");
        System.out.println("Please Enter Your Pin");
        int entry = userInput.nextInt();
        int counter = 0;
        while (entry != pin) {
            System.out.println("\nINCORRECT PIN. TRY AGAIN.");
            System.out.print("ENTER YOUR PIN: ");
            entry = userInput.nextInt();
            counter++;
        }
        System.out.println("\nPIN ACCEPTED. YOU NOW HAVE ACCESS TO YOUR ACCOUNT.");
    }

    public static void main(String[] args) {
        //  enterYourPin();


        Scanner userInput = new Scanner(System.in);
        int pin = 12345;
        System.out.println("Welcome to the Bank Of Michigan ");
        System.out.println("Please Enter Your Pin");
        int entry = userInput.nextInt();

        int counter = 0;
        while (counter == pin) {

            if (entry != pin) {
                System.out.println("\nINCORRECT PIN. TRY AGAIN.");
                System.out.print("ENTER YOUR PIN: ");
                counter++;
                break;
            } else {
                System.out.println("\nPIN ACCEPTED. YOU NOW HAVE ACCESS TO YOUR ACCOUNT.");

            }
        }


    }
}
