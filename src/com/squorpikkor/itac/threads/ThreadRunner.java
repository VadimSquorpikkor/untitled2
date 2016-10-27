package com.squorpikkor.itac.threads;

/**
 * Created by SquorpikkoR on 09.10.2016.
 */
public class ThreadRunner{
    /*public ThreadRunner(PrintRunnable printRunnable) {
        Thread thread = new Thread(printRunnable);
        thread.start();
    }*/

    public static void main(String[] args) throws InterruptedException{


    //public ThreadRunner() throws InterruptedException {
        new Thread(new ThreadController()).start();
        new Thread(new ThreadController()).start();
        new Thread(new ThreadController()).start();
    }

    /*@Override
    public void run() {

    }*/
}
