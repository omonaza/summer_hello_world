package HomeWork2;

import java.util.Scanner;

public class AreaOfTriangle {

    public static void main (String [] args ) {
        Scanner userInput = new Scanner(System.in);
        System.out.println("Please Enter The Width ");
        double Width = userInput.nextInt();
        System.out.println("Please Enter The Height ");
        double Height = userInput.nextInt();

        double area =(Height * Width) / 2;

        System.out.println("Area of Triangle is " +area);
    }
}
