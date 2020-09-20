package OOP;

public class Food {
    private String name;
    private double price;
    private String type;
    private String ingredients;

    public Food(String name, String type, String ingredients, double price) {
        this.name = name;
        this.price = price;
        this.type = type;
        this.ingredients = ingredients;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getIngredients() {
        return ingredients;
    }

    public void setIngredients(String ingredients) {
        this.ingredients = ingredients;
    }

}
