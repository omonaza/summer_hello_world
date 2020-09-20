package HomeWork2;

public class NoticingEvenNumbers {

    public static int NoticingEvenNumbers ( int counter ) {

        for (counter = 1 ; counter <=20 ; counter++) {
            if (counter % 2 == 0) {
                System.out.println( counter + " <--");
            } else {
                System.out.println( counter );
            }
        } return counter;
    }


    public static void main ( String [] args ) {
        int counter = 0;
        int result = NoticingEvenNumbers(counter);
        System.out.println(result);

    }

}
