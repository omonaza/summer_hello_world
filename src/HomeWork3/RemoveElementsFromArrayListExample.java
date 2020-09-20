package HomeWork3;

import java.util.function.Predicate;
import java.util.ArrayList;
import java.util.List;

public class RemoveElementsFromArrayListExample {
    public static void main(String[] args) {
        List<String> programmingLanguages = new ArrayList<>();
        programmingLanguages.add("C");
        programmingLanguages.add("C++");
        programmingLanguages.add("Java");
        programmingLanguages.add("Python");
        programmingLanguages.add("Perl");
        programmingLanguages.add("Ruby");
        programmingLanguages.add("Kotlin");
        System.out.println("Initial List: " + programmingLanguages);
        for (int i =0; i <programmingLanguages.size();i++){
            if (programmingLanguages.get(i).contains("Kotlin")){
                programmingLanguages.remove(i);
            }
        }
        System.out.println("remove \"Kotlin\" " +programmingLanguages);
        programmingLanguages.removeAll(programmingLanguages);
        System.out.println(programmingLanguages);
        programmingLanguages.clear();
        System.out.println("After clear "+programmingLanguages);


    }
}