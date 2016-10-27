package com.squorpikkor.itac.my_stuff.magaz2;

 //Created by SquorpikkoR on 17.10.2016.

public class Juice extends Food{
    public Juice(String name, double price, int quantity) {
        super(name, price, quantity);
    }

    public Juice(String name, int quantity) {
        super(name, quantity);
    }
    //region OLD VERSION
/*    private String name;
    private int price;
    private int quantity;

    public Juice(String name, int price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public Juice(String name, int quantity) {
        this.name = name;
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
