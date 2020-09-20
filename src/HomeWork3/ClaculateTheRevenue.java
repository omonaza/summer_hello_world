package HomeWork3;

import java.util.Scanner;

public class ClaculateTheRevenue {
    public static void main(String[] args) {
   //  calculateDiscount();
      System.out.println(Greeting("Nursultan"));
    }
    public static void calculateDiscount ( ) {
        float unitPrice = 0f;
        int quantity = 0;
        float revenue = 0f;
        float discountRate = 0f;
        float discountAmount = 0f;


        Scanner userInput = new Scanner(System.in);
        System.out.println("Please enter the unit price");
        unitPrice = userInput.nextFloat();
        System.out.println("Please Enter the Quantity");
        quantity = userInput.nextInt();
        if (quantity < 100 ) {
            revenue = unitPrice * quantity;

        }else if (quantity >=100 && quantity <=120 ) {
            discountRate = (float)10 / 100;
            revenue = unitPrice * quantity;
            discountAmount = revenue * discountRate;
            revenue -= discountAmount;

        } else if (quantity > 120 ) {
            discountRate = (float) 15 / 100;
            revenue = unitPrice * quantity;
            discountAmount = revenue * discountRate;
            revenue -=discountAmount;

        }

        System.out.println("The Revenue from sale is " +revenue );
        System.out.println("After Discount is " +discountAmount);
    }


    public static String Greeting (String name) {
        return "Hello " +name + "!";
    }


}
