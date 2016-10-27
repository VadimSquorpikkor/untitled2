package com.squorpikkor.itac.les01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 * Created by SquorpikkoR on 14.09.2016.
 */
public class Exercise01 {

    static double x;

    static double drob(int i){
        return Math.pow(x, i)/i;
    }

    static double solveTheFormula() {
        return drob(1)-drob(3)+drob(5);
    }

   /* static double solveTheFormula() {
        return x - (x * x * x)/ 3 + (x * x * x * x * x) / 5;
    }*/

    public static double numberFromScanner(){
        Scanner scanner = new Scanner(System.in);
        while(!scanner.hasNextInt()){
            System.out.println("Вводи нормальное число!");
            scanner.nextLine();
        }
        return scanner.nextInt();
    }

    public static void scanAndRead(){
        x = numberFromScanner();
        System.out.println("Значение выражения: " + solveTheFormula());
    }

    public static void main(String[] args){
        scanAndRead();
    }
}
