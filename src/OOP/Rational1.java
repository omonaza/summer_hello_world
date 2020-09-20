package OOP;
      /*  Exercise 11.5 A rational number is a number that can be represented as
          the ratio of two integers. For example, 2/3 is a rational number, and you can
          think of 7 as a rational number with an implicit 1 in the denominator.








        9. Write an instance method called invert that inverts the number by
        swapping the numerator and denominator. It should be a modifier. Add
        lines to main to test the new method.*/

public class Rational1 {
//     1. Define a class called Rational. A Rational object should have two
//    integer instance variables that store the numerator and denominator.

    private int numerator;
    private  int denominator;
    private int sign;

//    2. Write a constructor that takes no arguments and that sets the numerator
//    to 0 and denominator to 1.
     public Rational1(){
         this.numerator= 0;
         this.denominator=1;
         this.sign = calculateSign();
     }
//     3. Write an instance method called printRational that displays a Rational
//    in some reasonable format.

     public String printRational (){
         return this.numerator +" / " +this.denominator;
     }

    public int getNumerator() {
        return numerator;
    }

    public void setNumerator(int numerator) {
        this.numerator = numerator;
    }

    public int getDenominator() {
        return denominator;
    }

    public void setDenominator(int denominator) {
        this.denominator = denominator;
    }
//    6. Write a toString method for Rational and test it using println.
//            7. Write a second constructor that takes two arguments and uses them to

    public String toString(){
         return numerator + " / " +denominator;
    }
//       7. Write a second constructor that takes two arguments and uses them to
//    initialize the instance variables.


    public Rational1(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
        this.sign=sign;
    }

    public int calculateSign() {
        double result = (double) this.numerator / (double) this.denominator;
        return result < 0 ? -1 : 1;
    }
//    8. Write an instance method called negate that reverses the sign of a ra-
//    tional number. This method should be a modifier, so it should be void.

    public void negate(){
        this.sign = -1 * calculateSign();
    }
//    9. Write an instance method called invert that inverts the number by
//    swapping the numerator and denominator. It should be a modifier. Add
//    lines to main to test the new method.*/

     public void revert () {
         int temp = this.numerator;
         this.numerator = this.denominator;
         this.denominator = temp;

     }
    public double toDouble(){
        return (double) numerator / (double) denominator;
    }

    public void addIntger(int number){
        this.numerator = this.numerator + (number * denominator);
    }

}
