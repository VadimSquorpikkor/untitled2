package com.squorpikkor.itac.les03;

import java.util.Random;

/**
 * Created by SquorpikkoR on 20.09.2016.
 */
public class Exercise10 {
    public static void main(String[] args){
        int fraqQuantity = 10;
        int[][] fraqMatrix = new int[2][fraqQuantity];

        enterArrayWithRandom(fraqMatrix, 10);
        printMatrix(fraqMatrix, "Дроби для сортировки");

        obZnamenatel(fraqMatrix);
        printMatrix(fraqMatrix, "Приведение к общему знаменателю");

        sortFraction(fraqMatrix);
        printMatrix(fraqMatrix, "Сортировка по возрастанию");

        minimizeTheFractionArray(fraqMatrix);
        printMatrix(fraqMatrix, "Сокращение дробей");

    }

    public static void enterArrayWithRandom(int[][] array, int maxValue){
        Random random = new Random();
        for(int i = 0; i<array[0].length; i++){
            array[0][i] = random.nextInt(maxValue) + 1;
            array[1][i] = random.nextInt(maxValue) + 1;
        }
    }



    public static void printMatrix(int[][] array, String text){
        System.out.println("---------" + text + "----------");
        for(int i = 0; i < array[0].length; i++){
                System.out.print(array[0][i] + "/" + array[1][i] + " ");
            }
            System.out.println();
        }

    /*public static int maxChislo(int[][] array){
        int max = 1;
        for(int i = 0; i<array[0].length; i++){
            if(array[0][i] > max){
                max = array[0][i];
            }
        }
        return max;
    }*/



    public static int maxTwo(int a, int b){
        int max;
        if(a > b){
            max = a;
        }else{max = b;}
        return max;
    }

    public static int maxChislo(int a, int b, int c, int d){
        return maxTwo(maxTwo(a,b),maxTwo(c,d));
    }

    public static void obZnamenatel(int[][] array){
        int maxChislo;
        for(int i = 0; i < array[0].length - 1; i+=2){
            maxChislo = maxChislo(array[0][i],array[0][i+1],array[1][i],array[1][i+1]);
        }
    }

    /*public static void obZnamenatel(int[][] array){
        int znamenatel = 1;
        for(int i = 0; i<array[1].length; i++){     //Нахожу чему равен общий знаменатель
            znamenatel *= array[1][i];
        }
        for(int i = 0; i<array[1].length; i++){     //Числитель при таком знаменателе
            array[0][i] = (array[0][i] * znamenatel)/array[1][i];
        }
        for(int i = 0; i<array[1].length; i++){     //Присваиваю знаменатель дроби
            array[1][i] = znamenatel;
        }
    }
*/
    public static void sortFraction(int[][] array){
        int minValueIndex;
        for(int i = 0; i < array[0].length; i++){
            minValueIndex = i;
            for(int j = i + 1; j < array[0].length; j++){
                if(array[0][j] < array[0][minValueIndex]){
                    minValueIndex = j;
                }
            }
            int tmp1 = array[0][i];
            //int tmp2 = array[1][i];
            array[0][i] = array[0][minValueIndex];
            //array[1][i] = array[1][minValueIndex];
            array[0][minValueIndex] = tmp1;
            //array[1][minValueIndex] = tmp2;
        }
    }

    public static int nod(int ch, int zn){
        int a = ch;     // делаю копию дроби, чтоб
        int b = zn;     // не портить исходную
        int c;
        if(a>b){
            a = a + b;      //Если числитель больше
            b = (a - b);    //знаменателя, то дробь переворачивается
            a = a - b;      //(исходная дробь не меняется)
        }
        do{                 //Нахождение НОД по Евклиду
            c = b % a;
            if(c == 0){break;}
            b = a;
            a = c;
        }
        while(a > 1);
        return a;
    }

    public static void minimizeTheFractionArray(int[][] array){
        int nod;
        for(int i = 0; i < array[0].length; i++){
            nod = nod(array[0][i],array[1][i]);
            array[0][i] = array[0][i]/nod;
            array[1][i] = array[1][i]/nod;
        }
    }
}
