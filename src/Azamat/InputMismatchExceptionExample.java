package Azamat;
import  java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;
public class InputMismatchExceptionExample {
    //The name of the input file.
        private final static String filename = "input.txt";

        public static void main(String[] args) throws FileNotFoundException {
            Scanner scanner = new Scanner(new File(filename));
            System.out.println("Please Enter arrays size");
            // String regex = "\"[a-zA-Z]\"";
            int size = scanner.nextInt();

            int[] numbers = new int[size];

            for (int i = 0; i < size; i++) {
                System.out.println("please enter the values");
                numbers[i] = scanner.nextInt();
            }

            System.out.println(Arrays.toString(numbers));
            while(scanner.hasNext())
                System.out.println(scanner.nextInt());

            //Close the scanner.
            scanner.close();
        }
    }

