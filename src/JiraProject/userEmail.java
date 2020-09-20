package JiraProject;

import java.util.Scanner;

public class userEmail {

    private static Object Exception;

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        System.out.println("Enter your email: ");
        String email = "";
        while (email != Exception) {
            email = scn.next();
            try {
                System.out.println("Email id: " + email.substring(0, email.indexOf("@")) +
                        "\ndomain: " + email.substring(email.indexOf(("@"))));
                break;
            } catch (Exception e) {
                System.out.println("Please Enter again valid email address,\nbecause of you people entering invalid address, we have to struggle to fix this )))");
            }
        }

    }
}
