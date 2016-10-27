package com.squorpikkor.itac.les01;

import java.util.Scanner;

/**
 * Created by SquorpikkoR on 16.09.2016.
 */
public class Exercise21 {
    public static void main(String[] args){
        scanAndRead();
    }


    //region OLD METHOD
    /*public static void printTheSinus(double a, double b, double h, double x){
        System.out.println("-----------------------");
        System.out.println("|  " + " x " + "\t" +"| "
                + "\t" + " y " + "\t" + "\t" + "  |");
        System.out.println("-----------------------");
        while(a<b){
            System.out.print("|  " + String.format("%.1f", a) + "\t" +": ");
            System.out.println(String.format("%.4f", x * Math.sin(a))  + "\t" + "  |");
            a = a + h;
        }
        System.out.println("-----------------------");
    }*/
    //endregion

    public static void printTheSinus2(double a, double b, double h, double x){
        System.out.println(" x " +"   |  " + " y " );
        while(a<b){
            System.out.println(a + "   :  "+ (x * Math.sin(a)));
            a = a + h;
        }
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
            System.out.print("x: ");
            double x = scanner.nextInt();
            printTheSinus2(a,b,h,x);
            break;
            //System.out.print("a: ");
        }
    }

}
