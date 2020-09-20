package OOP;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
public class RestaurantDemoApp {

    ArrayList<User> userList = new ArrayList<>();

    Map<String, ArrayList<Food>> menu = new HashMap<>();


    public RestaurantDemoApp(){
        User user1 = new User("user1","s3cr3t");
        User user2 = new User("user2","s3cr3t");
        User user3 = new User("user3","s3cr3t");

        this.userList.add(user1);
        this.userList.add(user2);
        this.userList.add(user3);

        Food appetizer1 = new Food("appetizer1", "APPETIZER", "ing1, ing2, ing3", 10);
        Food appetizer2 = new Food("appetizer2", "APPETIZER", "ing1, ing2, ing3", 11);
        Food appetizer3 = new Food("appetizer3", "APPETIZER", "ing1, ing2, ing3", 12);

        ArrayList<Food> appetizerList = new ArrayList<>();
        appetizerList.add(appetizer1);
        appetizerList.add(appetizer2);
        appetizerList.add(appetizer3);

        Food mainDish1 = new Food("mainDish1", "MDISH", "ing1, ing2, ing3", 20);
        Food mainDish2 = new Food("mainDish2", "MDISH", "ing1, ing2, ing3", 21);
        Food mainDish3 = new Food("mainDish3", "MDISH", "ing1, ing2, ing3", 22);

        ArrayList<Food> mDishList = new ArrayList<>();
        mDishList.add(mainDish1);
        mDishList.add(mainDish2);
        mDishList.add(mainDish3);

        Food drink1 = new Food("drink1", "DRINK", "ing1, ing2, ing3", 5);
        Food drink2 = new Food("drink2", "DRINK", "ing1, ing2, ing3", 6);
        Food drink3 = new Food("drink3", "DRINK", "ing1, ing2, ing3", 7);

        ArrayList<Food> drinkList = new ArrayList<>();
        drinkList.add(drink1);
        drinkList.add(drink2);
        drinkList.add(drink3);

        menu.put("APPETIZER", appetizerList);
        menu.put("MDISH", mDishList);
        menu.put("DRINK", drinkList);

    }


    public static void main(String[] args) {
        RestaurantDemoApp restaurantDemoApp = new RestaurantDemoApp();
        Scanner userInput = new Scanner(System.in);
        System.out.println("Please enter user name and password");
        String username = userInput.next();
        String password = userInput.next();


        boolean loggedIn = restaurantDemoApp.login(username,password);
        if(loggedIn){
            printControl();
            int userControl = userInput.nextInt();
            switch (userControl){
                case 1:
                    for (Food f : restaurantDemoApp.menu.get("APPETIZER1")){
                        System.out.println("Name" +f.getName());
                        System.out.println("Type" +f.getType());
                        System.out.println("Ingredients" +f.getIngredients());
                        System.out.println("Price" +f.getPrice());
                    }
                    break;
                case 2:
                    for (Food f: restaurantDemoApp.menu.get("MDISH")) {
                        System.out.println("name: "+f.getName());
                        System.out.println("type: "+f.getType());
                        System.out.println("ingredients: "+f.getIngredients());
                        System.out.println("price: "+f.getPrice());
                    }
                    break;
                case 3:
                    for (Food f: restaurantDemoApp.menu.get("DRINK")) {
                        System.out.println("name: "+f.getName());
                        System.out.println("type: "+f.getType());
                        System.out.println("ingredients: "+f.getIngredients());
                        System.out.println("price: "+f.getPrice());
                    }
                    break;
                default:
                    System.out.println("Invalid input!");
            }
        } else {
            System.out.println("Sorry, invalid password or username!");
        }


    }

    public static void printControl (){
        System.out.println("Enter (-1) to exit, and \n1.Appetizer\n2.MainDish\n3.Drinks");
    }

    public boolean login (String username,String password){
        boolean isLoginSuccessful = false;

        for (User u : this.userList){
            if(u.getUsername().equals(username) && u.getPassword().equals(password)){
                isLoginSuccessful = true;
            }
        }

        return isLoginSuccessful;
    }
    public User login1 (String username, String password){
           User result = null;
           for (User u : this.userList){
               if(u.getUsername().equals(username) && u.getPassword().equals(password)){
                   result = u;
               }
           } return result;
    }

    public ArrayList<Food> getmenu (String key){
        ArrayList<Food> menuList = new ArrayList<>();
          if(key.equals("all")) {
              for (ArrayList<Food> foods : menu.values()) {
                  menuList.addAll(foods);

              }
          }else {
              menuList.addAll(menu.get(key));
          }
          return menuList;
    }

}
