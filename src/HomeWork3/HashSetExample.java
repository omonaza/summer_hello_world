package HomeWork3;
import java.util.HashSet;
import java.util.Iterator;

public class HashSetExample {

    public static void main(String[] args) {
        HashSet<String> hs = new HashSet<String>();

        // Adding element to HashSet

        hs.add("M");

        hs.add("B");

        hs.add("C");

        hs.add("A");

        hs.add("M");

        hs.add("X");

        System.out.println("Size of HashSet=" + "??????");
        System.out.println(hs.size());

        System.out.println("Original HashSet:" + "?????");
        System.out.println(hs);

        System.out.println("Removing A from HashSet: "+"?????");
        Iterator i = hs.iterator();
        String str = "";
        while (i.hasNext()){
            str = (String) i.next();
            if(str.equals("A")){
                i.remove();

            }
            break;

            }


       System.out.println(hs);

        System.out.println("Remove Z which is not present: ");
        boolean result = false;
        for (String s : hs){
            if(s.contains("Z")){
                result = true;
            }else {
                result = false;
            }
        }
        System.out.println(result);

        System.out.println();
        System.out.println("Checking if M is present=" +"???");
        boolean result1 = false;
        for(String s : hs){
            if(s.equals("M")){
                result1 = true;
            }else {
                result1 = false;
            }
        }
        System.out.println(result1);

        System.out.println("Updated HashSet: " + "???");
        System.out.println(hs);

    }
}
