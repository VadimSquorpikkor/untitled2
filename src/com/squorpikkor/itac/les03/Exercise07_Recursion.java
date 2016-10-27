package com.squorpikkor.itac.les03;

/**
 * Created by SquorpikkoR on 23.09.2016.
 */
public class Exercise07_Recursion {

    static int bestCount = 0;

    public static void main (String[] args){

        //int[] myArray = new int[]{5,4,3};
        int[] myArray = new int[]{3,2,5,3,4,7,6,4,3,7,5};
        //fillArrayWithRandom(myArray, 10);
        printArray(myArray);
        //System.out.println(exist(5, myArray));
        System.out.println(recursion4(0, 0, 0, myArray));
        //System.out.println(maxValue(myArray));
        //System.out.println(useRecursion(myArray));

    }

    public static void printArray(int[] array){
        for(int i = 0; i<array.length; i++){
            System.out.print("[" + i + "]=" + array[i] + "; ");
        }
        System.out.println();
    }

    public static boolean exist(int i, int[] array) {
        for(int k = 0; k < array.length; k++) {
            if (array[k] == i) {
                return true;
            }
        }
        return false;
    }

    public static boolean indexIs(int index, int i, int[] array) {
        for(int k = 0; k < maxValue(array); k++) {
            if (array[index] == i) {
                return true;
            }
        }
        return false;
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

    public static int minValue(int[] array) {
        int min = array[0];
        for(int k = 0; k < array.length; k++) {
            if (array[k] < min) {
                min = array[k];
            }
        }
        return min;
    }

    public static int recursion2(int fInd, int stVal, int cou, int[] array) {
        int index = fInd;
        int startValue = stVal;
        int count = cou;
        for(int number = startValue; number < maxValue(array); number++){
        if (indexIs(index, number, array)) {
            count = count + 1;
            startValue = number + 1;
            if(index == array.length - 1){break;}
            index = index + 1;
            recursion2(index, startValue, count, array);
            }
        }
        return count;
    }

    public static int recursion3(int fInd, int stVal, int cou, int[] array) {
        int index = fInd;
        int startValue = stVal;
        int count = cou;
        for(int i = 0; i <array.length; i++) {
            for (int number = startValue; number < maxValue(array); number++) {
                //if (indexIs(index, number, array)) {
                if (array[index] == number) {
                    count = count + 1;
                    startValue = number + 1;
                    if (index == array.length - 1) {
                        break;
                    }
                    index = index + 1;
                    recursion3(index, startValue, count, array);
                }
            }
            index++;
        }
        return count;
    }


    public static int recursion4(int cnt, int stVal, int ind, int[] array) {
        int startValue = stVal;
        int index = ind;
        int count = cnt;
        //for (int number = minValue(array); number <= maxValue(array); number++) {
        for (int number = startValue; number <= maxValue(array); number++) {
            for(int j = index; j<array.length; j++) {
                if (array[j] == number) {
                    if (index > array.length - 1) {
                        break;
                    }
                    count++;
                    index = j + 1;
                    //count++;
                    startValue = number + 1;
                    recursion4(count, startValue, index, array);
                }
            }
            /*if (count > bestCount) {
                bestCount = count;
                count = 0;
            }*/
        }
    return count;
    }

    public static int useRecursion(int[] array) {
        int a;
        int max = 0;
        for(int i = 0; i < array.length; i++) {
            a = recursion4(0, i, 0, array);
            if (a > max) {
                max = a;
            }
        }
        return max;
    }
}
