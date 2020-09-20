package HomeWork3;

import java.util.Scanner;

public class SumAverageRunningInt {
    public static int SumRunningInt() {
        Scanner userInput = new Scanner(System.in);
        System.out.println("Please enter numbers in order ");
        int start = userInput.nextInt();
        int end = userInput.nextInt();

        int result = 0;
        for (int counter = start; counter <= end; counter++) {
            result += counter;
        }
        return result;

    }

    public static void main(String[] args) {
        int counter = 0;
        while (counter < 3) {
            System.out.println(SumRunningInt());
            counter++;
        }
    }
}
