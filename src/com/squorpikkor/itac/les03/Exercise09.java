package com.squorpikkor.itac.les03;

import java.util.Random;

/**
 * Created by SquorpikkoR on 19.09.2016.
 */
public class Exercise09 {


    public static void main (String[] args){

        int[] myArray = new int[3];
        int[] mySecondArray = new int[5];
        int[] myMixedArray = new int[myArray.length + mySecondArray.length];

        enterArrayWithRandom(myArray, 10);
        sortArray(myArray);
        printArray(myArray);

        enterArrayWithRandom(mySecondArray, 10);
        sortArray(mySecondArray);
        printArray(mySecondArray);

        mixArraysToNewArray(myArray, mySecondArray, myMixedArray);
        sortArray(myMixedArray);
        printArray(myMixedArray);

    }

    public static void enterArrayWithRandom(int[] array, int maxValue){
        Random random = new Random();
        for(int i = 0; i<array.length; i++){
            array[i] = random.nextInt(maxValue);
        }
    }

    public static void mixArraysToNewArray(int[] array1, int[] array2, int[] mixedArray){
        for(int i = 0; i<array1.length; i++){
            mixedArray[i] = array1[i];
        }
        for(int i = 0; i<array2.length; i++){
            mixedArray[i + array1.length] = array2[i];
        }
    }

    public static void sortArray(int[] array){
        int minValueIndex;
        for(int i = 0; i < array.length; i++){
            minValueIndex = i;
            for(int j = i + 1; j < array.length; j++){
                if(array[j] < array[minValueIndex]){
                    minValueIndex = j;
                }
            }
            int tmp = array[i];
            array[i] = array[minValueIndex];
            array[minValueIndex] = tmp;
        }
    }

    public static void printArray(int[] array){
        System.out.println("----------------------------");
        for(int i = 0; i<array.length; i++){
            System.out.print("mas[" + i + "]=" + array[i] + "; ");
        }
        System.out.println();
    }


}
