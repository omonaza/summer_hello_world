package HomeWork3;

public class IsPalindrome {
    public static void isPalindrome (String str){
        String reverse = "";
        int lenght = str.length();
       for (int i = lenght-1; i >= 0 ; i --){
           reverse+=str.charAt(i);
       }
       for (int i = 0; i >str.length() ;i++){
           str.charAt(i);
       }
       if (reverse.equals(str)){
           System.out.println("Palindrome");
       }else {
           System.out.println("not palindrome");
       }
    }

    public static void main(String[] args) {
        String palindrome = "LeveL";
        isPalindrome(palindrome);
        System.out.println(isPalindrome2(palindrome));

    }

    static boolean isPalindrome2(String str)  {

        int i= 0, j= str.length() - 1;
        while (i < j) {

            if (str.charAt(i)!=str.charAt(j))

            return false;

            ++i;
            --j;
        }

        return true;
    }

}
