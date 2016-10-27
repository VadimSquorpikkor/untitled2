package com.squorpikkor.itac.les03;

/**
 * Created by SquorpikkoR on 24.09.2016.
 */
public class Exercise07_Third {

    static int index = 0;
    static int bestCount = 0;
    static int count = 0;
   //static int firstNumber = 0;
   //static int startWithIndex = 0;


    public static void main (String[] args){

        //int[] myArray = new int[]{6,4,3};
        int[] myArray = new int[]{3,2,5,3,4,7,6,4,3,7,5};
        //fillArrayWithRandom(myArray, 10);
        printArray(myArray);
        methodMethod(myArray, 0);
        //System.out.println(valueFromSortedArray(myArray, 1));

    }

    /*public static void recursion(int[] array) {
        for(int number = 0; number <= maxValue(array); number++) {
            if(index==array.length){
                if(bestCount < count){
                    bestCount = count;
                }
            }else {
                if (existInArray(number, index, array)) {
                    count++;
                    recursion(array);
                }
            }
        }
    }

    public static void methodMethod(int[] array) {
        int count = 0;
        recursion(array);
        System.out.println(count);
    }*/

    /*public static void methodMethod(int[] array) {
        int count = 0;
        for(int number = 0; number <= maxValue(array); number++) {
            if(index==array.length){
                if(bestCount < count){
                    bestCount = count;
                }

            }else {
                if (existInArray(number, index, array)) {
                    count++;
                }
            }
        }
        System.out.println(count);
    }*/

    public static void methodMethod(int[] array, int firstNum) {
        int fNum = firstNum + 1;
        //int count = 0;
        for(int number = fNum; number <= maxValue(array); number++) {
            if(index==array.length){
                if(bestCount < count){
                    bestCount = count;
                }
                index--;
                count--;

            }else {
                if (existInArray(number, index, array)) {
                    System.out.print(number + " " + count);
                    count++;
                    //startWithIndex = index;
                    //firstNumber++;
                    if (number != maxValue(array)) {
                        methodMethod(array, number);
                    }else{index--;}
                }
                if (number == maxValue(array)) {
                    index --;}
            }
        }
        System.out.println();
        System.out.println(bestCount);
    }

    public static boolean existInArray(int i, int firstInd, int[] array) {
        for(int k = firstInd; k < array.length; k++) {
            if (array[k] == i) {
                index = k + 1;
                return true;
            }
        }
        return false;
    }



    public static void printArray(int[] array){
        for(int i = 0; i<array.length; i++){
            System.out.print("[" + i + "]=" + array[i] + "; ");
        }
        System.out.println();
    }

    public static void printArray(String text, int[] array){
        for(int i = 0; i<array.length; i++){
            System.out.print(text + "[" + i + "]=" + array[i] + "; ");
        }
        System.out.println();
    }

    public static int maxValue(int[] array) {
        int max = 0;
        for(int k = 0; k < array.length; k++) {
            if (array[k] > max) {
                max = array[k];
            }
        }
        return max;
    }


}
