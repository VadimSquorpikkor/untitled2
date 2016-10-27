package com.squorpikkor.itac.les03;

import java.util.Random;

/**
 * Created by SquorpikkoR on 20.09.2016.
 */
public class Exercise07 {
    public static void main (String[] args){

        int[] myArray = new int[]{3,2,5,3,4,7,6,4,3,7,5};
        //fillArrayWithRandom(myArray, 10);
        printArray(myArray);

        System.out.println("Количество лишних элементов: " + minNumberCount(myArray));
    }

    public static void fillArrayWithRandom(int[] array, int maxValue){
        Random random = new Random();
        for(int i = 0; i<array.length; i++){
            array[i] = random.nextInt(maxValue);
        }
    }

    public static int minNumberCount(int[] array){
        int minCount = array.length;
        int count = 0;
        int value = 1;
        int rememberTheNumber = 0;
        for(int j = 0; j < array.length - 1; j++){
            for(int i = j; i < array.length - 1; i++){
                if(value + 1 > array.length - i){break;}
                if(array[i] >= array[i+value]){
                    i -= 1;
                    count += 1;
                    value += 1;
                }else{
                    i = i + value - 1;
                    value = 1;
                }
            }
            count = count + j;
            System.out.print(count+" ");
            if(count<minCount){
                minCount = count;
                rememberTheNumber = j;
            }
            count = 0;
            value = 1;
        }
//////////Этот блок только для вывода индексов (необязательно)////////
        System.out.println();                                       //
        System.out.print("Индексы лишних элементов: ");             //
        for(int i = 0; i < rememberTheNumber; i++){                 //
            System.out.print("[" + i + "] ");                       //
        }                                                           //
        value = 1;                                                  //
        for(int i = rememberTheNumber; i < array.length - 1; i++){  //
            if(value + 1 > array.length - i){break;}                //
            if(array[i] >= array[i+value]){                         //
                System.out.print("[" + (i+value) + "] ");           //
                i -= 1;                                             //
                value += 1;                                         //
            }else{                                                  //
                                                                    //
                i = i + value - 1;                                  //
                value = 1;                                          //
            }                                                       //
        }                                                           //
        System.out.println();                                       //
//////////////////////////////////////////////////////////////////////
        return minCount;
    }

    public static void printArray(int[] array){
        for(int i = 0; i<array.length; i++){
            System.out.print("[" + i + "]=" + array[i] + "; ");
        }
        System.out.println();
    }
}
