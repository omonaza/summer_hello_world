package sessions.if_statement;
import java.util.Scanner;
public class MiniMax {
    public static void main(String[] args) {
        int a,b,c,max, min, norSnorG;
        Scanner userInput = new Scanner(System.in);
        a = userInput.nextInt();
        b = userInput.nextInt();
        c = userInput.nextInt();
        max = min = norSnorG = a;
        if (a > b && a > c ) {
            max = a;
        } else if (a < b && a < c) {
            min = a;
        } else {
            norSnorG = a;
        }
        if (b > a && b > c) {
            max = b;
        } else if (b < a && b < c) {
            min = b;
        } else {
            norSnorG = b;
        }
        if (c > a && c > b) {
            max = c;
        } else if (c < a && c < b) {
            min = c;
        } else {
            norSnorG = c;
        }
        System.out.println("The greatest of " +a + " and "+b+" and "+c +" is " + max);
        System.out.println("The smallest of " +a + " and "+b+" and "+c +" is " + min);
        System.out.println("The nighter greatest nor the smallest of " +a + " and "+b+" and "+c +" is " + norSnorG);
    }
}

