package com.squorpikkor.itac.les01;

import java.util.Scanner;

/**
 * Created by SquorpikkoR on 16.09.2016.
 */
public class SolveTheEquation {
    public String[] equationRoots(int a, int b, int c) {
        int disc = b * b - 4 * a * c;
        String s1;
        String s2;
        double x1;
        double x2;
        if (disc >= 0) {
            x1 = ((-1) * b + Math.sqrt(disc)) / (2 * a);
            x2 = ((-1) * b - Math.sqrt(disc)) / (2 * a);
            s1 = "x1 = " + x1;  //Пришлось переводить в стринг
            s2 = "x2 = " + x2;  //чтоб можно было вывести мнимую
        } else {                //составляющую комплексного числа (i)
            double i = Math.sqrt(disc * (-1)) / (2 * a);
            x1 = ((-1) * b) / (2 * a);
            s1 = "x1 = " + x1 + " + " + i + "i";
            s2 = "x2 = " + x1 + " - " + i + "i";
        }
        String[] rootsOfEquation = {s1, s2};
        return rootsOfEquation;
    }

    public void printEquationRoots(int a, int b, int c){
        System.out.println("x1 = " + equationRoots(a,b,c)[0]);
        System.out.println("x2 = " + equationRoots(a,b,c)[1]);
    }

    public void scanAndRead(){
        System.out.print("a: ");
        Scanner scanner = new Scanner(System.in);
        while(scanner.hasNext()){
            int a = scanner.nextInt();
            System.out.print("b: ");
            int b = scanner.nextInt();
            System.out.print("c: ");
            int c = scanner.nextInt();
            printEquationRoots(a,b,c);
        }
        //scanAndRead();
    }
}
