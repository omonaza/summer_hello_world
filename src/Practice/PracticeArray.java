package Practice;

public class PracticeArray {
    public static int getlargest(int[] arr){
        int largest = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (largest < arr[i]) {
                largest = arr[i];
            }
            } //end for loop
            return largest;
    }

    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5,6};
        System.out.println(getlargest(arr));
    }
}
