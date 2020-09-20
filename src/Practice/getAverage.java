package Practice;

public class getAverage {
    public static double getAverage(int[] arr){
        double sum = 0.0;
        for (int i =0; i <arr.length;i++){
              sum += arr[i];

        } return sum/arr.length;
    }


    public static void main(String[] args)
    {
        int[] arr = {20, 3, 18, 55, 4};
        System.out.println(getAverage(arr));;
    }
}
