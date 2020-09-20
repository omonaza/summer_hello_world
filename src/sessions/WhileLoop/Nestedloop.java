package sessions.WhileLoop;
import java .util.Scanner;
public class Nestedloop {


    public static void main(String[] args){
        //Scanner userInput = new Scanner(System.in);
       // int number = userInput.nextInt();
     //   printMultTable(number);

        for (int i = 10; i > 0; i--){
            for (int j = 1; j <= i ; j++){
                System.out.print(j);
            }
            System.out.println();
        }

    }

    public static void printMultTable(int number){
        for (int i = 1; i <= number; i++){
            for(int j = 1; j <= 10; j++){
                System.out.print(i +" x "+ j+" = "+(i*j)+"\t");
            }
            System.out.println();
        }
    }

}
