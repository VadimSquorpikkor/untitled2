package com.squorpikkor.itac.threads.rabbit;

/**
 * Created by SquorpikkoR on 10.10.2016.
 */
public class RabbitPrinter implements Runnable {
    static int count = 0;


    @Override
    public void run() {
        count++;
        System.out.println(count + " rabbit born!");
        new Thread(new RabbitPrinter()).start();

    }
}
