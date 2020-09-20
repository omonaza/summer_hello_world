package HacherRankTasks;

import java.util.Scanner;

public class JavaEndOfLife {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT.
        Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        int counter = 1;
        while(scan.hasNext()){
            System.out.println(counter + " " +scan.nextLine());
            counter ++;
        }
        scan.close();

    }
}
