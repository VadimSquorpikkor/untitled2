package com.squorpikkor.itac.les03;

/**
 * Created by SquorpikkoR on 20.09.2016.
 */
public class Exercise11 {
    public static void main (String[] args){

        int aSize = 6;
        int[][] myMatrix = new int[aSize][aSize];
        fillTheMatrixWithARule(myMatrix);
        printMatrix(myMatrix);
    }

    public static void fillTheMatrixWithARule(int[][] array){
        for(int i = 0; i<array.length; i += 2){
            for(int j = 0; j < array.length; j++){
                array[i][j] = j + 1;
                array[i + 1][array.length - j-1] = j + 1;
            }
        }
    }

    public static void printMatrix(int[][] array){
        for(int i = 0; i<array.length; i++){
            for(int j = 0; j < array.length; j++){
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }
}
