package com.squorpikkor.itac.my_stuff.money_assist;

import java.util.Scanner;

public class MenuCase {

    Scanner scanner = new Scanner(System.in);

    public void printCase(String s) {
        System.out.println("Ваш баланс: " + Balance.getBalance());
        System.out.print("Введите сумму > ");
        switch (s) {
            case "add":
                Balance.setBalance(scan("Money added") + Balance.getBalance());
                break;
            case "reduce":
                Balance.setBalance(scan("Money reduced") - Balance.getBalance());
                break;
            }
        }

    public Double scan(String string) {
        Double d = scanner.nextDouble();
        System.out.println(string + " " + d);
        return d;
    }

}

