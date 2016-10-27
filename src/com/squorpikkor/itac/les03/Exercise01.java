package com.squorpikkor.itac.les03;

/**
 * Created by SquorpikkoR on 18.09.2016.
 */
public class Exercise01 {

    public static void main (String[] args){
        //int numCount = 0;
        int[] myArray = new int[10];
        int numberIWishToFind = 0;
        WithArray withArray = new WithArray();
        withArray.enterArrayWithRandom(myArray, 10);
        withArray.printArray(myArray);
        printArray(createArrayForIndexesOfNumber(myArray, numberIWishToFind), numberIWishToFind);

    }

    public static int[] createArrayForIndexesOfNumber(int[] mas, int numberToFind){
        int j = 0;
        int numCount = 0;                           //Сколько будет чисел в массиве
        int[] arrForValue = new int[mas.length];    //Промежуточный массив для индексов размером
        for(int i = 0; i < mas.length; i++){        //с массив полученый для проверки.
            if(mas[i] == numberToFind){
                numCount = numCount + 1;
                arrForValue[j] = i;
                j++;
            }
        }

        int[] arrayForIndexesOfNumber = new int[numCount];  //Итоговый массив для индексов размером
                                                            //равным кол-ву индексов.
        for(int i = 0; i < numCount; i++){                  //Прекидываю данные из промежуточного
            arrayForIndexesOfNumber[i] = arrForValue[i];    //в итоговый массив.
        }
        return arrayForIndexesOfNumber;
    }

    public static void printArray(int[] mas, int value){
        System.out.print("Число " + value + " находится на позиции: ");
        for (int i = 0; i < mas.length; i++) {
            System.out.print(mas[i] + " ");
        }
        System.out.println();
        System.out.println("------------------------------------------------");
    }
}
