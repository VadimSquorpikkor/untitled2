package com.squorpikkor.itac.les05;


/**
 * Created by SquorpikkoR on 25.09.2016.
 */
public class CommonFraction {

    private int numerator;      //Числитель
    private int denominator;    //Знаменатель

    //region GETTERS & SETTERS
    public void setNumerator(int numerator) {
        this.numerator = numerator;
    }

    public void setDenominator(int denominator) {
        this.denominator = denominator;
    }

    public int getNumerator() {
        return numerator;
    }

    public int getDenominator() {
        return denominator;
    }
    //endregion

    //region CONSTRUCTORS
    public CommonFraction () {
        numerator = 1;
        denominator = 1;
    }

    public CommonFraction (int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
    }
    //endregion

    public int nod(){                //Нахождение НОД по Евклиду
        int a = Math.abs(numerator);           // Считаю по модулю
        int b = Math.abs(denominator);
        int c;
        if(a>b){
            a = a + b;      //Если числитель больше
            b = (a - b);    //знаменателя, то дробь переворачивается
            a = a - b;      //(исходная дробь не меняется)
        }
        do{                 //Нахождение НОД по Евклиду
            c = b % a;
            if(c == 0){break;}
            b = a;
            a = c;
        }
        while(a > 1);
        return a;
    }

    public int nok() {
        int a = Math.abs(numerator);           // Считаю по модулю
        int b = Math.abs(denominator);

        return a * b / nod();
    }

    public void reduce() {          //Сократить
        numerator = numerator / nod();
        denominator = denominator / nod();
    }

    public CommonFraction add(CommonFraction fraction) {    //Сложение
        int newNum = numerator * fraction.denominator + fraction.numerator * denominator;
        int newDenom = denominator * fraction.denominator;
        CommonFraction newFraction = new CommonFraction(newNum, newDenom);
        newFraction.reduce();
        return newFraction;
    }

    public CommonFraction sub(CommonFraction fraction) {    //Вычитание
        int newNum = numerator * fraction.denominator - fraction.numerator * denominator;
        int newDenom = denominator * fraction.denominator;
        CommonFraction newFraction = new CommonFraction(newNum, newDenom);
        newFraction.reduce();
        return newFraction;
    }

    public CommonFraction mul(CommonFraction fraction) {    //Умножение
        int newNum = numerator * fraction.numerator;
        int newDenom = denominator * fraction.denominator;
        CommonFraction newFraction = new CommonFraction(newNum, newDenom);
        newFraction.reduce();
        return newFraction;
    }

    public CommonFraction div(CommonFraction fraction) {    //Деление
        int newNum = numerator * fraction.denominator;
        int newDenom = denominator * fraction.numerator;
        CommonFraction newFraction = new CommonFraction(newNum, newDenom);
        newFraction.reduce();
        return newFraction;
    }
}

