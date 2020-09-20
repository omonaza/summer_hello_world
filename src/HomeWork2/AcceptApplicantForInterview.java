package HomeWork2;

import java.util.Scanner;

public class AcceptApplicantForInterview {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.println("Please Enter Your Years In Collage");
        int YearsInCollage = userInput.nextInt();
        System.out.println("Please Enter Years In Programing Experience");
        int YearsInProgramming = userInput.nextInt();
        System.out.println("Please Enter Your GPA ");
        double GPA = userInput.nextDouble();
        boolean result = AcceptApplicant(YearsInCollage,YearsInProgramming,GPA);
        System.out.println("Is applicant meets the condition ? " +result);
    }

    public static boolean AcceptApplicant ( int years , int experience , double gpa) {
        boolean result = false;

        if (years >= 4) {
            if (experience >= 2) {
            } else if (gpa > 3.5) {
            } result = true;

        } else {
            result = false;

        }

        return result;
    }


}
