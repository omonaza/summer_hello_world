package sessions.multi_dimensional_arrays;
import java.util.Arrays;
import java.util.Random;
public class AraysExcsWithUtility {

        public static void main(String[] args) {
            AraysExcsWithUtility  ase = new AraysExcsWithUtility();

            int[] array = {10, 11, 7, 1, 0, 9, 2};

            String[] bookShelf = {"4book1", "3book2", "2book3", "1Book4"};
            Arrays.sort(bookShelf);
            System.out.println(Arrays.toString(bookShelf));
            System.out.println("binary search result:" + Arrays.binarySearch(bookShelf, "2book3"));

            System.out.println("Array before the sorting!");
            System.out.println(Arrays.toString(array));
            System.out.println("Array after the sorting!");
            Arrays.sort(array);
            System.out.println(Arrays.toString(array));
            ase.shuffle(array);
            System.out.println("Array after shuffle");
            System.out.println(Arrays.toString(array));
            System.out.println("\n");
            ase.overwrite(array, 11);
            System.out.println(Arrays.toString(array));
        }

        public void sort(int[] array) {
            for (int i = 0; i < array.length; i++) {
                for (int j = i; j < array.length; j++) {
                    if (array[i] > array[j]) {
                        swap(array, i, j);
                    }
                }
            }
        }

        public void swap(int[] array, int srcIndex, int destIndex) {
            int temp = array[srcIndex];
            array[srcIndex] = array[destIndex];
            array[destIndex] = temp;
        }

        public void printIntArray(int[] numberArray) {
            for (int i = 0; i < numberArray.length; i++) {
                System.out.println("[" + i + "]  = " + numberArray[i]);
            }
        }

        //Write a Java program to shuffle a given array of integers. [1,2,3,4] -> [2,1,4,3]
        public void shuffle(int[] array) {
            Random random = new Random();

            for (int i = 0; i < array.length; i++) {
                int a = random.nextInt(array.length);
                int b = random.nextInt(array.length);
                swap(array, a, b);
            }
        }

        // Write a Java program to insert 0 into some specific value
        public void overwrite(int[] array, int element) {
            for (int i = 0; i < array.length; i++) {
                if (array[i] == element) {
                    array[i] = 0;
                }
            }
        }
    }
