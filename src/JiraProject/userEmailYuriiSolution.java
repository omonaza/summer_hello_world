package JiraProject;

import java.util.Scanner;

public class userEmailYuriiSolution {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int timesToBeAbleToEnterEmail = 5;
        while (timesToBeAbleToEnterEmail != 0) {
            System.out.println("Enter your email: ");
            String email = scn.next();

                if (email.contains("@")&&email.indexOf("@")!=0) {
                    System.out.println("Email id: " + email.substring(0, email.indexOf("@")) +
                            "\nEmail domain: " + email.substring(email.indexOf("@") + 1));
                    break;
                } else {
                    timesToBeAbleToEnterEmail--;
                       System.out.println("Your email is not correct, you can " + timesToBeAbleToEnterEmail + " more times to enter correct one!");

                } if (timesToBeAbleToEnterEmail == 0){
                System.out.println("you are blocked ");
            }

        }
    }
}