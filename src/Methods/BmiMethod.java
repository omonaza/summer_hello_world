package Methods;

import java.util.Scanner;

public class BmiMethod {

     /*
    Male ideal body weight = 50 kilograms (110 lb) + 0.9 kilograms (2.0 lb) × (height (cm) − 152)
    Female ideal body weight = 45.5 kilograms (100 lb) + 0.9 kilograms (2.0 lb) × (height (cm) − 152)
    bmi = weight / (height)^2
    Anorexia 	    Less than 17.50
    Underweight 	                17.51-19.10 	17.501-20.70
    Ideal range 	                19.11-25.80     20.71-26.40
    Marginally overweight range 	25.81-27.30 	26.41-27.80
    Overweight range 	            27.31-32.30     27.81-31.10
    Very overweight or Obese range 	More than 32.30 	More than 31.10
  */
     public static void main (String [] args) {
         Scanner userInput = new Scanner(System.in);
         System.out.println("Please Enter your Gender in M and F ");
         String Gender = userInput.next();

         System.out.println("Please Enter Yor weight in Kg");
         double weight = userInput.nextDouble();

         System.out.println("Please enter your Height in cm  ");
         double height = userInput.nextDouble();


         double bmi = BmiCalculator(weight,height);
         System.out.println("Your BMI is " +bmi);
         makeSomeAdvise(bmi,Gender);

     }

     public static double BmiCalculator (double  weight , double height ) {
         double bmi = weight / (height * height);
         return bmi;
     }

     public static void makeSomeAdvise (double bmi,String Gender){
         switch (Gender){
             case "M":
             if (bmi <17.5)
                 System.out.println("Danger Anorexia");
             else if (17.501 <= bmi && bmi < 20.70)
                 System.out.println(" Underweight");
             else if (20.71 <= bmi && bmi < 26.40)
                 System.out.println(" Ideal range ");
             else if (26.41 <= bmi && bmi< 27.80)
                 System.out.println(" Marginally overweight range");
             else if (27.81 <= bmi && bmi < 31.10)
                 System.out.println("Overweight range ");
             else
                 System.out.println(" Very overweight or Obese range ");
             break;
             case "F":

                 if (bmi <17.5)
                     System.out.println("Danger Anorexia");
                 else if (17.51 <= bmi && bmi < 19.10)
                     System.out.println(" Underweight");
                 else if (19.11 <= bmi && bmi < 25.80)
                     System.out.println(" Ideal range ");
                 else if (25.81 <= bmi && bmi< 27.30)
                     System.out.println(" Marginally overweight range");
                 else if (27.31 <= bmi && bmi < 32.30)
                     System.out.println("Overweight range ");
                 else
                     System.out.println(" Very overweight or Obese range ");
                 break;
             default:
                 System.out.println("Not valid gender!");

         }
     }
}

