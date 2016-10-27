package com.squorpikkor.itac.les01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by SquorpikkoR on 14.09.2016.
 */
public class Exercise19 {

    static int x;

    static void solveTheCube() {
        int calculating = x * x;
        System.out.println("Площадь грани: "+calculating);
        calculating = calculating * 6;
        System.out.println("Площадь полной поверхности: "+calculating);
        calculating = x * x * x;
        System.out.println("Объем: "+calculating);
    }

    static  void print()throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String sX = reader.readLine();
        try{
            x = Integer.parseInt(sX);
            solveTheCube();
        }catch (NumberFormatException fe){
            System.out.println("Вводи нормальное число!");
        }
        print();
    }

    public static void main(String[] args)throws IOException{
        print();
    }

}
