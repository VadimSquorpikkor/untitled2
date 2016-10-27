package com.squorpikkor.itac.les01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by SquorpikkoR on 14.09.2016.
 */
public class Exercise16 {

    static int x;
    static String sX;


    static boolean checkTheNum() {
        int a = x/100;
        int b = x/10%10;
        int c = x%100;
        int sum = a + b + c;
        return x * x == sum * sum * sum;
    }

    static  void print()throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        sX = reader.readLine();
        if (sX.length() != 3) {
            System.out.println("Вообще не трехзначное число!");
        } else {
            try {
                x = Integer.parseInt(sX);
                System.out.println(checkTheNum());
            } catch (NumberFormatException fe) {
                System.out.println("Вводи нормальное число!");
            }
        }
        print();
    }

    public static void main(String[] args)throws IOException{
        print();
    }
}
