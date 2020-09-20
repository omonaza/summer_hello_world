package HacherRankTasks;

import java.util.Scanner;

public class BigInteger {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        java.math.BigInteger a = new java.math.BigInteger(userInput.next());
        java.math.BigInteger b = new java.math.BigInteger(userInput.next());
        java.math.BigInteger result1 = a.add(b);
        java.math.BigInteger result = a.multiply(b);
        System.out.println(result1);
        System.out.println(result);
    }
}
