package OOP;
public class Product {
//    Store --> {Name of store, Product[]  }
//    calculate totalCost of all products in store
//    and as bonus :  ApplyDiscount to some of the given products
//    We can discuss it here
//    so if you have any questions please feel free to ask


    //  1  Product --> {name, cost, quantity}
    private String productName;
    private double productCost;
    private int quantity;

    public Product(String productName, double productCost,int quantity){
        this.productName=productName;
        this.productCost=productCost;
        this.quantity=quantity;
    }
    public String getProductName(){
        return this.productName;
    }
    public void setProductName(String productName){
        this.productName=productName;
    }
    public double getProductCost(){
        return this.productCost;
    }
    public void setProductCost(double productCost){
        this.productCost = productCost;
    }
    public int getQuantity (){
        return this.quantity;
    }
    public void setQuantity(int quantity){
        this.quantity=quantity;
    }


    @Override
    public String toString() {
        return  " productName = " + productName  + " productCost = " + productCost + " quantity =" + quantity+"\n";
    }

}
