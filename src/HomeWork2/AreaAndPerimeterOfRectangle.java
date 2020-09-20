package HomeWork2;

import java.util.Scanner;

public class AreaAndPerimeterOfRectangle {
 public static void AreaOfRectangle ( double a , double b ) {
     double perimeter =  2 * (a + b);
     double area = a * b ;
    System.out.println(" The perimeter of Rectangle is "  +perimeter);
    System.out.println("The Area Of Rectangle is "  +area);

 }

 public static void main (String [] args ) {
     Scanner userInput = new Scanner(System.in);
      int counter = 0 ;
      while (counter <3) {
          System.out.println("Please Enter the Length");
          int a = userInput.nextInt();
          System.out.println("Please Enter the Width ");
          int b = userInput.nextInt();
          AreaOfRectangle(a, b);
          counter ++;
      }

 }

}
