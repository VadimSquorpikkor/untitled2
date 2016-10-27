package com.squorpikkor.itac.les01;

import java.util.Scanner;

/**
 * Created by SquorpikkoR on 16.09.2016.
 */
public class Exercise15 {

    public static void main(String[] args){
        scanAndRead();
    }

    public static int februaryDayCount(int year){
        int daysInFebruary;
        if(curentYearIsLeap(year)){ //if(curentYearIsLeap(year)==true)
            daysInFebruary = 29;
        }else{
            daysInFebruary = 28;
        }
        return daysInFebruary;
    }

    public static int monthDayCount(int year, int month){
        int dayCount;
        switch (month){
            case 1: dayCount = 31; break;
            case 2: dayCount = februaryDayCount(year); break;
            case 3: dayCount = 31; break;
            case 4: dayCount = 30; break;
            case 5: dayCount = 31; break;
            case 6: dayCount = 30; break;
            case 7: dayCount = 31; break;
            case 8: dayCount = 31; break;
            case 9: dayCount = 30; break;
            case 10: dayCount = 31; break;
            case 11: dayCount = 30; break;
            case 12: dayCount = 31; break;
            default: dayCount = 0; System.out.println("Номер месяца должен быть от 1 до 12!");
        }
        return dayCount;
    }

    public static boolean curentYearIsLeap(int year){
        return (year%4==0)&&(year%100==0)&&(year%400==0)||
                (year%4==0)&&(year%100!=0);
    }

    public static void scanAndRead() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите год: ");
        while (scanner.hasNext()) {
            int year = scanner.nextInt();
            System.out.print("Введите номер месяца: ");
            int monthNum = scanner.nextInt();
            System.err.println("Дней в этом месяце: " + monthDayCount(year, monthNum));
            System.out.println("---------------------------");
            System.out.print("Введите год: ");
        }
    }
}
