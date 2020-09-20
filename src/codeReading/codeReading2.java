package codeReading;

public class codeReading2 {
    public int searchValueOfArray(int[] array, int element){
        int a = -1;
        for (int i=0; i< array.length; i++) {
            if (array[i] == element) {
                a = element;
                break;
            }
        }
        return a;
    }

    public int findMinimum(int[] array){
        int min = array[0];
        for (int i = 0; i < array.length; i++){
            if (array[i] < min)
                min = array[i];
        }
        return min;
    }

    public int findingTheMaxOfArray (int [] arrayMax) {
        int max = arrayMax[0];
        for (int i =0;i < arrayMax.length;i++ ) {
            if (arrayMax[i] > max) {
                max = arrayMax[i];
            }
        }

        return  max;
    }

    public static void main(String[] args) {
        codeReading2 cr2 = new codeReading2();
        int[] array = {3,2,5,0};
        System.out.println("first try "+cr2.searchValueOfArray(array, -1));
        System.out.println("second try "+cr2.searchValueOfArray(array,0));
        System.out.println("the minimum value of "+cr2.findMinimum(array));
        System.out.println("the max value of " +cr2.findingTheMaxOfArray(array));
    }
}
