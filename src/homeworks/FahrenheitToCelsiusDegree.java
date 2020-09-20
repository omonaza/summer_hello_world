package homeworks;
import java.util.Scanner;
public class FahrenheitToCelsiusDegree {

    public static void main (String [] args )  {

        Scanner input = new Scanner(System.in);
        System.out.println("Please Enter a degree in Fahrenheit");
        double fahrenheit = input.nextDouble();

         double celsius =  5 / 9.0 * (fahrenheit-32); //  * C = (F - 32) × 5/9 */

       // System.out.print("212 degree Fahrenheit is equal to ");
        System.out.println(fahrenheit +" Fahrenheit is equal to " +celsius + " in Celsius");


        double inches ;
        double meters;

        Scanner inch = new Scanner(System.in);
        System.out.println(" Please enter a value for inch");

        inches =inch .nextDouble();
        meters = inches *  0.0254 ;

        System.out.println(inches +"  is " + meters + "  meters " );











    }
}
