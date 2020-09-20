package HacherRankTasks;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class HackerRankSolutionSwitch {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        List<Integer> numberList = new ArrayList<>();
        Integer listSize = userInput.nextInt();
        for (int i = 0; i < listSize; i++) {
            numberList.add(userInput.nextInt());
        }
        Integer numberOfQueries = userInput.nextInt();
        while (numberOfQueries > 0) {
            String query = userInput.next();
            switch (query.toLowerCase()) {
                case "delete":
                    int index = userInput.nextInt();
                    numberList.remove(Math.abs(index));
                    break;
                case "insert":
                    int indexInsert = userInput.nextInt();
                    int element = userInput.nextInt();
                    numberList.add(Math.abs(indexInsert), element);
                    break;
                case "add":
                    int elementAdd = userInput.nextInt();
                    numberList.add(0, elementAdd);
                    break;
                default:
            }
            numberOfQueries--;
            for (Integer element : numberList) {
                System.out.print(element + " ");
            }


        }


    }
}