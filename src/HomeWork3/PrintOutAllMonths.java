package HomeWork3;

import java.util.Arrays;

public class PrintOutAllMonths {
    public static void printMonths (String [] months) {
        for (int i = 0 ; i < months.length;i++){
            System.out.println(months[i]);
            if(months[i].equals("May")){
                System.out.println("my birthday is " +months[i]);
            }
        }
    }

    public static void main(String[] args) {
        String [] months = {"Jan", "Feb", "Mar", "Apr", "May", "Jun",
                "Jul", "Aug", "Sep", "Oct", "Nov", "Dec\n"};
        printMonths(months);


        System.out.println(Arrays.toString(months));
        if(months[4].equals("May")){
            System.out.println("My birthday is " +months[4]);
        }


    }
}
