package homeworks;


public class TheSumOfTheDigits {

    public static void main(String[] args) {

       int num = 25 ;

       int sum = num % 10 ;
       int sum1 = num / 10 ;
       int sum3 = sum + sum1;



       System.out.println("The sum of the digits is " +sum3);

    }
}
