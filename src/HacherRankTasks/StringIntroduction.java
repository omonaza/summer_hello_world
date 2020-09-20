package HacherRankTasks;

import java.util.Scanner;

public class StringIntroduction {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        String B = sc.next();
        int sum = 0; // 0,
        for (int i = 0; i < A.length(); i++) {
            for (int j = 0; j < B.length(); j++) {
                sum = A.length() + B.length();
            }
        }   System.out.println(sum+ "" );


            if (A.compareTo(B)>0){
                System.out.println("Yes");
            }else {
                System.out.println("No");
            }

            String firstLetter = A.substring(0,1).toUpperCase() + A.substring(1);
            String secondLetter =B.substring(0,1).toUpperCase() + B.substring(1);
        System.out.println(firstLetter+" " +secondLetter);






    }
}