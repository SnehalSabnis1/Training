package com.assignments;

import java.util.Arrays;

public class SliceArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] givenArray = {1,2,3,4,5};
		System.out.println("Given Array ->" +Arrays.toString(givenArray));
		
		int firstIndex = 1, lastIndex = 3;
		
		int[] arraySlice = Arrays.copyOfRange(givenArray, firstIndex, lastIndex);
			
			System.out.println("Slice Array ->" +Arrays.toString(arraySlice));

	}

	}
