package com.squorpikkor.itac.les03;

/**
 * Created by SquorpikkoR on 19.09.2016.
 */
public class Exercise06 {
    public static void main (String[] args){
        int[] myArray = new int[10];
        WithArray withArray = new WithArray();
        withArray.enterArrayWithRandom(myArray, 10);
        withArray.printArray(myArray);
        withArray.printArray(turnTheArray(myArray));

    }

    public static int[] turnTheArray(int[] mas){
        for(int i = 0; i < mas.length/2; i++){  //Для массива с нечетным кол-вом элементов
                                                //средний элемент не используется

            mas[i] = mas[mas.length-i-1] + mas[i];               //Перестановка элементов
            mas[mas.length-i-1] = mas[i] - mas[mas.length-i-1];  //массива. Можно было бы делать через третью
            mas[i] = mas[i] - mas[mas.length-i-1];               //переменную, но не хотелось вводить лишнюю,
        }                                                        //если можно обойтись и без неё.
        return mas;
    }
}
