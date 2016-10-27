package com.squorpikkor.itac.threads;

 //Created by SquorpikkoR on 09.10.2016.

public class ThreadController implements Runnable{
    //public static void main(String[] args) throws InterruptedException {

        //ThreadCreator threadCreator = new ThreadCreator("A  .", 100, ".  B", 99);


    //}



    public ThreadController() throws InterruptedException {
        PrintRunnable printA = new PrintRunnable("A  .", 99);
        PrintRunnable printB = new PrintRunnable(".  B", 100);
        PrintRunnable printC = new PrintRunnable("  C  ", 100);


        Thread threadA = new Thread(printA);
        Thread threadB = new Thread(printB);
        Thread threadC = new Thread(printC);

        //for (int i = 0; i < 10; i++) {
            threadA.start();
            threadB.start();

            threadA.join();
            threadB.join();


            threadC.start();
            threadC.join();
        //}


    }


    @Override
    public void run() {

    }
}
