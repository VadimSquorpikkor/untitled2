package com.squorpikkor.itac.threads;

 // Created by SquorpikkoR on 09.10.2016.

public class ThreadCreator {
    public ThreadCreator(String msg, long sleepMillis) {
        PrintRunnable printRunnable = new PrintRunnable(msg, sleepMillis);
        Thread thread = new Thread(printRunnable);
        thread.start();
    }

    public ThreadCreator(String msg, long sleepMillis, String msg2, long sleepMillis2) {
        PrintRunnable printRunnable = new PrintRunnable(msg, sleepMillis);
        PrintRunnable printRunnable2 = new PrintRunnable(msg2, sleepMillis2);
        Thread thread = new Thread(printRunnable);
        Thread thread2 = new Thread(printRunnable2);
        thread.start();
        thread2.start();
    }

}
