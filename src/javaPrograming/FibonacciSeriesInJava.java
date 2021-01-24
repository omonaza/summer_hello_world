package javaPrograming;

public class FibonacciSeriesInJava {
   /* In fibonacci series, next number is the sum of previous two numbers
    for example 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55 etc. The first two numbers of fibonacci series are 0 and 1.

    There are two ways to write the fibonacci series program in java:

    Fibonacci Series without using recursion
    Fibonacci Series using recursion*/


    public static void main(String args[]) {
        int n1=0,n2=1,n3,count=10;

        System.out.print(n1+" "+n2);//printing 0 and 1
        for(int i=2; i<count; ++i){ //loop starts from 2 because 0 and 1 are already printed
            n3=n1+n2;
            System.out.print(" "+n3);
            n1=n2;
            n2=n3;
        }
        System.out.println();




//        int count1=10;
//        System.out.print(n4+" "+n5);//printing 0 and 1
//        printFibonacci(count1-2);//n-2 because 2 numbers are already printed

    }
              //1    2    3
    static int n4=0,n5=1,n6=0;
    static void printFibonacci(int count){
        if(count>0) {
            n6 = n4 + n5;
            n4 = n5;
            n5 = n6;
            System.out.print(" " + n6);
            printFibonacci(count-1);

        }
        }
}
