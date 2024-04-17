package com;

public class SwapWithoutVar {

	public static void main(String[] args) {
			
		int a = 23;
		int b = 54;
		System.out.println("Before Swapping");
		System.out.println("A="+a);
		System.out.println("B="+b);
		
		a = a + b;
		b = a - b;
		a = a - b;
		System.out.println("After Swapping");
		System.out.println("A="+a);
		System.out.println("B="+b);
		
	}

}
