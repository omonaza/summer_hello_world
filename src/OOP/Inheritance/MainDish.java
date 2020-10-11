package OOP.Inheritance;

public class MainDish extends  Food {
    public MainDish(String name, String ingredients, double price) {
        super(name, ingredients, price);
    }

    @Override
    public String toString() {
        return "MainDish { " + super.toString()+"}";
    }

    @Override
    public void print(){
        System.out.println("I am a MainDish!");
    }

}
