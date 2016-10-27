package com.squorpikkor.itac.some_interface;

import com.squorpikkor.itac.some_interface.printer.ConsolePrinter;
import com.squorpikkor.itac.some_interface.printer.IPrinter;
import com.squorpikkor.itac.some_interface.readers.IReader;
import com.squorpikkor.itac.some_interface.readers.PredefinedReader;

/**
//Created by SquorpikkoR on 29.09.2016.
 */
public class Replacer {
    private final IReader reader;
    private final IPrinter printer;

    public Replacer(final IReader reader,
                    final IPrinter printer) {//зачем final здесь???
        this.reader = reader;
        this.printer = printer;
    }

    public void replace() {
        final String text = reader.read();
        final String replacedText = text.replace(":)","=)");
        printer.print(replacedText);
    }

    public static void main(String[] args) {
        final IReader reader = new PredefinedReader("dfsfsdfsdf:)fdfdff:)fdfdsfsdfsdf:)");
        final IPrinter printer = new ConsolePrinter();
        final Replacer replacer = new Replacer(reader, printer);
        replacer.replace();
    }
}
