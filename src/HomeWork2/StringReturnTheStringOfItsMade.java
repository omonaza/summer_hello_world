package HomeWork2;

public class StringReturnTheStringOfItsMade {
    public static String FirstTwoChar ( String Hello ) {
        int len = Hello.length();
        if (len < 2) {
            return Hello;
        } else {
            return Hello.substring(0, 2);
        }
    }
    public static void main(String[] args) {
         String word = FirstTwoChar("Hello");
         System.out.println("The fist two char are: " +word);





        // TheFirstTwoChar("HelloHowAreYou");
        // String word = "Hello";
        //  int length = word.length();
        // String word2 = word.trim();
        // String word3 = word.substring(0,1);
        //  System.out.println("The Length of Hello is  " + word.length());
        //   System.out.println("The Length of Hello with trim is " +word2.length());
        // System.out.println("The Length of Hello with trim is " +word.substring(0,1));

    }

     /*public static void TheFirstTwoChar(String Hello) {

        int len1 = Hello.length();
        if (len1 < 2) {
            System.out.println(Hello);
        } else {
            System.out.println(Hello.substring(0, 2));
        }
    }*/
}



