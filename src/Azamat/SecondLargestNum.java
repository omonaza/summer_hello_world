package Azamat;

import java.util.Arrays;

public class SecondLargestNum {

    public static void main(String[] args) {
        int[] num = {1, 33, 78, 654, 8};

        System.out.println(findSecondLargestNum(num));
        System.out.println(findSecondLargestNum2(num));
    }

    public static int findSecondLargestNum(int[] num) {
        int max = 0;

        for (int i = 0; i < num.length; i++) {
            for (int j = i + 1; j < num.length; j++) {
                if (num[i] > num[j]) {
                    max = num[i];
                    num[i] = num[j];
                    num[j] = max;
                }
            }

        }


        return num[num.length - 2];
    }

    public static int findSecondLargestNum2(int[] num) {
        Arrays.sort(num);
        return num[num.length - 3];
    }
}
