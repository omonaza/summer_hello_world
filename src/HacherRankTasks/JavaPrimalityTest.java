package HacherRankTasks;

import java.math.BigInteger;
import java.util.Scanner;

public class JavaPrimalityTest {

    public static void main(String[] args) {
        Scanner userInput =  new Scanner(System.in);
        BigInteger n = userInput.nextBigInteger();
        if(n.isProbablePrime(1)){
            System.out.println("prime");
        }else {
            System.out.println("not prime");
        }
        userInput.close();
    }
}
