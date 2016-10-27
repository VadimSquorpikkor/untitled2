package com.squorpikkor.itac.les03;

import java.util.Random;
import java.util.Scanner;

/**
 * Created by SquorpikkoR on 17.09.2016.
 */
public class WithArray {
    public static void main(String[] args) {
        int[] mas = new int[10];
        enterArrayWithRandom(mas, 300);
        printArray(mas);
        findMaxElementAndIndex(mas);
        sortArray(mas);
        printArray(mas);
    }

    public static void enterArrayFromConsole(int[] mas) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < mas.length; i++) {
            System.out.print("ar[" + i + "]=>");
            mas[i] = sc.nextInt();
        }
    }

    public static void enterArrayWithRandom(int[] mas, int maxValue) {
        Random rand = new Random();
        for (int i = 0; i < mas.length; i++) {
            mas[i] = rand.nextInt(maxValue);
        }

    }

    public static void printArray(int[] mas) {
        System.out.println("------------------------------------------------");
        for (int i = 0; i < mas.length; i++) {
        System.out.print("mas[" + i + "]=" + mas[i] + "; ");
        }
        System.out.println();
        System.out.println("------------------------------------------------");
    }

    public static void findMaxElementAndIndex(int[] mas){
        if(mas.length == 0){
            return;
        }

        int max;
        int index;

        max = mas[0];
        index = 0;
        for(int i = 1; i < mas.length; i++){
            if(max<mas[i]){
                max = mas[i];
                index = i;
            }
        }
        System.out.println("Максимальный элемент " + max + " расположен на позиции" + index + ".");
    }

    public static int[] sortArray(int[] list) {
        for(int i = 0; i < list.length - 1; i++) {
            int min_i = list[i];
            int min_j = list[i + 1];
            int minIndex = i + 1;
            for(int j = i + 1; j < list.length; j++) {
                if (list[j] < min_j) {
                    min_j = list[j];
                    minIndex = j;
                }
            }
            if (min_j < min_i) {
                list[i] = min_j;
                list[minIndex] = min_i;
            }

        }
        return list;
    }

}
