package Azamat;

import java.util.Arrays;

public class BinarySearch {

    public static int binarySearch(int[] arr, int val) {
        int startIndex = 0;
        int endIndex = arr.length - 1;
        int midIndex = endIndex / 2;

        for (; startIndex <= endIndex; midIndex = (endIndex + startIndex) / 2) {
            if (arr[midIndex] == val)
                return midIndex;
            else {
                if (arr[midIndex] > val)
                    endIndex = midIndex - 1;
                else
                    startIndex = midIndex + 1;
            }


        }
        return -1;
    }

        public static void main (String[]args){

            int[] arr = {1, 2, 3, 4, 5, 6, 7, 8};

            System.out.println(binarySearch(arr, 1));


        }
    }
