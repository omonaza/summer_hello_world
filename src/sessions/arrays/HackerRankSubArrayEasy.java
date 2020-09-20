package sessions.arrays;

public class HackerRankSubArrayEasy {
    //1. calculate the sub arrays :Done
    //2. calculate the sum of sub arrays: Done
    //3. decide if the sum is negative or positive

    public static void main(String[] args){
        int[] a = {1, -2, 4, -5, 1};

        int counter = 0;
        for(int i = 0; i < a.length; i++){
            for(int j = i; j < a.length; j++){
                printSubArray(a, i, j);
                int subArraySum = calculate1DArraySum(a, i, j);
                if (subArraySum < 0){
                    counter++;
                }
                System.out.println("The sum of sub array starts at "+i+" ends at "+j+"="+subArraySum);
                System.out.println();
            }
        }
        System.out.println("The number of sub arrays with negative sum is "+counter);
    }

    public static void printSubArray(int[] array, int start, int end){
        for (int i = start; i<= end; i++){
            System.out.print(array[i]+" ");
        }
    }

    public static int calculate1DArraySum(int[] array, int start, int end){
        int sum = 0;
        for (int i = start; i <= end; i++)
            sum += array[i];

        return sum;
    }
}
