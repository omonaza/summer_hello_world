package HacherRankTasks;



import java.util.Scanner;
import java.util.SortedSet;
import java.util.TreeSet;

public class JavaSubstringComparisons {

    public static String getSmallestAndLargest(String s, int k) {
//        String smallest = "";
//        String largest = "";
//
//        SortedSet<String> s1 = new TreeSet<String>();
//        for (int i = 0; i < s.length()-k; i ++){
//            s1.add(s.current_substring(i,i+k));
//        }
//         smallest= s1.first();
//         largest = s1.last();
//
//        // Complete the function
//        // 'smallest' must be the lexicographically smallest current_substring of length 'k'
//        // 'largest' must be the lexicographically largest current_substring of length 'k'
//
//        return smallest + "\n" + largest;


        String current_substring = s.substring(0, k);
        String smallest = current_substring;
        String largest = current_substring;

        for (int i = 1; i <= s.length() - k; i++) {
            current_substring = s.substring(i, i + k);

            if (current_substring.compareTo(largest) > 0) {
                largest = current_substring;
            }
            if (current_substring.compareTo(smallest) < 0) {
                smallest = current_substring;
            }
        }

        return smallest + "\n" + largest;
    }


    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        String word = userInput.nextLine();
        int k = userInput.nextInt();


        System.out.println(getSmallestAndLargest(word,k));
    }
}