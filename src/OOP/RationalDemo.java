package OOP;

public class RationalDemo {

    public static void main(String[] args) {
//        4. Write a main method that creates a new object with type Rational, sets
//        its instance variables to some values, and displays the object.
      Rational1 rational1 = new Rational1();
      rational1.setNumerator(2);
      rational1.setDenominator(3);
        System.out.println(rational1.printRational());
        System.out.println(rational1.toString());


        rational1.setDenominator(-7);
        System.out.println(rational1.toString());
        System.out.println("sign check "+ rational1.getNumerator()/rational1.getDenominator()+ " "+rational1.calculateSign());

    }
}
