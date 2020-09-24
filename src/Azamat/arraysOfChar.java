package Azamat;

public class arraysOfChar {
    public static void main(String[] args) {

        char chars[] = {'a', 'd', 'e', 'i', 'k', 'n', 'V', 'v'};
        char moves[] = {6, 5, 4, 3, 10, 4, 5, 3, 5, 3, 1, 7};

        int j = 0;// 0,6,
        for (char move : moves) {

            j += move; //6,
            j %= chars.length; //2
            System.out.print(chars[j]);
        }
    }
}