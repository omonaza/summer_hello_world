package sessions.String;

public class StringExercises2 {
    public static String halfOfIt(String stringInput) {

        return stringInput.substring(0, stringInput.length() / 2);
    }

    public static String OtherHalfOfIt (String stringInput) {
        return stringInput.substring(stringInput.length()/2,stringInput.length());
    }

    public static void main(String[] args) {
        String sunday = "Sunday";
        String monday = "Monday";
        // sunday = "Tuesday";

        String s4 = sunday.concat("Sunday").toUpperCase(); // SundaySunday
        System.out.println(sunday);
        System.out.println(s4);

        System.out.println("half is : "+halfOfIt("Java is an island!")+" other haf is "+OtherHalfOfIt("Java is an island!"));
        System.out.println(halfOfIt("Wednesday"));
    }
}
