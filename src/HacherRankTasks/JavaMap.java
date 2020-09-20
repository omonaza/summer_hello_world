package HacherRankTasks;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class JavaMap {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n=in.nextInt();
        in.nextLine();
        Map<String,Integer> result = new HashMap<>();

        for(int i=0;i<n;i++)
        {
            String name=in.nextLine();
            int phone=in.nextInt();
            result.put(name,phone);
            in.nextLine();
        }
        while(in.hasNext())
        {
            String s=in.nextLine();
            if(result.containsKey(s)==true){
                int number = result.get(s);
                System.out.println(s + "=" +number);

            } else {
                System.out.println("Not Found");
            }

        }
    }
}
