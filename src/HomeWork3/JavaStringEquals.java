package HomeWork3;

import java.util.Scanner;

public class JavaStringEquals {

    public static void PasswordChecker() {
        String userName;
        String password;
        String expectedUserName = "abc@gmail.com";
        String expectedPassword = "12345678";
        Scanner userInput = new Scanner(System.in);
        int count = 0;
        do {
            System.out.println("Please Enter your user name");
            userName = userInput.nextLine();
            System.out.println("please enter your password");
            password=userInput.nextLine();
            count++;
        }while (!expectedUserName.equalsIgnoreCase(userName)&&!expectedPassword.equalsIgnoreCase(password)&&count<3);

        if (expectedUserName.equalsIgnoreCase(userName)){
            if(expectedPassword.equalsIgnoreCase(password)){
                System.out.println("log in");
            }
        }else {
            System.out.println("your account is blocked");
        }


    }

    public static void main(String[] args) {
        PasswordChecker();
    }
}
