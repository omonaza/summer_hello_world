package Azamat;

public class sumUpDigitsInString {
    public static void main(String[] args) {
      String original = "ads12dsf12";
        System.out.println(sumUpDigitsInString(original));

    }

    public static int sumUpDigitsInString(String original){
        int sum = 0;
        for(int i = 0; i <original.length();i++){
            char ch = original.charAt(i);
            if(Character.isDigit(ch)){
                sum+=Integer.parseInt(original.charAt(i)+"");
            }
        }
        return sum;
    }
}
