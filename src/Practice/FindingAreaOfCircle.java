package Practice;

import java.util.Scanner;

// exc4. Find the area of the circle. PS: formula of area of the circle is :Area= π r^2


public class FindingAreaOfCircle {
    public static void AreaCircle(double radius ) {
        double a = Math.PI * Math.pow(radius,2);
        System.out.println("The Area Of a Circle Is " + a);
    }
    public static double AreaOfCircle ( double Radius ) {
        return Math.PI * Math.pow(Radius,2);
    }

    public static void main (String [] args ) {
        Scanner userInput = new Scanner(System.in);
        System.out.println("Please enter Radius of the circle");
        double Radius = userInput.nextDouble();
        AreaCircle(Radius);
        double radius = AreaOfCircle(Radius);
        System.out.println("The Area Of a Circle Is " + radius );
        System.out.println("The Area Of a Circle Is "+  AreaOfCircle(Radius));

    }
}
