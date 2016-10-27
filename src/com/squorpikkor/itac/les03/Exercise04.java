package com.squorpikkor.itac.les03;

/**
 * Created by SquorpikkoR on 19.09.2016.
 */
public class Exercise04 {
    public static void main (String[] args){
        int[] myArray = new int[10];
        WithArray withArray = new WithArray();
        withArray.enterArrayWithRandom(myArray, 10);
        withArray.printArray(myArray);
        print(hitTheRoadZero(myArray));

    }

    public static int[] hitTheRoadZero(int[] mas){
        int j = 0;
        int numCount = 0;
        int[] arrForValue = new int[mas.length];
        for(int i = 0; i < mas.length; i++){
            if(mas[i] != 0){
                numCount = numCount + 1;
                arrForValue[j] = i;
                j++;
            }
        }

        int[] arrayWithoutZero = new int[numCount];
        for(int i = 0; i < numCount; i++){
            arrayWithoutZero[i] = mas[arrForValue[i]];
        }
        return arrayWithoutZero;
    }

    public static void print(int[] mas) {
                for (int i = 0; i < mas.length; i++) {
            System.out.print("mas[" + i + "]=" + mas[i] + "; ");
        }
        System.out.println();
        System.out.println("------------------------------------------------");
    }
}
