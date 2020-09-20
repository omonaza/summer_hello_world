package HomeWork3;

public class TheFirst10NaturalNumbers {
    public static int NaturalNumbers (int counter) {
        System.out.println("The first 10 natural numbers are  ");
        for (counter=1; counter<10; counter++){
             System.out.println(counter);
        }
      return counter;
    }
    public static void main (String [] args ) {
        int natural = 0 ;
        System.out.println(NaturalNumbers(natural));

    }
}
