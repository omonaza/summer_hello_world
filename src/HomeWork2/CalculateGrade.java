package HomeWork2;

import java.util.Scanner;

public class CalculateGrade {
    public static void main (String [] args ) {
        Scanner userInput = new Scanner(System.in);
        System.out.println("Please Enter The average mark of a student");
        int averageMark = userInput.nextInt();

        if ( averageMark >= 80 ) {
            System.out.println("Grade \' A \' ");
        } else if (averageMark < 80 && averageMark >=60 ) {
            System.out.println("Grade \' B \' ");
        } else if ( averageMark < 60 && averageMark >= 50) {
            System.out.println("Grade \' C \' ");
        } else {
            System.out.println("Grade \' D \' ");
        }
    }
}
