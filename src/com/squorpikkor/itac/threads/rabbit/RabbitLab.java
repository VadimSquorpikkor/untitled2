package com.squorpikkor.itac.threads.rabbit;

//Created by SquorpikkoR on 10.10.2016.

public class RabbitLab {
    public static void main(String[] args) {

        new Thread(new RabbitPrinter()).start();

    }

}
