package Azamat;

import java.util.*;
import java.util.stream.Collectors;

public class JavaStream {
    public static void main(String[] args) {

        List<Integer> number = Arrays.asList(2, 3, 4, 5);

        List<Integer> square = number.stream().map(x -> x * x).
                collect(Collectors.toList());
        System.out.println(square);


        List<String> strings = Arrays.asList("abc", "", "bc", "efg", "abcd", "", "jkl");
        List<String> filtered = strings.stream().filter(string -> !string.isEmpty()).collect(Collectors.toList());
        System.out.println(filtered);
        System.out.println("============================================================================================");
        List<Integer> numbers = Arrays.asList(3, 2, 2, 3, 7, 3, 5);
        //get list of unique squares
        List<Integer> squaresList = numbers.stream().map(i -> i * i).distinct().collect(Collectors.toList());
        System.out.println(squaresList);
        System.out.println("=========================================================================");

        List numbers1 = Arrays.asList(3, 2, 2, 3, 7, 3, 5);

        IntSummaryStatistics stats = numbers.stream().mapToInt((n) -> n).summaryStatistics();

        System.out.println("Highest number in List : " + stats.getMax());
        System.out.println("Lowest number in List : " + stats.getMin());
        System.out.println("Sum of all numbers : " + stats.getSum());
        System.out.println("Average of all numbers : " + stats.getAverage());

        System.out.println("======================================================");

        int[] arr = {1, 50, 100, 99, 88, 76, 56};
        IntSummaryStatistics computeAllNumbers = Arrays.stream(arr).summaryStatistics();
        System.out.println("the max number in Array " + computeAllNumbers.getMax());
        System.out.println("sum of the array " + computeAllNumbers.getSum());
        System.out.println("min number in Array " + computeAllNumbers.getMin());
        System.out.println("average num in array " + computeAllNumbers.getAverage());

        System.out.println("=========================================================");

        List<String> names =
                Arrays.asList("Beflection Rio", "Collection", "Stream", "Ra");

        // demonstration of filter method
        List<String> result = names.stream().filter(string -> string.startsWith("R")).
                collect(Collectors.toList());
        System.out.println(result);

        System.out.println("====================================================================");
        List num = Arrays.asList(3, 2, 2, 3, 7, 3, 5);

        List<Integer> sta = numbers.stream().sorted().collect(Collectors.toList());
        System.out.println("sorted list " + sta);

        System.out.println("======================================================");
        List<String> list = Arrays.asList("9", "A", "Z", "1", "B", "Y", "4", "a", "c");
        List<String> sortedList = list.stream().sorted().collect(Collectors.toList());

        sortedList.forEach(System.out::println);

        System.out.println("=======================================================================");
       List<String> str = new ArrayList<>(Arrays.asList("A","Z","A","M","A","T"));
       List<String> reverse = str.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        System.out.println(reverse);


        for(int i = 0 , j = str.size()-1; i < j; i ++ ){
            str.add(i,str.remove(j));
        }


        System.out.println(" reversed list "  +str);

        System.out.println("================================================================");
        // create a list of integers
        List<Integer> numbers2 = Arrays.asList(2,3,4,5,2);

        // collect method returns a set
        Set<Integer> squareSet =
                numbers.stream().map(x->x*x).collect(Collectors.toSet());
        System.out.println(squareSet);

        // demonstration of forEach method
        number.stream().map(x->x*x).forEach(y->System.out.println(y));

        // demonstration of reduce method
        int even =
                number.stream().filter(x->x%2==0).reduce(0,(ans,i)-> ans+i);

        System.out.println(even);
    }
}
