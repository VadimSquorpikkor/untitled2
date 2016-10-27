package com.squorpikkor.itac.my_stuff.magaz2;

/**
 * Created by SquorpikkoR on 17.10.2016.
 */
public class Product extends Food{
    public Product(String name, int price, int quantity) {
        super(name, price, quantity);
    }

    public Product(String name, int quantity) {
        super(name, quantity);
    }
    //region OLD VERSION
    /*private String name;
    private int price;
    private int quantity;

    public Product(String name, int price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }



    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }*/
    //endregion
}
