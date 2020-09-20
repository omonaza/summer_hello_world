package sessions.multi_dimensional_arrays;
import java .util.Random;
import java .util.Arrays;
public class Arrays2dExcs {

    public int[] calculateMultiDSumNestedLoops(int[][] arrayMD){
        int[] sums = new int[arrayMD.length];
        for (int i = 0; i < arrayMD.length; i++){
            int sum = 0;
            for (int j = 0; j < arrayMD[i].length; j++) {
                sum += arrayMD[i][j];
                System.out.println("["+i+"]-["+j+"] -> "+ arrayMD[i][j]);
            }
            System.out.println("here sum is "+sum);
            sums[i] = sum;
        }
        return sums;
    }
    public int calculate1DArraySum(int[] array){
        int sum = 0;
        for (int i = 0; i < array.length; i++)
            sum += array[i];

        return sum;
    }
    public int[] calculateMultiDSum(int[][] arrayMD){
        int[] sums = new int[arrayMD.length];
        for (int i = 0; i < arrayMD.length; i++){
            sums[i] = calculate1DArraySum(arrayMD[i]);
        }
        return sums;
    }
    public static void main(String[] args){
        Random rndm = new Random();
        Arrays2dExcs arrays2dExcs = new Arrays2dExcs();
        int [][] array2d = new int[3][4];
        System.out.println("The length of this array is "+array2d.length);
        System.out.println("the depth of this array is "+array2d[0].length);

        for (int i = 0; i < array2d.length; i++){
            for (int j = 0; j< array2d[0].length; j++){
                array2d[i][j] = rndm.nextInt(100);
            }
        }

        /*for (int i = 0; i < array2d.length; i++){
            for (int j = 0; j< array2d[0].length; j++){
                System.out.println("["+i+"]-["+j+"] -> "+ array2d[i][j]);
            }
        }*/

        for (int i = 0; i < array2d.length; i++){
            System.out.println("["+i+"] -> "+ Arrays.toString(array2d[i]));
        }

        int[] sumofArray2d = arrays2dExcs.calculateMultiDSum(array2d);
        int[] sumofArray2dNestedLoop = arrays2dExcs.calculateMultiDSumNestedLoops(array2d);
        System.out.println("The sum of 2d array is "+ Arrays.toString(sumofArray2d));
        System.out.println("The sum of 2d array by nested loops is "+ Arrays.toString(sumofArray2dNestedLoop));



    }
}
