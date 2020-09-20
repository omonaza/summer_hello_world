package sessions.arrays;
import java.util.ArrayList;
import java.util.Random;
public class ExercisesArrayList {


    public static void main(String[] args) {
        ArrayList list = new ArrayList();

        list.add(0.9);
        list.add(true);
        list.add("Help");

        //int -> primitive data type
        //Integer -> object type of Int , Double, Float, String

        String[] cities = {"Chicago", "NY", "SF", "London", "Johannesburg", "Bishkek", "Kazakhstan"};
        ArrayList<Integer> list1 = new ArrayList();

        ArrayList<String> listOfCities = new ArrayList<>();
        for (int i = 0; i <cities.length; i++ ) {
            listOfCities.add(cities[i]);
        }


        System.out.println(listOfCities.toString());

        listOfCities.set(6, "Almaty");
        System.out.println(listOfCities.toString());
        System.out.println(listOfCities.remove(6));
        System.out.println(listOfCities.remove("Kazakhstan"));
        System.out.println(listOfCities.toString());

        System.out.println(listOfCities.contains("Dubai"));
        System.out.println(listOfCities.contains("Chicago"));
        Random rnd = new Random();

        System.out.println("initial size "+list1.size());
        for (int i = 0; i < 100; i++){
            list1.add(rnd.nextInt(100));
            // System.out.println("current size "+list1.size());
        }

        int a = list1.get(1) + list1.get(5);

        System.out.println("size of the list is "+list1.size());

    }
    }

