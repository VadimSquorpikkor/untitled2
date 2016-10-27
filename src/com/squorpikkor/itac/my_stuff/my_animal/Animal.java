package com.squorpikkor.itac.my_stuff.my_animal;

/**
 * Created by SquorpikkoR on 01.10.2016.
 */
abstract public class Animal implements IBreathing {

    @Override
    public void breathe() {
        System.out.println("It's breathing...");
    }

    private String name;
    private int age;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    /*void breathe() {
        System.out.println("it breathing...");
    }*/

    abstract void makeNoise();
}
