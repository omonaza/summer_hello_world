package HomeWork3;

import java.util.Scanner;

public class FourDifferentReturnType {
    public static int Addition (int a,int b){
        return a+b;
    }
    public static int Subtracting  (int a,int b){
        return a-b;
    }
    public static int Multiplication (int a,int b){
        return a*b;
    }
    public static int Division (int a,int b){
        return a/b;
    }

    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.println("Please Enter num A");
        int a = userInput.nextInt();
        System.out.println("Please Enter num B");
        int b = userInput.nextInt();
        System.out.println(Addition(a,b));
        System.out.println(Subtracting(a,b));
        System.out.println(Multiplication(a,b));
        System.out.println(Division(a,b));
    }
}
