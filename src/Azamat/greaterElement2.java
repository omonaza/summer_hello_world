package Azamat;

import java.util.Arrays;
import java.util.Scanner;

public class greaterElement2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int arr[] = new int[size];
        for (int i = 0 ; i<size ; i++){
            arr[i] = scanner.nextInt();
        }
        System.out.println(Arrays.toString(getHeight(arr)));
    }
    public static int[] getHeight(int[] arr1){

        for (int i = 0; i< arr1.length-1;i++){
            for(int j = 0; j<arr1.length-i-1; j++){
                if (arr1[j]> arr1[j+1]){
                    int temp = arr1[j];
                    arr1[j] = arr1[j+1];
                    arr1[j+1] = temp;
                }
            }
            int n = Math.abs(arr1[i]-arr1[i+1]);
            if ( n !=1){
                arr1[i+1]-=n-1;
            }
        }
        return arr1;
    }

}
