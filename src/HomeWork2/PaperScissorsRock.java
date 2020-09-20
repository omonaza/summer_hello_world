package HomeWork2;

import java.security.SecureRandom;
import java.util.Random;
import java.util.Scanner;

public class PaperScissorsRock {

 public static void main (String [] args ) {
     Random generator = new SecureRandom();
     Scanner userInput = new Scanner(System.in);
     String personPlay;
     String computerPlay = "";
     int computerInt;

     String response;

     System.out.println("Hey, let's play Rock, Paper, Scissors!\n" +
             "Please enter Your Move .\n" + "Rock = R, Paper" +
             "= P, and Scissors = S.");

     System.out.println();

     computerInt = generator.nextInt(3)+1;

     if(computerInt==1)
         computerPlay = "R";
     else if (computerInt==2)
         computerPlay = "P";
     else if (computerInt==3)
         computerPlay = "S";

     System.out.println("Person's Play ");
     personPlay=userInput.next();
      personPlay=personPlay.toUpperCase();


      System.out.println("Computer's Play " +computerPlay);
        if (personPlay.equals(computerPlay)){
            System.out.println("it's a tie! ");

        } else if (personPlay.equals("R")) {
            if (computerPlay.equals("S"))
                System.out.println("Rock crashes Scissor You Win !");
            else if (computerPlay.equals("P"))
                System.out.println("Paper eats Rock You Lose ");
        }

         else if (personPlay.equals("P")){
             if (computerPlay.equals("R"))
                System.out.println("Paper eats rock You Won !!!");
             else if (computerPlay.equals("S"))
                 System.out.println("Scissor cuts the Paper You Lose ");
        }

         else if (computerPlay.equals("S")) {
            if (personPlay.equals("R"))
                System.out.println("Rock crashes The Scissor You Lost !!!");
            else if (computerPlay.equals("P"))
                System.out.println("Scissor Cuts the Paper You Won !!!");
        }
          else
              System.out.println("invalid User input ");

 }
}
