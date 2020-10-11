package OOP.Inheritance;

public class Appetizer extends Food {
        public Appetizer(String name, String ingredients, double price) {
            super(name, ingredients, price);
        }

        @Override
        public String toString() {
            return "Appetizer{} " + super.toString();
        }

        public void onlyInAppetizer(){
            System.out.println("I am member of only Appetizer!");
        }


}
