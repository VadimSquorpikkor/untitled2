package com.squorpikkor.itac.les01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by SquorpikkoR on 14.09.2016.
 */
public class Exercise04 {

    static int x;
    static int y;

    static void calculateTheNum() {
        double calculating = x + y;
        System.out.println("Сумма: "+calculating);
        calculating = x - y;
        System.out.println("Разность: "+calculating);
        calculating = x * y;
        System.out.println("Произведение: "+calculating);
        calculating = x / y;
        System.out.println("Частное: "+calculating);
    }

    static  void print()throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String sX = reader.readLine();
        String sY = reader.readLine();
        try{
            x = Integer.parseInt(sX);
            y = Integer.parseInt(sY);
            calculateTheNum();
        }catch (NumberFormatException fe){
            System.out.println("Вводи нормальное число!");
        }
        print();
    }

    public static void main(String[] args)throws IOException{
        print();
    }
}

