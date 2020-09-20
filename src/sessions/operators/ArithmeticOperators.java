package sessions.operators;

public class ArithmeticOperators {

      // Arithmetic operators will help us to do math in java
      // add two numbers etc
    public static void main (String [] args) {

          // add two numbers and gives me the result
          // hardcoding- giving the exact values in output
         System.out.println("Addition");
        System.out.println(10+15);
        System.out.println(1000+332); // this is a hard coding.
        System.out.println(10+""+15 ); // be careful about the double quotes, within the quotes

         // Subtraction/ minus
         System.out.println("Sabtraction");
         System.out.println(160-60); // 100
         System.out.println(2000-200); // 1800

          // Multiplication
        System.out.println("Multiplication");
         System.out.println(300*20); //6000
         System.out.println(1*2003); // 2003

        // Division
        System.out.println("Division");
        System.out.println(1400 / 2); // 700
        System.out.println(333 / 3); // 111

        //Modulo---- gives me the REMAINDER of my division

         System.out.println("Modulo");
         System.out.println(10%2 ); // 0
         System.out.println(12%3); // 0
         System.out.println(55%2); // 1
         System.out.println(44%3);  // 2

         System.out.println(56%20); // 16
        // Even number ----* a number that is divisible by 2 without any remainder
        // Even numbers are 0 , 2 , 4 , 6 , 8 .
        // odd number ---* a number that is not divisible by 2,when divided result will have remainder
        // odd numbers are  1, 3, 5 , 7, 9 ,

         System.out.println(42%2);//42 is even number bc remainder is 0 and we r dividing by 2
         System.out.println(43%2);//43 is an odd number bc we r dividing it by 2 , and getting remainder as 1
         System.out.println("How do i find the percentage if % is modulo");
                // again be careful about the quotes bc they make number as String(text)
               // Find the 12% discount of 100$ item
         System.out.println(100*12 / 100);
              //find the 20% discount of 3000$ item
         System.out.println(3000 * 12 / 100);
             // find the 75% discount of 400$ item
         System.out.println(400 * 75 / 100);


         System.out.println("Azamat"+10+15);

    }
}
