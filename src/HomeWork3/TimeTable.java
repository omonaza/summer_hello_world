package HomeWork3;

import java.util.Scanner;

public class TimeTable {
    public static void multiTable (int size ){
         for (int i = 1; i <= size; i++){
             for(int j = 1; j <= size;j++){
                 System.out.print( i +" x " +j+" = "+(i*j)+"\t");
             }
             System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.println("Please enter number");
        int size = userInput.nextInt();
        multiTable(size);
    }
}
