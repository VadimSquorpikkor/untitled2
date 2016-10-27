package by.htp6.les04.array;

import java.util.Random;

public class Array {

	public static void main(String[] args) {

		int[] ar = new int[5];
		// ar = new int[45];
		fillRandom(ar);
		printArray(ar);
	}

	public static void fillRandom(int[] mas) {
		Random rand = new Random();
		for (int i = 0; i < mas.length; i++) {
			mas[i] = rand.nextInt(1000);
		}
	}

	public static void printArray(int[] mas) {
		for (int i = 0; i < mas.length; i++) {
			System.out.print(mas[i] + ", ");
		}
		System.out.println();
	}

	// написать метод, инициализирующй массив с клавиатуры

	public static int sumArray(int[] mas) {
		int sum = 0;
		for (int i = 0; i < mas.length; i++) {
			sum = sum + mas[i];
		}
		return sum;
	}
	// определить количество четных элементов массива


}