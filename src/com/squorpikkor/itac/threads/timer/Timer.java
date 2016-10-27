package com.squorpikkor.itac.threads.timer;

/**
 * Created by SquorpikkoR on 15.10.2016.
 */
public class Timer {
    public static void main(String[] args) {
        PrintValue pv = new PrintValue(0, 1000);
        PrintValue pv2 = new PrintValue(100, 10000);
        Thread tr = new Thread(pv);
        Thread tr2 = new Thread(pv2);

        tr.start();
        tr2.start();

    }
}


