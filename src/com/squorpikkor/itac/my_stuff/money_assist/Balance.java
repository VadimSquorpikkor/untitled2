package com.squorpikkor.itac.my_stuff.money_assist;

 // Created by SquorpikkoR on 13.10.2016.

public final class Balance {
    private static double balance;

    public static void setBalance(double b) {
        balance = b;
    }

    public static double getBalance() {
        return balance;
    }

    public Balance() {
        balance = 0;
    }
}
