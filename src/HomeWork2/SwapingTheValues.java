package HomeWork2;

public class SwapingTheValues {
    public static void main (String [] args ) {

        int x = 10; // 50
        int y = 50; // 10

        int t = x;  // t = 10
        x = y ;     // x = 50
        y = t;      // y = 10

        System.out.println(" x is " + x);
        System.out.println(" y is " + t );

        // 2way math without extra variable

        x+= y;
    }
}
