package HomeWork3;

import java.util.ArrayList;
import java.util.Arrays;

public class CreateArrayListExample {
    public static void main(String[] args) {
        ArrayList<String> animals = new ArrayList<>();
        animals.add("Lion");
        animals.add("tiger");
        animals.add("cat");
        animals.add("dog");
        System.out.println(animals);
        animals.set(3," Elephant");
        System.out.println(animals);

    }
}
