package com.squorpikkor.itac.les01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by SquorpikkoR on 14.09.2016.
 */
public class Exercise09 {

    static double x;
    static double y;
    static double m;
    static double n;


    static boolean findThePoint() {
        return x<n||x>m;
    }

    static  void print()throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("x: ");
        String sX = reader.readLine();
        System.out.print("y: ");
        String sY = reader.readLine();
        System.out.print("m: ");
        String sM = reader.readLine();
        System.out.print("n: ");
        String sN = reader.readLine();
        try{
            x = Integer.parseInt(sX);
            y = Integer.parseInt(sY);
            m = Integer.parseInt(sM);
            n = Integer.parseInt(sN);
            System.out.println(findThePoint());
            System.out.println("--------------------");
        }catch (NumberFormatException fe){
            System.out.println("Вводи нормальное число!");
        }
        print();
    }

    public static void main(String[] args)throws IOException{
        print();
    }

}
