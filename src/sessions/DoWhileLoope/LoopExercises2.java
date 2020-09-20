package sessions.DoWhileLoope;
import java .util.Scanner;
public class LoopExercises2 {
    public static void main(String[] args){
        Scanner userInput = new Scanner(System.in);
        boolean isValidInput = false;
        int a;
        do {
            System.out.println("Please enter Integer to continue, enter anything else to exit!");
            if (userInput.hasNextInt()) {
                isValidInput = true;
                a = userInput.nextInt();
                System.out.println("You got another chance!");
            }else {
                isValidInput = false;
                System.out.println("No another chance, sorry!");
            }
        } while(isValidInput);

    }
}
