package com.squorpikkor.itac.les01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by SquorpikkoR on 14.09.2016.
 */
public class Exercise02 {
    static double x;
    static double y;

    static double solveTheFormula() {
        double a = 1 + Math.pow(Math.sin(x+y), 2);
        double b = x - 2 * x /(1 + x * x * y * y);
        return a / ( 2 + Math.abs(b) + x);
    }

    static  void print()throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String sX = reader.readLine();
        String sY = reader.readLine();
        try{
            x = Integer.parseInt(sX);
            y = Integer.parseInt(sY);
            System.out.println("Значение выражения: " + solveTheFormula());
        }catch (NumberFormatException fe){
            System.out.println("Вводи нормальное число!");
        }
        print();
    }

    public static void main(String[] args)throws IOException{
        print();
    }

}
