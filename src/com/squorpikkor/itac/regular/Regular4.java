package com.squorpikkor.itac.regular;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

//Найти в тексте все email-адреса и посчитать количество адресов, имеющих одно и
//тоже account name  (one@gmail.com  рщршгршгр one@mail.com)
public class Regular4 {

    public static void main(String[] args) {

        int findCount = 0;
        int sameCount = 0;
        String text = "Найти в тексте все email-адреса и посчитать количество адресов, имеющих одно и тоже account name  ( one@gmail.com  one@gmail.com рщршгршгр one@mail.com )";
        //String text = "Найти в тексте все email-адреса и посчитать количество адресов, имеющих одно и тоже account ";

        Pattern pattern = Pattern.compile("(\\w+)(@)([a-z]+\u002e)(com|by|ru|org)");//
        Matcher matcher = pattern.matcher(text);

        while (matcher.find()) {
            findCount++;
            System.out.print(matcher.start() + "\t");
            System.out.print(matcher.end() + "\t");
            System.out.println(matcher.group());
            String s = matcher.group(1);
            System.out.println(s);
            System.out.println(matcher.group(2));
            System.out.println(matcher.group(3));
            System.out.println(matcher.group(4));
            System.out.println(matcher.replaceAll("email"));

            if (s.equals("one")) {
                sameCount++;
            }
        }

        System.out.println("elements found - " + findCount);
        System.out.println("email with one account found " + sameCount + " times.");
    }

}
