package sessions.if_statement;
import java.util.Scanner;

public class IfAndElse {

        public static void main(String[] args){
            Scanner input = new Scanner(System.in);

            int firstNum = input.nextInt();
            int secondNum = input.nextInt();
            int max, min;

            if (firstNum > secondNum) {
                max = firstNum;
                min = secondNum;
                System.out.println("The max of "+firstNum+ "and "+secondNum+" is "+max);
                System.out.println("The min of "+firstNum+ "and "+secondNum+" is "+min);

            } else if (firstNum == secondNum){
                System.out.println("The numbers are equal!");
            }
            else {

                max = secondNum;
                min = firstNum;
                System.out.println("The max of "+firstNum+ "and "+secondNum+" is "+max);
                System.out.println("The min of "+firstNum+ "and "+secondNum+" is "+min);
            }
        }
    }

