package sessions.WhileLoop;
import java .util.Scanner;
public class ForLoopExercises {
    public static void main(String[] args){
        Scanner userInput = new Scanner(System.in);
        System.out.println("Please Enter the Number");
        int number = userInput.nextInt();
        System.out.println("The factorial of "+number + " is "+factorial(number));
        for(int i = 100; i > 0 ; i = i - 10) {
            if (i % 2 == 0) {
                System.out.println(i+ " even");
            }else {
                System.out.println(i+" odd");
            }
        }
    }

    public static long factorial(int number){
        long result = 1;
        for (int i = number; i >= 1; i--){
            result = result * i;
        }
        return result;
    }
}
