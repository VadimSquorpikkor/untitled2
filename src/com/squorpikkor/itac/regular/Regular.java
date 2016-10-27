package com.squorpikkor.itac.regular;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 1. Найти в текстовом файле все числа, записанные с 16-ричной системе счисления
 * 2. Найти в тексте все email-адреса и посчитать количество адресов, имеющих одно и
 * тоже account name  (one@gmail.com  рщршгршгр one@mail.com)
 * 3. Написать регулярное(ые) выражение(я), проверяющее допустимость символов, во введенном логине, пароле.
 * <p>
 * Created by SquorpikkoR on 22.10.2016.
 */
public class Regular {

    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        try {
            while (true) {
                String s = reader.readLine();
                if(s.equals("end")){break;}
                if(s.equals("password")){System.out.println("...log in...");}else{
                System.out.println("...wrong pass...");}
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("...endings...");
    }


}
