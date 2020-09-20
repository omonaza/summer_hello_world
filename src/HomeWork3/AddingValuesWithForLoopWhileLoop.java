package HomeWork3;

import java.util.Scanner;

public class AddingValuesWithForLoopWhileLoop {
    public static int AddingUpValues (int num){
       int sum = 0 ;
       for ( int i = 0; i < num; i++){
           sum = sum +i +1 ;
       } return sum;
    }

    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        int num = userInput.nextInt();
        System.out.println(AddingUpValues(num));
    }
}
