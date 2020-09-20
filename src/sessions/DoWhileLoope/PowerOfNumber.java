package sessions.DoWhileLoope;

public class PowerOfNumber {
    public static long PowerOfNum() {
        long num = 3;
        int power = 4;
        int result = 1;
        for (int counter = 1; counter <= power; counter++) {
            result *= num;
        }
        return result;
    }


    public static void main(String[] args) {
        String word = "DevXSchool";
        StringBuilder reverseWordBuilder = new StringBuilder();
        for ( int counter = word.length()-1; counter >=0; counter-- ) {
            reverseWordBuilder.append( (word.charAt(counter)));
        }
            System.out.println(reverseWordBuilder.toString());



        System.out.println("power of 2 is " + PowerOfNum());
    }


}