package com.squorpikkor.itac.regular;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


 //Created by SquorpikkoR on 23.10.2016.

public class Regular5 {
    public static void main(String[] args) throws IOException {
        System.out.print("enter your regex: ");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String regex = reader.readLine();
        Pattern pattern = Pattern.compile(regex);
        System.out.print("Enter input string to search: ");
        String text = reader.readLine();
        Matcher matcher = pattern.matcher(text);

        //System.out.println("I found the text " + matcher.group() + " starting at index and ending at index.");
        System.out.println(matcher.find());
        System.out.println("I found the text " + text + " starting at index " + matcher.start() + " and ending at index " + matcher.end() + ".");
        //System.out.println(matcher.group());

    }

}
