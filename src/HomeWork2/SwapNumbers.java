package HomeWork2;

public class SwapNumbers {
    public static void main (String [] args ) {
       int number1 = 9 ;
       int number2 = -9;

       int emptyNumber = number1;
       number1 = number2;
       number2 = emptyNumber;

       System.out.println("first number is " +number1);
       System.out.println("Second Number is " +number2);
    }
}
