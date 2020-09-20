package Practice;
import java.util.List;
import java.util.ArrayList;
public class LongestOne {
    public static String findLongest(ArrayList<String> list){
        String theLongest = list.get(0);
        for (int i = 0; i < list.size();i++){
            if(list.get(i).length()>theLongest.length()){
                 theLongest=list.get(i);
            }
        } return theLongest;
    }

    public static void main(String[] args)
    {
        //instantiate ArrayList and fill with Integers
        ArrayList<String> values = new ArrayList<String>();
        String[] words = {"singapore", "cattle", "metropolitan", "turnstile"};
        for (int i = 0; i < words.length; i ++)
        {
            values.add(words[i]);
        }
        System.out.println("Expected Result:\t metropolitan");
        System.out.print("Your Result:\t\t ");
        System.out.println(findLongest(values));
    }
}
