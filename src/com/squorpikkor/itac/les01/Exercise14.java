package com.squorpikkor.itac.les01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by SquorpikkoR on 14.09.2016.
 */
public class Exercise14 {
    static int x;

    static void monthOfTheYear() {
        String s;
        switch (x){
            case 1: s = "Январь"; break;
            case 2: s = "Февраль"; break;
            case 3: s = "Март"; break;
            case 4: s = "Апрель"; break;
            case 5: s = "Май"; break;
            case 6: s = "Июнь"; break;
            case 7: s = "Июль"; break;
            case 8: s = "Август"; break;
            case 9: s = "Сентябрь"; break;
            case 10: s = "Октябрь"; break;
            case 11: s = "Ноябрь"; break;
            case 12: s = "Декабрь"; break;
            default: s = "Число должно быть между 1 и 12 !";
        }
        System.out.println(s);
    }

    static  void print()throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String sX = reader.readLine();
        try{
            x = Integer.parseInt(sX);
            monthOfTheYear();
        }catch (NumberFormatException fe){
            System.out.println("Вводи нормальное число!");
        }
        print();
    }

    public static void main(String[] args)throws IOException{
        print();
    }
}
