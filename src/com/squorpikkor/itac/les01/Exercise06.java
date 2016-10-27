package com.squorpikkor.itac.les01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by SquorpikkoR on 14.09.2016.
 */
public class Exercise06 {

    static int x;
    static int y;

    static boolean squareCheck() {
        return (x < 2 && x >(-2))&&(y < 4 && y >(-3))||
                (x < 4 && x >(-4))&&(y < 0 && y >(-3));
    }

    static  void print()throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String sX = reader.readLine();
        String sY = reader.readLine();
        try{
            x = Integer.parseInt(sX);
            y = Integer.parseInt(sY);
            System.out.println(squareCheck());
        }catch (NumberFormatException fe){
            System.out.println("Вводи нормальное число!");
        }
        print();
    }

    public static void main(String[] args)throws IOException{
        print();
    }
}
