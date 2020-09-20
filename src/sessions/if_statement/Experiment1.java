package sessions.if_statement;

import java.util.Scanner;

public class Experiment1 {
    public static void main(String[] args) {
        int a, b, c ;
        Scanner userInput = new Scanner(System.in);
        a = userInput.nextInt();
        b = userInput.nextInt();
        c = userInput.nextInt();
        int max =(Math.max(c,(Math.max(a,b))));
        System.out.println("The maximum of 3 numbers is : " + max);
        int min = (Math.min(c, (Math.min(a, b))));
        System.out.println("The minimun of 3 numbers is : " + min);

        int result = (a>b && a>c ) ? max  :min ;
         int result1 = (a<b && a<c ) ? min  : max ;
        System.out.println("The greatest of " +a + " and "+b+" and "+c +" is " +result );
        System.out.println("The smallest  of " +a + " and "+b+" and "+c +" is " +result1 );


    }
}