package HomeWork2;

import java.util.Scanner;

public class PaperScissorRockWithSwitch {
    public static void main(String[] args) {
        Scanner inPut = new Scanner(System.in);
        String p, c;

        System.out.println(" First Player to Play ");
        p = inPut.nextLine();
        System.out.println("Second Player to Play ");
        c = inPut.nextLine();


        switch (p) {
            case "P":
                switch (c) {
                    case "R":
                        System.out.println("First Player wins,Paper eats Rock  ");
                        break;
                    case "S":
                        System.out.println("Second Player Wins, Scissor Cuts Paper ");
                        break;
                    case "P":
                        System.out.println("Draw");
                        break;
                }
        }

        switch (p){
            case "S":
                switch (c){
                    case "R":
                        System.out.println("First Player Loose Rock Breaks The Scissor ");
                        break;
                    case "P":
                        System.out.println("Second Player loose,Scissor cuts Paper ");
                        break;
                    case"S":
                        System.out.println("Draw");
                        break;
                }
        }

        switch (p) {
            case "R":
                switch (c){
                    case "P":
                        System.out.println("First Player loose,Paper eats rock");
                        break;
                    case "S":
                        System.out.println("First Player Wins,Rock Breaks Scissor");
                        break;
                    case "R":
                        System.out.println("Draw");
                }
        }

    }
}
