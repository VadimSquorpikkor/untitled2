package com.squorpikkor.itac.my_stuff.my_animal;

/**
 * Created by SquorpikkoR on 03.10.2016.
 */
public class Man implements IBreathing{

    public  void speak() {
        System.out.println("I can speak");
    }

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void breathe() {
        System.out.println("He's breathing...");
    }
}
