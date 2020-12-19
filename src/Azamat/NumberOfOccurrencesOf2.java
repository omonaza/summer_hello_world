package Azamat;

import java.util.Scanner;

public class NumberOfOccurrencesOf2 {


    public static void main(String args[]) {
//        int number1 = 0;
//        Scanner input = new Scanner(System.in);
//
//            System.out.println("Pls enter any number");
//
//            boolean b = true;
//            while (b){
//                String number = input.next();
//                if(Character.isDigit(number.charAt(0))){
//                    number1=Integer.parseInt(number);
//                    b=false;
//                }else {
//                    System.out.println("Please enter integer only: ");
//                }
//            }
//            System.out.println(numberOf2sInRange(number1));
//
//
//        }
        Scanner input =new Scanner(System.in);
        try{ System.out.println("Pls enter any number");
            int number=input.nextInt();
            System.out.println(numberOf2sInRange(number));
        } catch (Exception e){
            System.out.println("Enter only numbers");
            int number=input.nextInt();
        }
    }

    static int numberOf2s(int n) {
        int count = 0;
        while (n > 0) {
            if (n % 10 == 2)
                count++;
            n = n / 10;
        }
        return count;
    }

    static int numberOf2sInRange(int n) {
        int count = 0;
        for (int i = 2; i <= n; i++)
            count += numberOf2s(i);
        return count;
    }
}