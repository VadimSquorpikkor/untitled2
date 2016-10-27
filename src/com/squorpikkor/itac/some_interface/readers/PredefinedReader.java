package com.squorpikkor.itac.some_interface.readers;

/**
 * Created by SquorpikkoR on 29.09.2016.
 */


public class PredefinedReader implements IReader {

    private final String str;

    public PredefinedReader (final String str) {
        this.str = str;
    }

    @Override
    public String read() {
        return str;
    }
}
