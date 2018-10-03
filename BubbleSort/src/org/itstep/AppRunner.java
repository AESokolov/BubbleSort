package org.itstep;

import java.util.Arrays;

public class AppRunner {

	public static void main(String[] args) {

		int array[] = { 2, 3, 4, 6, 7, 8, 1, 9, 4 };
		System.out.println(Arrays.toString(array));

		for (int i = 0; i < array.length - 1; i++) {
			for(int j = 0; j < array.length - 1 - i; j++) {
			conditionalSwap(array, j);
			}
		}
		System.out.println(Arrays.toString(array));
	}

	private static void conditionalSwap(int[] array, int i) {
		if(array[i] > array[i+1]) {
		swap(array, i);
		}
	}

	private static void swap(int[] array, int i) {
		int temp = array[i];
		array[i] = array[i + 1];
		array[i + 1] = temp;
	}
}