package homeworks;

 import java.text.DecimalFormat;
import java.util.Scanner;

public class AreaAndPerimeterCalculation {
    public static void main (String [] args ) {

        Scanner input = new Scanner(System.in);
        System.out.println("Please Enter the Width ");

        double  width = input.nextDouble();

         System.out.println("Please Enter the Height");
         double height = input.nextDouble();
         double area = width * height;
         double perimeter = 2 * (width + height) ;
        DecimalFormat f = new DecimalFormat(".00");

        System.out.println("Area is " +f.format(width) + "*" + f.format(height) + "=" + f.format(area));
        System.out.println("Perimeter is " +2 + "*" +( f.format(width) + "+" + f.format(height) + "=" + f.format(perimeter) ));




    }
}
