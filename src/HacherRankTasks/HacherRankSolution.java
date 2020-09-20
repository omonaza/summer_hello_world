package HacherRankTasks;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class HacherRankSolution {

    public static void main(String[] args){
        Scanner userInput = new Scanner(System.in);
        List<Integer> numberList = new ArrayList<>();
        Integer listSize = userInput.nextInt();
        for (int i = 0; i < listSize; i++){
            numberList.add(userInput.nextInt());
        }
        Integer numberOfQueries = userInput.nextInt();
        while (numberOfQueries > 0) {
            String query = userInput.next();
            if (query.toLowerCase().equals("delete")) {
                int index = userInput.nextInt();
                numberList.remove(Math.abs(index));
            }
            if (query.toLowerCase().equals("insert")) {
                int index = userInput.nextInt();
                int element = userInput.nextInt();
                numberList.add(Math.abs(index), element);
            }
            numberOfQueries--;
        }
        for (Integer element: numberList){
            System.out.print(element+" ");
        }


    }


}
