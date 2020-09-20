package Practice;

import java.util.Random;
import java.util.Scanner;

public class CoinTossing {

    public static String TossingCoin( ){
       String coin = "";
       Random random = new Random();
       int toss = random.nextInt(2);
       switch (toss){
           case 0:
               coin = "Tail";
               break;
           case 1:
               coin = " Head";
               break;
           default:

       } return coin;
    }


    public static void main ( String [] args ) {
        Scanner userInput =new Scanner(System.in);
        System.out.println("Please Enter the number ");
        int num0 = userInput.nextInt();
        //int num1 = userInput.nextInt();
       // int num2 = userInput.nextInt();


        System.out.println("Please Toss the coin and it is " +TossingCoin());
    }
}
