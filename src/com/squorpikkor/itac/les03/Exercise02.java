package com.squorpikkor.itac.les03;

/**
 * Created by SquorpikkoR on 18.09.2016.
 */
public class Exercise02 {
    public static void main (String[] args){
        int[] myArray = new int[10];
        WithArray withArray = new WithArray();
        withArray.enterArrayWithRandom(myArray, 10);
        withArray.printArray(myArray);
        print("Сумма элементов массива: ", calculateTheAmountOf(myArray));
    }

    public static int calculateTheAmountOf(int[] mas) {
        int sum = 0;
        for (int i = 0; i < mas.length; i++) {
            if (mas[i] == i) {
                sum = sum +i;
            }
        }
        return sum;
    }

    public static void print(String text, int value){
        System.out.print(text + value + ".\n");
        System.out.println("------------------------------------------------");
    }


    }
