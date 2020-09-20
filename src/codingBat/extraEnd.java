package codingBat;

public class extraEnd {
    public static void main(String[] args) {
        String str = "Hello";
        String end = str.substring(str.length()-2);
        String result = end.concat(end).concat(end);
        System.out.println(result);

    }
}
