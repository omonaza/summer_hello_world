package codingBat;

public class minCat {
    public static void main(String[] args) {
        String a = "Hello";
        String b = "java";

        if (a.length() == b.length())
            System.out.println(a + b);

        if (a.length() > b.length()) {

            int diff = a.length() - b.length();

            System.out.println(a.substring(diff, a.length()) + b);


        } else {

            int diff = b.length() - a.length();

            System.out.println(a + b.substring(diff, b.length()));

        }
        int diff1 = b.length() - a.length();
        System.out.println( b.length() - a.length());
       // System.out.println(a + b.substring(diff1, b.length()));
        int diff = a.length() - b.length();
        System.out.println(a.length() - b.length());
        System.out.println(a.substring(diff, a.length()) + b);
    }

}

