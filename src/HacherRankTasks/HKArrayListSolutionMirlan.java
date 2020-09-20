package HacherRankTasks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class HKArrayListSolutionMirlan {

    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        List<Integer[]> lines = new ArrayList<>();

        Integer numberOfLines = userInput.nextInt();

        for (int i = 0; i < numberOfLines; i++) {
            int sizeOfAnArray = userInput.nextInt();
            Integer[] tempArray = new Integer[sizeOfAnArray];
            for (int j = 0; j < sizeOfAnArray; j++) {
                tempArray[j] = userInput.nextInt();
            }
            lines.add(tempArray);


        }

        Integer numberOfQueries = userInput.nextInt();
        for (int i = 0; i < numberOfQueries; i++) {
            int x = userInput.nextInt() - 1;  // --> which element of arraylist (array)
            int y = userInput.nextInt() - 1;  // --> which element of an array

            if (x < lines.size()) {
                Integer[] array = lines.get(x);
                if (y < array.length)
                    System.out.println(array[y]);
                else
                    System.out.println("ERROR!");
            } else {
                System.out.println("ERROR!");
            }
        }


    }
}