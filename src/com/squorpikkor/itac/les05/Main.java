package com.squorpikkor.itac.les05;

import java.util.ArrayList;

/**
 * Created by SquorpikkoR on 27.09.2016.
 */
public class Main {
    public static void main(String[] args) {
        CommonFraction fraction1 = new CommonFraction(6, 8);
        CommonFraction fraction2 = new CommonFraction(5, 4);
        CommonFraction fraction3 = new CommonFraction(1, 8);
        CommonFraction fraction4 = new CommonFraction(2, 6);
        CommonFraction fraction5 = new CommonFraction(4, 9);
        CommonFraction fraction6 = new CommonFraction(8, 26);
        CommonFraction fraction7 = new CommonFraction(2, 4);
        PrintArray.print(fraction1);

        ArrayList<CommonFraction> myArrayList = new ArrayList<>();
        myArrayList.add(fraction1);
        myArrayList.add(fraction2);
        myArrayList.add(fraction3);
        myArrayList.add(fraction4);
        myArrayList.add(fraction5);
        myArrayList.add(fraction6);
        myArrayList.add(fraction7);
        PrintArray.print(myArrayList);

        CommonFraction[] myArray = new CommonFraction[]{
          fraction1,
          fraction2,
          fraction3,
          fraction4,
          fraction5,
          fraction6,
          fraction7,
        };
        PrintArray.print(myArray);
    }

}
