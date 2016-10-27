package com.squorpikkor.itac.les03;

/**
 * Created by SquorpikkoR on 19.09.2016.
 */
public class Exercise08 {

    public static void main (String[] args){

        int[] myArray = new int[4];
        int[] mySecondArray = new int[8];

        //int[] mdArray = new int[myArray.length+mySecondArray.length];
        int valueOfK = 3;
        WithArray withArray = new WithArray();
        withArray.enterArrayWithRandom(myArray, 10);
        withArray.printArray(myArray);

        withArray.enterArrayWithRandom(mySecondArray, 10);
        withArray.printArray(mySecondArray);
        withArray.printArray(mixTheArrays(myArray, mySecondArray, valueOfK));

    }

    public static int[] mixTheArrays(int[] array1, int[] array2, int value){
        int[] mixedArray = new int[array1.length + array2.length];
        for(int i = 0; i < value; i++){
                mixedArray[i] = array1[i];
            }
        for(int i = 0; i < array2.length; i++){
            mixedArray[i + value] = array2[i];
        }
        for(int i = 0; i < array1.length - value; i++){
            mixedArray[i + array2.length + value] = array1[i + value];
        }
        return mixedArray;
    }


}
