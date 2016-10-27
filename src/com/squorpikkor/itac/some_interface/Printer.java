package com.squorpikkor.itac.some_interface;

import com.squorpikkor.itac.some_interface.printer.IPrinter;

/**
 * Created by SquorpikkoR on 29.09.2016.
 */
public class Printer implements IPrinter {
    @Override
    public void print(final String text) {
        System.out.println();

    }
}
