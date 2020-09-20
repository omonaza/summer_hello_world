package codingBat;

public class firstTwo {
    public static void main(String[] args) {
        String str = "Hello";
        int len = str.length();
        if (len < 2) {
            System.out.println(str);
        } else {
            System.out.println(str.substring(0,2));
        }

        System.out.println(str.substring(0,2));
        System.out.println(str.substring(str.length()-2,str.length()));
    }
}
