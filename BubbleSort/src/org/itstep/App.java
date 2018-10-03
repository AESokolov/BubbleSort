package org.itstep;

import java.util.Arrays;

public class App {

	public static void main(String[] args) {
		
		int array[] = { 2, 3, 4, 6, 7, 8, 1, 9, 4 };
		System.out.println(Arrays.toString(array));
		
		System.out.print("[");
		for(int i=0; i < array.length; i++) {
			System.out.print(array[i]);
			if(i != array.length-1) {
				System.out.print(", ");
			}
		}
		System.out.print("]");

	}

}
