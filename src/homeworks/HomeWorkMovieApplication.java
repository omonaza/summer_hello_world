package homeworks;

import java.util.Scanner;

public class HomeWorkMovieApplication {
    public static void main(String[] args) {
        Scanner movie = new Scanner(System.in);
        System.out.println("Please Enter Your Age ");
        int ageUser1 = movie.nextInt();

        if (1 >= ageUser1 && 6 <= ageUser1)
            System.out.println("You Are Suggested to Watch Cartoon Avatar");
        if (7 >= ageUser1 && 17 <= ageUser1)
            System.out.println("You Are Suggested to watch Discovery channel ");
        if (18 >= ageUser1 && 25 <= ageUser1)
            System.out.println("You Are Suggested to watch action movies ");
        if (26 >= ageUser1 && 40 <= ageUser1)
            System.out.println("You Are Suggested to watch news Channel  ");
        if (41 >= ageUser1 && 100 <= ageUser1)
            System.out.println("You Are Suggested to watch anything you want to ");
        else
            System.err.println(" Sorry something went wrong ");

    }
}
/*
Homework —> Please write Movie application program,
1) Ask age from user.
2) If user’s age from 1- 6 please suggest cartoon. King Lion etc…
 3) 7-17 —> Discovery channel etc…
 4) 18 - 25 —— action movie  Avatar…
 5) 26 - 40 ——> news channel FOX CNN etc…
  6) 41 - 100 ——> you can watch anything you want
 7) if user enters none of them ——> Print an warning message (edited)
 */