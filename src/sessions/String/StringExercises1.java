package sessions.String;

public class StringExercises1 {

    public static void main(String[] args) {
        int apples = 10;
        int bananas = 9;
        String appleName = "Apples";
        String bananaName = new String("Bananas");

        String sentence1 = "I have an " + appleName + " and " + " amount of apples is " + apples;
        String sentence2 = "I have  " + bananaName + " and " + "  the amount of banana is " + bananas;
        String sentence3 = "The total amount of both is " + (apples + bananas) + " of " + appleName + " and " + bananaName;
        // bellow example is not a calculation, it's concatenation,so be careful with concat and math.
        String sentence4 = "The total amount of both is " + apples + bananas + " of " + appleName + " and " + bananaName;
        System.out.println(sentence1);
        System.out.println(sentence2);
        System.out.println(sentence3);
        System.out.println(sentence4);

        System.out.println("The length of sentence1 is " + sentence1.length());

        char someCharacter = bananaName.charAt(0);
        char lastChar = bananaName.charAt(bananaName.length() - 1);
        System.out.println(someCharacter);
        System.out.println(lastChar);

        String bagOfWords = "balljkicountryiuyucakelllballllllcake";
        String cake = bagOfWords.substring(18, 22);
        String country = bagOfWords.substring(7, 14);
        String ball = bagOfWords.substring(0, 4);
        System.out.println("The cake is " + cake);
        System.out.println("The country is " + country);
        System.out.println("The ball is " + ball);

        System.out.println(country.concat(cake.concat(ball))); // country+cake+ball
        System.out.println("The index of c " + bagOfWords.indexOf("c"));
        System.out.println("The index of word " + bagOfWords.indexOf("country"));

        String someS = "June06July07August08";
        int myIndex = someS.indexOf('A');
        String august = someS.substring(12, 18);
        System.out.println(myIndex);
        System.out.println("August is " + august);

        System.out.println("The index of ball " + bagOfWords.indexOf(ball, 3));
        System.out.println("The index of cake " + bagOfWords.indexOf(cake, 25));
        System.out.println("The index of 1 " + bagOfWords.indexOf('1'));

        String month09 = new String("September");
        String month09_1 = new String("September");

        System.out.println("September equals to september " + (month09.equals(month09_1)));
        System.out.println("September == to september " + (month09 == month09_1));


        String peach = "PEACh"; //peach
        String peachObject = new String("peach");
        String peach_2 = "Peach";

        System.out.println("The peach equals to peachObject " + peach.equals(peachObject));
        System.out.println("The peach == to peach " + peach == peach_2);
        System.out.println("The peach equals to peach " + peach.equals(peach_2));
        System.out.println("Compare with ignore case " + peach.equalsIgnoreCase("peach"));

        if (month09.equals(month09_1)) {
            System.out.println("September is a September");
        } else {
            System.out.println("September is not September ");
        }

        // look at the differences of output

        if (month09 == month09_1) {
            System.out.println("September is a September");
        } else {
            System.out.println("September is not September ");
        }

        System.out.println("some text to upper case ".toUpperCase());
        System.out.println("SOME TEXT TO LOWER CASE ".toLowerCase());

        String userName = "      UserName";
        String password = "password";
        System.out.println(userName.length() +"-----> length of userName before the trim ");
        System.out.println(userName.trim().length() + "------> The length of userName after the trim");

       System.out.println("Banana " .replace('a' , 'o'));


       System.out.println(someS.trim().toLowerCase().substring(12,18).toUpperCase());


       // this is about ASSKI table
       int someValue1 = 65;
       char someChar = (char) someValue1;
       int intValueOfB = (int)'B';

        System.out.println(someChar);
        System.out.println(someValue1);
        System.out.println(intValueOfB);



    }
}
