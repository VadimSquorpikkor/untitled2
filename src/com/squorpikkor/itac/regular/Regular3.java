package com.squorpikkor.itac.regular;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by SquorpikkoR on 22.10.2016.
 */
public class Regular3 {

    public static boolean test(String stringTest) {
        Pattern pattern = Pattern.compile("^[A-Z]{8,15}");
        Matcher matcher = pattern.matcher(stringTest);
        return matcher.matches();
    }

    public static void main(String[] args) throws IOException {

        System.out.println("Введите пароль");



        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        while(true) {
            if (test(reader.readLine())) {
                System.out.println("Пароль валидный");
                /*while (true) {
                    System.out.println("сохранить?Y//N");
                    String s = reader.readLine();
                    if (s.equals("Y")) {
                        System.out.println("Пароль сохранен!");
                        break;
                    }else if(s.equals("N")){
                        break;
                    }
                }*/
            }else{
                System.out.println("пароль не соответствует");
            }
        }
    }
}
