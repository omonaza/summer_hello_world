package javaPrograming;

import java.util.Scanner;

public class ArmstrongNumber {
//    Armstrong Number in Java:
//    A positive number is called armstrong number
//    if it is equal to the sum of cubes of its digits
//    for example 0, 1, 153, 370, 371, 407 etc.

//    153 = (1*1*1)+(5*5*5)+(3*3*3)
//    where:
//            (1*1*1)=1
//            (5*5*5)=125
//            (3*3*3)=27
//    So:
//            1+125+27=153
//    Let's try to understand why 371 is an Armstrong number.
//
//            371 = (3*3*3)+(7*7*7)+(1*1*1)
//    where:
//            (3*3*3)=27
//            (7*7*7)=343
//            (1*1*1)=1
//    So:
//            27+343+1=371


    public static void main(String[] args) {
        int c=0,a,temp;
        int n=157;//It is the number to check armstrong
        temp=n;
        while(n>0)
        {
            a=n%10;
            n=n/10;
            c=c+(a*a*a);
        }
        if(temp==c)
            System.out.println("armstrong number");
        else
            System.out.println("Not armstrong number");

        armstrong();

    }

    public static void armstrong(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter  Armstrong Number in Java:");
        int num = scanner.nextInt();
        int c = 0, a , temp;
        temp = num;
        while (num > 0){

            a = num % 10;
            num = num / 10;
            c = c +(a*a*a);
        }
        if(temp == c){
            System.out.println("armstrong number");
        }else {
            System.out.println("Not armstrong number");
        }


    }


}


