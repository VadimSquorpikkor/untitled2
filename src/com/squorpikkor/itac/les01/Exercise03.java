package com.squorpikkor.itac.les01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by SquorpikkoR on 15.09.2016.
 */
public class Exercise03 {

    static int x;
    static char[] charArray;


    static int checkTheNum() {
        int a = Integer.parseInt(String.valueOf(charArray[0]));
        int b = Integer.parseInt(String.valueOf(charArray[1]));
        int c = Integer.parseInt(String.valueOf(charArray[2]));
        int d = Integer.parseInt(String.valueOf(charArray[3]));
        return a * b * c * d;
    }

    /*static int checkTheNum() {
        int a = 1;
        for(char i : charArray ){
            a = a * i;
        }
        return a;
    }*/



        static  void print()throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String sX = reader.readLine();
        if (sX.length() != 4) {
            System.out.println("Вообще не четырехзначное число!");
        } else {
            try {
                charArray = sX.toCharArray();
                x = Integer.parseInt(sX);
                System.out.println("Произведение равно: " + checkTheNum());
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
