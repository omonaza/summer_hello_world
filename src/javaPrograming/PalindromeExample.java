package javaPrograming;

import java.util.Scanner;

public class PalindromeExample {
//    Palindrome number in java:
//    A palindrome number is a number that is same after reverse.
//    For example 545, 151, 34543, 343, 171, 48984 are the palindrome numbers.
//    It can also be a string like LOL, MADAM etc.

//    Palindrome number algorithm
//    Get the number to check for palindrome
//    Hold the number in temporary variable
//    Reverse the number
//    Compare the temporary number with reversed number
//    If both numbers are same, print "palindrome number"
//    Else print "not palindrome number"


    public static void main(String[] args) {
        int PalindromeNum = 454;
        int sum = 0;
        int reminder;

        int temp = PalindromeNum;

        while (PalindromeNum > 0){
            reminder = PalindromeNum % 10 ;
            sum = (sum*10)+ reminder;
            PalindromeNum = PalindromeNum /10;
        }
        if(temp == sum){
            System.out.println(" Palindrome number");
        }else {
            System.out.println("Not a palindrome ");
        }
          PalindromeExample2();
        }

        public static void PalindromeExample2(){
            Scanner scanner =  new Scanner(System.in);
            System.out.println("Enter a string/number to check if it is a palindrome");
            String str = scanner.nextLine();
            String reverse = "";

            for(int i =  str.length()-1; i >=0 ; i --) {
                reverse = reverse + str.charAt(i);
            }

                if(str.equals(reverse)){
                    System.out.println("Entered string/number is a palindrome.");
                }else {
                    System.out.println("Entered string/number isn't a palindrome.");
                }


        }
}

