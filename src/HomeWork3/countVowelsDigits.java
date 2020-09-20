package HomeWork3;

public class countVowelsDigits {
    public static void countCharVowelsAndDigits(String str) {
        int vowel = 0, digit = 0, specialChar = 0;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if ((ch>='a'&&ch<='z') || (ch>='A'&& ch<='Z')){

                ch = Character.toLowerCase(ch);

               if (ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
                   vowel++;
               }
            } else if (ch>='0'&&ch<='9'){
                digit++;
            }else {
                specialChar++;
            }
        }
        System.out.println("vowels in the String are" +vowel);
        System.out.println("Digits in the String are" +digit);
        System.out.println("Special char in the String are" +specialChar);
    }
    public static void main(String[] args) {
        String testing = "testing12345@@$";
        countCharVowelsAndDigits(testing);
    }
}
