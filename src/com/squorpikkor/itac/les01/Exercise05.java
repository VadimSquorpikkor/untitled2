package com.squorpikkor.itac.les01;

import java.util.Scanner;

/**
 * Created by SquorpikkoR on 15.09.2016.
 */
public class Exercise05 {

    public static void main(String[] args){
        //SolveTheEquation solve = new SolveTheEquation();  //Можно было бы создать
        //solve.scanAndRead();                              //объект из класса SolveTheEquation
        scanAndRead();                                      //тогда можно было бы
                                                            //без static
    }

    public static String[] equationRoots(int a, int b, int c) {
        int disc = b * b - 4 * a * c;
        String s1;
        String s2;
        double x1;
        double x2;
        if (disc >= 0) {
            x1 = ((-1) * b + Math.sqrt(disc)) / (2 * a);
            x2 = ((-1) * b - Math.sqrt(disc)) / (2 * a);
            s1 = String.valueOf(x1);                        //Пришлось переводить в стринг
            s2 = String.valueOf(x2);                        //чтоб можно было вывести мнимую
        } else {                                            //составляющую комплексного числа (i)
            double i = Math.sqrt(disc * (-1)) / (2 * a);    //при отрицательном
            x1 = ((-1) * b) / (2 * a);                      //дискриминанте. Это чтоб не писать
            s1 = x1 + " + " + i + "i";                      //свой класс под комплексные
            s2 = x1 + " - " + i + "i";                      //числа.
        }
        String[] rootsOfEquation = {s1, s2};
        return rootsOfEquation;
    }

    public static void printEquationRoots(int a, int b, int c){
        System.out.println("------Корни уравнения: --------");
         System.out.println("x1 = " + equationRoots(a,b,c)[0]);
         System.out.println("x2 = " + equationRoots(a,b,c)[1]);
        System.out.println("-------------------------------");
        }

    public static void scanAndRead(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите значения:");
        System.out.print("a: ");
        while(scanner.hasNextInt()){
            int a = scanner.nextInt();
            System.out.print("b: ");
            int b = scanner.nextInt();
            System.out.print("c: ");
            int c = scanner.nextInt();
            printEquationRoots(a,b,c);
            System.out.print("a: ");
        }
    }
}

