package JiraProject;


import java.util.*;

public class userEmail2 {

    public static <b> void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.println("Please Enter Email");


        String email = userInput.nextLine();
        System.out.println(email);
        String[] arr = email.split("@");
        List<String> list = new ArrayList<String>(Arrays.asList(arr));
        if (list.size()<=2){
            System.out.println("Email is: " +list.get(0) + "\n Domain is: " +list.get(1));
        }else if (list.size() > 2){
            System.out.println("error");
        }



        }


    }
