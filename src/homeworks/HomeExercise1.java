package homeworks;
import java .util.Scanner;
public class HomeExercise1 {

    /*
     Exercise 1: Write Java program to allow the user to input two float values
     and then the program adds the two values together.
     The result will be assigned to the first variable.
Ex:
Enter value a:12.5
The value of a before adding is 12.5.
Enter value b:34.9
The value of a after adding is 47.4.
     */
    public static void main (String [] args ) {
        Scanner input=new Scanner(System.in);
        System.out.println("Please Enter the fist value ");
        float firstValue =input.nextFloat();
        System.out.println("Please Enter the second value ");
        float secondValue=input.nextFloat();

        System.out.println( "The value of a after adding is  "+ (firstValue=firstValue+secondValue));







    }
}
