package sessions.WhileLoop;

public class WhileLoopExercises1 {
    public static int isEvenOdd (int number ) {
        int result;
        if (number % 2 == 0 ) {
            System.out.println(number + " is an even ");
        }else {System.out.println(number +"  an odd ");
        } return number;

    }
    public static int SumOfNumbersInRange (int start , int end) {
        int result = 0;
        int counter = start;
        while (counter <= end) {
            result = result + counter;
            counter++;
        }
        return result;
    }


    public  static void main ( String [] args ) {
       /* System.out.println(1);
        System.out.println(2);
        System.out.println(3);
        System.out.println(4);
        System.out.println(5);
        System.out.println(6);
        System.out.println(07);
        System.out.println(8);
        System.out.println(9);
        System.out.println(10);*/
        int counter = 0;
        while (counter <=10 ) {
            System.out.println(counter);
            counter++; // counter = counter +1 ;
        }

        int counter1 = 20 ;
        while (counter1 <= 0) {
            isEvenOdd(counter1);
            counter1--;
        }


        int start = 5 ;
        int end = 10 ;
        int result = SumOfNumbersInRange(start , end);
        System.out.println("The sum numbers in range " +start + " and " +end + " = " +result );



    }
}
