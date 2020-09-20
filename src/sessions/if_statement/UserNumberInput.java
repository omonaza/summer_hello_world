package sessions.if_statement;
import java.util.Scanner;

public class UserNumberInput {


    public static void main(String[] args){

        Scanner userInput = new Scanner(System.in);
        System.out.println("Please enter your name!");
        String name = userInput.nextLine();

        System.out.println("Please enter your marital status!");
        String maritalStatus = userInput.next();
        System.out.println("Please enter your age!");

        int age = userInput.nextInt();
        System.out.println("Please enter your height in cm!");

        int height = userInput.nextInt();
        System.out.println("Please enter your weight in kg!");

        int weight = userInput.nextInt();
        System.out.println("Enter the distance you have run:");

        double distance = userInput.nextDouble();
        System.out.println("Enter the time you have covered that distance:");

        double time = userInput.nextDouble();
        boolean isEligible = (maritalStatus == "u") && (age > 21 && age <= 35) && (height > 180) && (weight > 70 && weight < 80);
        double pace = distance/time;
        System.out.println("Hello "+ name + ", your eligibility is "+ isEligible);
        System.out.println("Your pace is : "+ pace);
    }
}

