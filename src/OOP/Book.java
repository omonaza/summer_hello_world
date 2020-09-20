package OOP;

public class Book {
    private int price;
    private String name;

    public int getPrice(String buyerType){
        if (buyerType == "student")
            return this.price * 40 /100;
        else
            return price;
    }
}
