package javaPrograming;

import java.util.Scanner;

public class PrimeExample2 {
    public static boolean isPrime(int n){
        if(n <= 1){
            return false;
        }
       for(int i = 2; i < Math.sqrt(n); i ++){
           if(n % i == 0){
               return false;
           }
       }
      return true;
    }

    public static void main(String[] args) {
        Scanner scanner =  new Scanner(System.in);
        System.out.println("Please enter first number ");
        int start = scanner.nextInt();
        System.out.println("Please enter second number ");
        int end = scanner.nextInt();
        System.out.println("List of prime numbers between " + start + " and " + end);

        for(int i = start; i <=end; i ++){
            if(isPrime(i)){
                System.out.println(i);
            }

        }

//        if(isPrime(n)){
//            System.out.println(n + " is a prime number");
//        }else {
//            System.out.println(n +  " is not a prime number ");
//        }


    }
}
