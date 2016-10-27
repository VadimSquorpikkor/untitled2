package com.squorpikkor.itac.les01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by SquorpikkoR on 14.09.2016.
 */
public class Exercise18 {
    static int x;
    static int y;
    static int z;

    static boolean solveTheTriangle() {
        return x==y&&y==z;
    }

    static  void print()throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String sX = reader.readLine();
        String sY = reader.readLine();
        String sZ = reader.readLine();
        try{
            x = Integer.parseInt(sX);
            y = Integer.parseInt(sY);
            z = Integer.parseInt(sZ);
            System.out.println(solveTheTriangle());
        }catch (NumberFormatException fe){
            System.out.println("Вводи нормальное число!");
        }
        print();
    }

    public static void main(String[] args)throws IOException{
        print();
    }
}
