package OOP.Inheritance;

public class Drink  extends Food{

    public Drink(String name, String ingredients, double price) {
        super(name, ingredients, price);
    }

    public double getPrice(int quantity){
        return quantity * super.getPrice();
    }

    @Override
    public String toString() {
        return "Drink {" + super.toString() + "}";
    }
}
