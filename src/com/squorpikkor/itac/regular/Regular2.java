package com.squorpikkor.itac.regular;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regular2 {
    public static boolean test(String testString) {
        Pattern p = Pattern.compile(".+\\.(com|ua|ru)");
        Matcher m = p.matcher(testString);
        return m.matches();
    }

    public static void main(String[] args) {
        System.out.println(test("trololo.com"));     //true
        System.out.println(test("trololo.ua "));     //false
        System.out.println(test("trololo.ua"));      //true
        System.out.println(test("trololo/ua"));      //false
        System.out.println(test("i love java because it is cool.ru"));      //true
        System.out.println(test("BACON.ru"));        //true
        System.out.println(test("BACON.de"));        //false
    }

}
