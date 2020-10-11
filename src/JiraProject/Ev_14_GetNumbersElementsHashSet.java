package JiraProject;

import java.util.HashSet;
import java.util.Scanner;

public class Ev_14_GetNumbersElementsHashSet {

    public static void main(String[] args) {
        // Creating an empty HashSet
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter teh size of set only numbers");
        int size  =  input.nextInt();
        HashSet<String> set = new HashSet<String>(size);

        for(int i = 0; i < size; i ++){
            System.out.println("Please enter the elements of set");
            String setElement = input.next();
            set.add(setElement);

        }

        System.out.println(set.toString());
        System.out.println("The size of the set is: " + set.size());


    }

}
