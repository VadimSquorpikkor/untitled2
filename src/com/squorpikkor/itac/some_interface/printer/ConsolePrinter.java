package com.squorpikkor.itac.some_interface.printer;

/**
 * Created by SquorpikkoR on 29.09.2016.
 */
public class ConsolePrinter implements IPrinter {
    @Override
    public void print(String text) {
        System.out.println(text);
    }
}
