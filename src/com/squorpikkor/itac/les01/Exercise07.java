package com.squorpikkor.itac.les01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by SquorpikkoR on 14.09.2016.
 */
public class Exercise07 {

    static int x;
    static int y;

    static boolean quarterCheck() {
        double lenght = Math.sqrt(x * x + y * y);
        return (lenght < 3) && x >= 0 && y >= 0 ||
                (lenght < 4) && x >= 0 && y <= 0;
    }

    static  void print()throws IOException{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String sX = reader.readLine();
        String sY = reader.readLine();
        try{
            x = Integer.parseInt(sX);
            y = Integer.parseInt(sY);
            System.out.println(quarterCheck());
        }catch (NumberFormatException fe){
            System.out.println("Вводи нормальное число!");
        }
        print();
    }

    public static void main(String[] args)throws IOException{
        print();
    }
}