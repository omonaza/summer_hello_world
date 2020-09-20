package Practice;

public class getSumOfNonNegative {
    public static int getSumNonNeg(int[] arr){
        int somOFNonNegative = 0;
        for (int i = 0; i < arr.length;i++){
            if (arr[i]>=0){
                somOFNonNegative+=arr[i];
            }
        } return somOFNonNegative;
    }


    public static void main(String[] args)
    {
        int[] a1 = {1, 2, 5, 3, -1, -20};
        System.out.println("The code should print 11 " +
                "and your answer is: \n" + getSumNonNeg(a1));
    }
}
