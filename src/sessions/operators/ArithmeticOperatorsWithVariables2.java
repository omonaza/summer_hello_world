package sessions.operators;

public class ArithmeticOperatorsWithVariables2 {
     // i want to calculate car age
    // Values i need; car year , currentYear
    public static void main (String [] args ) {
         int currentYear = 2020;
         int carYear = 2018;
         // Variables that reuse previously defined variables are more flexible
         int carAge = currentYear - carYear;
         System.out.println(carAge);




    }
}
