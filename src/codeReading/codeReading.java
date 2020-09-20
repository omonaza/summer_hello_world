package codeReading;

public class codeReading {
    public double calculateAverage(double[] array){

        double result = calculateSum(array) / array.length;
        return result;
    }

    public double calculateSum(double[] array){
        double sum = 0.0;

        for (int i = 0; i < array.length; i++){
            sum += array[i];
        }
        return sum;
    }

    public static void main(String[] args) {
        codeReading cd = new codeReading();
        double [] array = {1.0, 2.0, 3.0, 4.0};
        System.out.println("the average of arrays is " +cd.calculateAverage(array));
        System.out.println("The sum od arrays is " +cd.calculateSum(array));

        Integer s2 = 400;
        short s1 = 200;
        long s3 = (long) s1 + s2;

        System.out.println(s3);
    }
}
