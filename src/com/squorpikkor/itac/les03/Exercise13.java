package com.squorpikkor.itac.les03;

/**
 * Created by SquorpikkoR on 20.09.2016.
 */
public class Exercise13 {
    public static void main (String[] args){

        int aSize = 6;
        int[][] myMatrix = new int[aSize][aSize];
        fillTheMatrixWithARule(myMatrix);
        printMatrix(myMatrix);
    }

    public static void fillTheMatrixWithARule(int[][] array){
        for(int i = 0; i<array.length; i++){
            for(int j = 0; j < array.length; j++){
                if(i==j||array.length - 1 - i==j){
                    array[i][j] = 1;
                }else{
                    array[i][j] = 0;
                }
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
