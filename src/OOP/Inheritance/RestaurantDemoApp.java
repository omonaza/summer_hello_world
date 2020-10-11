package OOP.Inheritance;


import OOP.User;

import java.util.ArrayList;
import java.util.Scanner;

public class RestaurantDemoApp {
    ArrayList<User> userList = new ArrayList<>();

    ArrayList<Food> menuList = new ArrayList<>();

  public RestaurantDemoApp(){
      User user1 = new User("user1", "s3cr3t");
      User user2 = new User("user2", "s3cr4t");
      User user3 = new User("user3", "s3cr5t");
      this.userList.add(user1);
      this.userList.add(user2);
      this.userList.add(user3);

      Food appetizer1 = new Appetizer("appetizer1", "ing1, ing2, ing3", 10);
      Food appetizer2 = new Appetizer("appetizer2", "ing1, ing2, ing3", 11);
      Food appetizer3 = new Appetizer("appetizer3", "ing1, ing2, ing3", 12);

      menuList.add(appetizer1);
      menuList.add(appetizer2);
      menuList.add(appetizer3);

      Food mainDish1 = new MainDish("mainDish1", "ing1, ing2, ing3", 20);
      Food mainDish2 = new MainDish("mainDish2", "ing1, ing2, ing3", 21);
      Food mainDish3 = new MainDish("mainDish3", "ing1, ing2, ing3", 22);

      menuList.add(mainDish1);
      menuList.add(mainDish2);
      menuList.add(mainDish3);

      Food drink1 = new Drink("drink1",  "ing1, ing2, ing3", 5);
      Food drink2 = new Drink("drink2",  "ing1, ing2, ing3", 6);
      Food drink3 = new Drink("drink3", "ing1, ing2, ing3", 7);

      menuList.add(drink1);
      menuList.add(drink2);
      menuList.add(drink3);

  }


    public static void main(String[] args) {
     RestaurantDemoApp restaurantDemoApp = new RestaurantDemoApp();
        Scanner input =  new Scanner(System.in);
        System.out.println("Please enter your username and password to login!");
        String userName = input.next();
        String password = input.next();

      boolean loggedIn = restaurantDemoApp.login(userName,password);
        if (loggedIn){
            printControl();
            int userControl = input.nextInt();
            switch (userControl){
                case 1:
                    for (Food f: restaurantDemoApp.menuList) {
                        if (f.getClass().equals(Appetizer.class)) {
                            ((Appetizer) f).onlyInAppetizer();
                            System.out.println(f);
                            f.print();
                        }
                    }
                    break;
                case 2:
                    for (Food f: restaurantDemoApp.menuList) {
                        if (f instanceof MainDish) {
                            System.out.println(f);
                            f.print();
                        }
                    }
                    break;
                case 3:
                    for (Food f: restaurantDemoApp.menuList) {
                        if (f instanceof Drink) {
                            System.out.println(f);
                            f.print();
                            System.out.println(((Drink) f).getPrice(1000));
                        }
                    }
                    break;
                default:
                    System.out.println("Invalid input!");
            }

        } else {
            System.out.println("Sorry, invalid password or username!");
        }


    }

    public static void printControl(){
        System.out.println("Enter (-1) to exit, and \n1.Appetizer\n2.MainDish\n3.Drinks");
    }

  public boolean login (String userName , String password){
      boolean isLoginSuccessful = false;
      for(User u : this.userList){
          if(u.getUsername().equals(userName) && u.getPassword().equals(password)){
              isLoginSuccessful = true;
          }
      }

     return  isLoginSuccessful;
  }

    public User login2(String username, String password) {
        User result = null;
        for (User u: this.userList) {
            if (u.getUsername().equals(username) && u.getPassword().equals(password))
                result = u;
        }
        return result;
    }


}
