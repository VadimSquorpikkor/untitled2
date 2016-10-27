package com.squorpikkor.itac.les03;

/**
 * Created by SquorpikkoR on 19.09.2016.
 */
public class Exercise03 {
    public static void main (String[] args){
        int[] myArray = new int[10];
        WithArray withArray = new WithArray();
        withArray.enterArrayWithRandom(myArray, 10);
        withArray.printArray(myArray);
        print("Процент нечетных чисел: ", findThePercentageOf(myArray));
    }

    public static double findThePercentageOf(int[] mas) {
        double sum = 0;
        for (int i = 0; i < mas.length; i++) {

            if (mas[i]%2!=0) {
                sum = sum +1;
            }
        }
        return sum/mas.length*100;
    }

    public static void print(String text, double value){
        System.out.print(text + String.format("%.1f", value) + ".\n");
        System.out.println("------------------------------------------------");
    }
}
