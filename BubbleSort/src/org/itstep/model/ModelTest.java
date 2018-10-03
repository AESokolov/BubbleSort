package org.itstep.model;

import static org.junit.Assert.*;

import org.junit.Test;

public class ModelTest {

	@Test
	 public void testGetIndexArray() {
	  int number = 5;
	  int[] array = {1,2,3,4,5,5,6,7,8};
	  Model model = new Model(number, array);
	  int[] res = model.getIndexArray();
	  
	  int[] res1 = {4,5};
	  assertArrayEquals(res1, res);
	
	   // assertEquals(res1, res);
	  
	  
	 }

	 
	 @Test
	 public void testGetIndex() {
	  int number = 5;
	  int[] array = {1,2,3,4,5,5,5,6,7};
	  Model model = new Model(number, array);
	  int res = model.getIndex();
	  assertEquals(3, res);
	  
	  
	  
	 }
	 
	 @Test
	 public void testGetStringIndex() {
	  Model model = new Model();
	  int [] array = {1,2,3,4,5,6,7,8,9,0};
	 String res = model.getStringIndex(array);
	 String res1 = "1 2 3 4 5 6 7 8 9 0 ";
	 assertEquals(res1, res);
	  }
}