package com.squorpikkor.itac.my_stuff.magaz2;

 //Created by SquorpikkoR on 17.10.2016.
 //Parent class for Juice & Product

public class Food {
    private String name;
    private double price;
    private int quantity;

    public Food(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public Food(String name, int quantity) {
        this.name = name;
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

}
