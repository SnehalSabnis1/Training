package com.assignments;

import java.util.Arrays;

public class SliceArrayDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] givenArray = {1,2,3,4,5};
		System.out.println("Given Array ->" +Arrays.toString(givenArray));
		
		int firstIndex = 2, lastIndex = 4;
		
		int[] arraySlice = new int[lastIndex -firstIndex];
		
		for(int i=0;i<arraySlice.length;i++) {
			arraySlice[i] = givenArray[firstIndex + i];
			
			System.out.println("Slice Array ->" +Arrays.toString(arraySlice));
		}
	}

}
