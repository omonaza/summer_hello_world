package javaPrograming;

public class factorialNumber {
//    Factorial Program in Java:
//    Factorial of n is the product of all positive descending integers.
//    Factorial of n is denoted by n!. For example:
//
//            4! = 4*3*2*1 = 24
//            5! = 5*4*3*2*1 = 120
//    Here, 4! is pronounced as "4 factorial", it is also called "4 bang" or "4 shriek".
//    The factorial is normally used in Combinations and Permutations (mathematics).

    public static void main(String[] args) {
        int fact = 1;
        int number = 5;
        for(int i = 1; i <= number; i ++){
          fact= fact * i; //
        }
        System.out.println("Factorial of "+number+" is: "+fact);


//======================================================================================================================================================


        int factorialNum = 1;
        int number1 = 4 ; // It is the number to calculate factorial

        factorialNum = factorial(number1);
        System.out.println("Factorial of "+number1+" is: "+factorialNum);
    }

    public static int factorial(int n){
        if(n == 0){
            return 1;
        }else {
            return(n * factorial(n-1));
        }
    }
}
