package Practice;

public class getSumOfChar {
    public static int getSumChars(String[] strArr){
        int sumOfChars = 0;
        for (int i =0; i <strArr.length;i++){
            sumOfChars+=strArr[i].length();
        }
        return sumOfChars;

    }

    public static void main(String[] args)
    {
        String[] strArr = {"hi", "bye", "hola"};
        System.out.println(getSumChars(strArr));
    }
}
