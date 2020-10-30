package javaPrograming;

public class PrimeExample {
   /* Prime number in Java: Prime number is a number that is greater than 1 and divided by 1 or itself only.
    In other words, prime numbers can't be divided by other numbers than itself or 1.
    For example 2, 3, 5, 7, 11, 13, 17.... are the prime numbers.

    Note: 0 and 1 are not prime numbers.
    The 2 is the only even prime number because all the other even numbers can be divided by 2.*/

    public static void main(String[] args) {
        int  m=0, flag=0;
        int n=1;//it is the number to be checked

        m=n/2;

        if(n==0||n==1){
            System.out.println(n + "is not a prime number");
        }else{
            for(int i = 2; i <= m; i ++){
                if(n % i == 0 ){
                    System.out.println(n+" is not prime number");
                    flag=1;
                    break;
                }
            }
            if(flag == 0){
                System.out.println(n + " is prime number");
            }
        }

      isPrimeNumber(1);
      isPrimeNumber(2);
      isPrimeNumber(3);
      isPrimeNumber(4);

    }


    public static void isPrimeNumber(int n ){
        int m = 0 , flag = 0;
        m = n /2;
        if(n == 0 || n == 1) {
            System.out.println(n + " is not a prime number");
        }else {
            for(int i = 2; i <= m ; i ++){
                if(n % i == 0){
                    System.out.println(n + " is not a prime number ");
                    flag = 1;
                    break;
                }
            }
            if(flag == 0){
                System.out.println(n + " is prime number ");
            }
        }

    }

}
