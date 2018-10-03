package org.itstep;

import java.util.Arrays;

public class App1 {

	public static void main(String[] args) {
		int array[] = { 2, 3, 4, 6, 7, 3, 1, 9, 4 };
		System.out.println(Arrays.toString(array));

		int number = 3;
		for (int i = 0; i < array.length; i++) {
			if (array[i] == number) {
				System.out.println(i);
			}

		}
	}
	
	

}
