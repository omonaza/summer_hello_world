package OOP;

import java.util.ArrayList;

public class PoductStoreDemo {
    public static void main(String[] args) {

        ArrayList<Product> productsList = new ArrayList<>();

        Product product1 = new Product("Iphone 4", 300, 1);
        Product product2 = new Product("Iphone 5", 400, 5);
        Product product3 = new Product("Iphone 6", 500, 5);
        Product product4 = new Product("Iphone 7", 600, 10);
        Product product5 = new Product("Iphone 8", 700, 3);

        productsList.add(product1);
        productsList.add(product2);
        productsList.add(product3);
        productsList.add(product4);
        productsList.add(product5);

        ArrayList<Product> productsList2 = new ArrayList<>();

        Product product6 = new Product("Android 4", 300, 1);
        Product product7 = new Product("Android 5", 400, 5);
        Product product8 = new Product("Android 6", 500, 5);
        Product product9 = new Product("Android 7", 600, 10);
        Product product10 = new Product("Android 8", 700, 3);

        productsList2.add(product6);
        productsList2.add(product7);
        productsList2.add(product8);
        productsList2.add(product9);
        productsList2.add(product10);

        Store AppleStore = new Store("Apple",productsList);
        System.out.println(AppleStore);

        Store SamsungStore = new Store("Samsung",productsList);
        System.out.println(SamsungStore);
        System.out.println("total cost of Iphone " +AppleStore.totalCost());
        System.out.println("cost of particular Iphone " +AppleStore.calculateCostOfParticularProduct(0));
        System.out.println("price of iphone after discount applied " +AppleStore.calculatePriceAfterDiscount(0,20.0));
        AppleStore.addProduct(productsList2);
        System.out.println("after adding the new phone " +AppleStore);
        AppleStore.removeProduct(productsList,0);
        System.out.println("after removing  " +AppleStore);

    }
}
