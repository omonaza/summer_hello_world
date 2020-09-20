package HomeWork3;

public class commonElements {
    public void printIntArray(int[] numberArray){
        for (int i = 0; i < numberArray.length; i++){
            System.out.println("["+i+ "]  = "+numberArray[i]);
        }
    }

    public static void main(String[] args) {

        commonElements cm = new commonElements();
        int [] array1 = {1,5,3};
        int [] array2 = {1,5,2};
        System.out.println("Array1");
       cm.printIntArray(array1);
        System.out.println("array2");
       cm.printIntArray(array2);

       for (int i = 0; i <array1.length;i++) {
           for (int j = 0 ; j < array2.length;j++){
               if (array1[i] == array2[j]){
                   System.out.println("the common element is " +array1[i]);


               }

           }
       }

    }
}
