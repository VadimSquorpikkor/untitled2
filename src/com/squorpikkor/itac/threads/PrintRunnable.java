package com.squorpikkor.itac.threads;

 //Created by SquorpikkoR on 08.10.2016.

public class PrintRunnable implements Runnable {
    private String msg;
    private long sleepMillis;

    public PrintRunnable(String msg, long sleepMillis) {
        this.msg = msg;
        this.sleepMillis = sleepMillis;
    }

    @Override
    public void run() {

        for (int k = 0; k < 5; k++) {
            try {
                Thread.sleep(sleepMillis);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println(msg);
        }
    }

}
