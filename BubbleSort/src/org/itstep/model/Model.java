package org.itstep.model;

public class Model {

	private int number;
	private int[] array;

	public int[] getArray() {
		return array;
	}

	public void setArray(int[] array) {
		this.array = array;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public Model(int number, int[] array) {
		super();
		this.number = number;
		this.array = array;
	}

	public Model() {
		super();
	}

	

	public int[] getIndexArray() {
		int counter = 0;
		int[] arrayIndex = new int[getIndex()];
		for (int i = 0; i < array.length; i++) {
			if (array[i] == number) {
				arrayIndex[counter] = i;
				counter++;
			}
		}
		return arrayIndex;
	}
	
	int getIndex() {
		int count = 0;
		for (int i = 0; i < array.length; i++) {
			if (array[i] == number) {
				count = count + 1;
			}
		}
		return count;
	}
	
	public String getStringIndex(int [] array) {
		String result = "";
		for (int i = 0; i <array.length ; i++) {
			result = result + array[i] + " ";
		}
		return result;
	}

}
