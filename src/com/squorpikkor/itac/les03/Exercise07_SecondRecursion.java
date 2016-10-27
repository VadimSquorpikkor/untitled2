package com.squorpikkor.itac.les03;

/**
 * Created by SquorpikkoR on 24.09.2016.
 */
public class Exercise07_SecondRecursion {

    static int bestCount = 0;
    static int count = 0;
    static int minValue = 0;
    static int maxValue = 0;
    static int index = 0;
    static int number = 0;
    static int minCount = 1;

    public static void main (String[] args){

        int[] myArray = new int[]{1,4,5};
        //int[] myArray = new int[]{3,2,5,3,4,7,6,4,3,7,5};
        //fillArrayWithRandom(myArray, 10);
        printArray(myArray);
        //System.out.println(exist(5, myArray));
        //System.out.println(recursion(myArray));
        //System.out.println(maxValue(myArray));
        //System.out.println(useRecursion(myArray));
        System.out.println(theValueINeed(myArray));

    }

    public static int theValueINeed(int[] array) {
        minValue(array);
        maxValue(array);
        recursion(array);
        return bestCount;
    }

    //region REC
    /*public static int recursion (int[] array) {
        for(int number = minValue; number <= maxValue; number++ ) {
            //for(int number = minValue; number < maxValue+1;  ) {
            for(int i = index; i <= array.length; i++, index++) {
                if (i == array.length) {
                    if (bestCount < count) {
                        bestCount = count;
                        //count = 0;
                        //minValue = 0;
                        //maxValue = 0;
                    }
                    index = 0;
                    //number--;
                    break;
                }else {
                    if (array[i] == number) {
                        count++;
                        //number++;
                        index++;
                        minValue++;
                        recursion(array);
                        //minValue++;
                    }
                }

            }
            //count = 0;
            //count++;
            //recursion(array);
        }
        return bestCount;
    }*/
    //endregion
    public static int recursion (int[] array) {
        //for(int number = minValue2(array, minCount); number <= maxValue;  ) {
            for(int i = index; i <= array.length; i++, index++) {
               number = minValue2(array, minCount);
                if (i == array.length) {
                    if (bestCount < count) {
                        bestCount = count;
                        }
                    index = 0;
                    break;
                }else {
                    if (array[i] == number) {
                        count++;
                        index++;
                        minCount++;

                        //minValue++;
                        recursion(array);
                    }
                }

            }
        //}
        return bestCount;
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

    public static void maxValue(int[] array) {
        int max = 0;
        for(int k = 0; k < array.length; k++) {
            if (array[k] > max) {
                max = array[k];
            }
        }
        maxValue = max;
    }

    public static void minValue(int[] array) {
        int min = array[0];
        for(int k = 0; k < array.length; k++) {
            if (array[k] < min) {
                min = array[k];
            }
        }
        minValue = min;
    }

    public static int minValue2(int[] array, int i) {
        int min = array[0];
        for (int m = 1; m < 2; m++)
        for(int k = 0; k < array.length; k++) {
            if (array[k] >= min) {
                min = array[k];
            }
        }
        return min;
    }
}
