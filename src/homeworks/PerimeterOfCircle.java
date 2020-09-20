package homeworks;
import java.text.DecimalFormat;
import java.util.Scanner;
public class PerimeterOfCircle {

    public static void main (String [] args ) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please Enter the Radius ");

        double radius = input.nextDouble();
        double perimeter ;
        perimeter = 2 * radius * Math.PI;
        double area ;
        area  = Math.PI *( radius * radius) ;
        //DecimalFormat format = new DecimalFormat(".2388980384689");

        System.out.println("Perimeter is " + perimeter);
        System.out.println("Area is " +  (area));





    }



}
