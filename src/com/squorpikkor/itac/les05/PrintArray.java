package com.squorpikkor.itac.les05;

import java.util.ArrayList;

/**
 * Created by SquorpikkoR on 27.09.2016.
 */
public class PrintArray {
    public static void print(CommonFraction fraction) {
        System.out.println(fraction.getNumerator() + "/" + fraction.getDenominator());
    }

    public static void print(ArrayList<CommonFraction> list) {
        for (int i = 0; i<list.size(); i++) {
            print(list.get(i));
        }
    }

    public static void print(CommonFraction[] array) {
        for (int i = 0; i<array.length; i++) {
            print(array[i]);
        }
    }
}
