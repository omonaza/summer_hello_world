package sessions.arrays;

public class sortingArray2 {
    public void printIntArray(int[] numberArray){
        for (int i = 0; i < numberArray.length; i++){
            System.out.println("["+i+ "]  = "+numberArray[i]);
        }
    }

    public void swap(int[] array, int srcIndex, int destIndex){
        int temp = array[srcIndex];    // array [srcIndex] is free now;
        array[srcIndex] = array[destIndex]; //
        array[destIndex] = temp;
    }




    public void sort(int[] array){
        for (int i=0; i < array.length; i++){
            for(int j = i; j < array.length; j++){
                if (array[i] > array[j]) {
                    swap(array, i, j);
                }
            }
        }

    }

    public static void main(String[] args){

        sortingArray2 ase = new sortingArray2();
        int[] array = { 10, 11 ,7, 1, 0, 9, 2};
        System.out.println("Array before the soring!");
        ase.printIntArray(array);
        System.out.println("Array after the soring!");
        ase.sort(array);
        ase.printIntArray(array);

    }
}
