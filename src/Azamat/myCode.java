package Azamat;

public class myCode {
    public static void main(String[] args) {
        System.out.println(maxPossible(276, 3));
        System.out.println(maxPossible(0, 3));
        System.out.println(maxPossible(860, 7));
    }

    public static int maxPossible(int num, int digit) {
        if (num == 0) {
            return num * 10;
        }
        int negative = num / Math.abs(num);
        num = Math.abs(num);
        int max = Integer.MIN_VALUE;
        int counter = 0;
        int position = 1;
        while (num > 0) {
            counter++;
            num = num / 10;
        }
        for (int i = 0; i <= counter; i++) {
            int newVal = ((num / position) * (position * 10) + (digit * position) + (num % position));
            if (newVal * negative > max) {
                max = newVal * negative;
            }
            position = position * 10;
        }
        return max;
    }
}
