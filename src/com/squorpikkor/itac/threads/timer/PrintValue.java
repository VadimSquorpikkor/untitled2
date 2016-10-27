package com.squorpikkor.itac.threads.timer;

/**
 * Created by SquorpikkoR on 15.10.2016.
 */
public class PrintValue implements Runnable {

    private int startValue;
    private long sleepMillis;

    public PrintValue(int startValue, long sleepMillis) {
        this.startValue = startValue;
        this.sleepMillis = sleepMillis;
    }

    @Override
    public void run() {
        int i = startValue;
        while (true) {
            try {
                Thread.sleep(sleepMillis);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(i);
            i++;
        }
    }
}
