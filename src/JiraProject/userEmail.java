package JiraProject;

import java.util.Scanner;

public class userEmail {

    private static Object Exception;

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter your email: ");
        String email = "";

        while (email!=Exception) {
          //  System.out.println("Enter your email: ");
            email = scn.next();
            try {
                if (email.indexOf('@') == 0) {
                    System.out.println(" Please Enter valid email address: ");
                  //  email = scn.next();
                } else {

                    System.out.println("Email id: " + email.substring(0, email.indexOf("@")) +
                            "\nEmail domain: " + email.substring(email.indexOf("@") + 1));
                    break;
                }
            } catch (Exception e) {
                System.out.println("Please Enter valid email address,\nbecause of you people entering invalid address, we have to struggle to fix this )))");
            }
        }
    }
}
//        System.out.println("Email id: " + email.substring(0, email.indexOf("@")) +
//                  "\ndomain: " + email.substring(email.indexOf(("@")+1)));