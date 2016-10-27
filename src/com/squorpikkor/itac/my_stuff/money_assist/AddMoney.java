package com.squorpikkor.itac.my_stuff.money_assist;

 //Created by SquorpikkoR on 13.10.2016.

public class AddMoney implements Command{


    public String value = "hjfjfjfj";

    public void addMoney(float money, Balance balance) {
        balance.setBalance(balance.getBalance() + money);
        System.out.println("Баланс составляет " + balance.getBalance());
    }

    public void doMoney() {
        System.out.println("qqqqqqq");
    }


    public AddMoney() {
        System.out.println("Баланс составляет ");
        /*
        System.out.println("Сколько добавить?");
        System.out.print("> ");*/
    }
}
