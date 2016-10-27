package com.squorpikkor.itac.my_stuff.money_assist;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 * Created by SquorpikkoR on 13.10.2016.
 */
public class Main {

    public static void main(String[] args) {

        Balance balance = new Balance();
        CommandProvider command = new CommandProvider();
        AddMoney addMoney = new AddMoney();
        ReduceMoney reduceMoney = new ReduceMoney();
        MenuCase menuCase = new MenuCase();

        while(true){
            System.out.println("1. add");
            System.out.println("2. reduce");
            System.out.println("3. display");
            System.out.print("> ");
            menuCase.printCase(stringFromScanner());

            //command.getTheCommand(stringFromScanner());
            //String s = command.getTheCommand(stringFromScanner());
        //System.out.println(s);
        }

    }

    public static void scanAndRead() {
        System.out.println(stringFromScanner());
    }

    public static String stringFromScanner(){
        Scanner scanner = new Scanner(System.in);
        String s =  scanner.next();
        return s;
    }

}
