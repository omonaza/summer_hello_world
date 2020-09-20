package sessions.ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ListExercises1 {
    public static void main(String[] args) {
        String[] cities = {"Chicago", "NY", "SF", "London", "Johannesburg",
                "Bishkek", "Almaty", "NY", "Almaty", "London", "NY"};
        List<String> listOfCities = Arrays.asList(cities);
        System.out.println("initial " + listOfCities.toString());

        int frequencuOfNY = Collections.frequency(listOfCities, "NY");
        System.out.println("NY has been inserted " + frequencuOfNY + " times");


        for (int i = 0; i < listOfCities.size(); i++) {
            System.out.println("Frequency of " + listOfCities.get(i) +
                    " = " + Collections.frequency(listOfCities, listOfCities.get(i)));
        }


        Integer[] points = {50, 78, 17, 100, 99};
        int[] f = {1, 2, 3, 4};


        List<Integer> pointsList = Arrays.asList(points);
        for (int i = 0; i < f.length; i++)
            pointsList.add(f[i]);

        System.out.println(Collections.min(pointsList));
        System.out.println(Collections.max(pointsList));


    }
}
