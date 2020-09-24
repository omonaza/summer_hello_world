package OOP;

import java.util.ArrayList;
import java.util.Arrays;

public class Store {
    //  2  Store --> {Name of store, Product[]  }
    private String storeName;
    private ArrayList<Product> products;



    public Store(String storeName, ArrayList<Product> products) {
        this.storeName = storeName;
        this.products = products;
    }

    //  2 calculate TotalCost of particular Product,
    public double calculateCostOfParticularProduct(int i){
        double cost = 0;
        cost+=products.get(i).getProductCost();
        return cost;
    }


    //    calculate totalCost of all products in store
    public double totalCost(){
        double totalSum = 0;
        for (Product p : this.products){
            totalSum+=p.getQuantity()*p.getProductCost();
        }
        return totalSum;
    }

    public double calculatePriceAfterDiscount (int i , double discount){
        double priceAfterDiscount = products.get(i).getProductCost() - (products.get(i).getProductCost()*discount/100);
        return priceAfterDiscount;
    }

    public void addProduct(ArrayList<Product>newProd){
        this.products.addAll(newProd);
        System.out.println(newProd);
    }
    public ArrayList<Product> removeProduct (ArrayList<Product> newProd , int i){

        newProd.remove(this.products.get(i));
        return newProd;

    }





    @Override
    public String toString() {
        return "storeName = " + storeName+":" +"\n " + products+"\n";
    }

}
