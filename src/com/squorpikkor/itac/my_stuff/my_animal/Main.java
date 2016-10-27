package com.squorpikkor.itac.my_stuff.my_animal;

import by.htp6.les04.array.Array;

import java.util.ArrayList;

/**
 * Created by SquorpikkoR on 01.10.2016.
 */
public class Main {
    public static void main(String[] args) {
        Dog dog1 = new Dog();
        Dog dog2 = new Dog();
        Cat cat1 = new Cat();
        Cat cat2 = new Cat();
        Man man1 = new Man();

        cat1.setName("Vaska");
        cat2.setName("Alex");
        dog1.setName("Sharik");
        dog2.setName("Killer");
        dog1.setAge(3);
        dog2.setAge(5);
        cat1.setAge(11);
        cat2.setAge(8);
        man1.setName("Vasya");

        ArrayList<Animal> list = new ArrayList<>();
        list.add(cat1);
        list.add(cat2);
        list.add(dog1);
        list.add(dog2);

        dog1.makeNoise();
        cat1.makeNoise();

        System.out.println("----------------");

        for(int i = 0; i < list.size(); i++) {
            list.get(i).makeNoise();
        }

        ArrayList<IBreathing> list2 = new ArrayList<>();
        list2.add(cat1);
        list2.add(dog1);
        list2.add(man1);

        System.out.println("----------------");

        for(int i = 0; i < list2.size(); i++) {
            list2.get(i).breathe();
        }
    }


}
