package com.squorpikkor.itac.les01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by SquorpikkoR on 14.09.2016.
 */
public class Exercise11 {

    static int x1;
    static int y1;
    static int x2;
    static int y2;

    static double hipothenuse(int x, int y) {
        return Math.sqrt(x * x + y * y);
    }

    static void theNearestPoint(){
        String s;
        if(hipothenuse(x1,y1)<hipothenuse(x2,y2)){
            s="Точка А ближе!";
        }else if(hipothenuse(x1,y1)>hipothenuse(x2,y2)){
            s="Точка В ближе!";
        }else{
            s="Ничья!";
        }
        System.out.println(s);
        System.out.println();
    }

    static  void print()throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите координаты для 1-ой точки");
        String sX1 = reader.readLine();
        String sY1 = reader.readLine();
        System.out.println("Введите координаты для 2-ой точки");
        String sX2 = reader.readLine();
        String sY2 = reader.readLine();
        try{
            x1 = Integer.parseInt(sX1);
            y1 = Integer.parseInt(sY1);
            x2 = Integer.parseInt(sX2);
            y2 = Integer.parseInt(sY2);
            theNearestPoint();
        }catch (NumberFormatException fe){
            System.out.println("Вводи нормальное число!");
        }
        print();
    }

    public static void main(String[] args)throws IOException{
        print();
    }
}
