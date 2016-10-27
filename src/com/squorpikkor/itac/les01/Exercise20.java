package com.squorpikkor.itac.les01;

import java.util.Scanner;

/**
 * Created by SquorpikkoR on 16.09.2016.
 */
public class Exercise20 {

    public static void main(String[] args){
        scanAndRead();
    }

    public static void printTheTangens(double a, double b, double h){
        System.out.println("-----------------------");
        System.out.println("|  " + " x " + "\t" +"| "
                 + "\t" + " y " + "\t" + "\t" + "  |");
        System.out.println("-----------------------");
        while(a<b){
            System.out.print("|  " + String.format("%.1f", a) + "\t" +": ");
            System.out.println(String.format("%.4f", Math.tan(a))  + "\t" + "  |");
            a = a + h;
        }
        System.out.println("-----------------------");
    }

    public static void scanAndRead(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("a: ");
        while(scanner.hasNext()){
            double a = scanner.nextInt();
            System.out.print("b: ");
            double b = scanner.nextInt();
            System.out.print("h: ");
            double h = scanner.nextInt();
            printTheTangens(a,b,h);
            System.out.print("a: ");
        }
    }
}
